package com.adp.portal.rallymetrics.util;

import java.net.URI;
import java.net.URISyntaxException;

import com.rallydev.rest.RallyRestApi;

public class RestApiFactory {

	// Specify your Rally server
	private static final String SERVER = "https://rally1.rallydev.com";

	// Specify your WSAPI version
	private static final String WSAPI_VERSION = "v2.0";

	// Specify your Rally username
	private static final String USERNAME = "";

	// Specify your Rally password
	private static final String PASSWORD = "";

	// Specify your Rally api key
	private static final String API_KEY = "_yZ7Lu3WT6ucPMywpbSuJG4MBxUDyu8b8obPT8g";

	// If using a proxy specify full url, like http://my.proxy.com:8000
	private static final String PROXY_SERVER = "http://usproxy.es.oneadp.com:8080";

	// If using an authenticated proxy server specify the username and password
	private static final String PROXY_USERNAME = "ES\\TorresR";
	private static final String PROXY_PASSWORD = "ADPadp11";

	public static RallyRestApi getRestApi() {
		RallyRestApi restApi = null;

		try {
			if (API_KEY != null && !API_KEY.equals("")) {
				restApi = new RallyRestApi(new URI(SERVER), API_KEY);
			} else {
				restApi = new RallyRestApi(new URI(SERVER), USERNAME, PASSWORD);
			}
			if (PROXY_SERVER != null) {
				URI uri = new URI(PROXY_SERVER);
				if (PROXY_USERNAME != null) {
					restApi.setProxy(uri, PROXY_USERNAME, PROXY_PASSWORD);
				} else {
					restApi.setProxy(uri);
				}
			}
			
			restApi.setWsapiVersion(WSAPI_VERSION);
		
		} catch (URISyntaxException e) {
			System.out.println("Error getting Rest API: " + e);
		}
		
		return restApi;
	}
}
