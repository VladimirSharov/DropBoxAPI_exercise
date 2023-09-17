package DropBoxClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

public class DropBoxConnector {
	
	private String queryResult;
	
	public void sendRequest(String str) throws URISyntaxException, IOException {	
		URI redirectURI= new URI("http://localhost:8082/TIES4560-task-2-2/"); //any url to where you want to redirect the user
		String appKey = "";
		URI uri=new URI("https://www.dropbox.com/oauth2/authorize");
		StringBuilder requestUri=new StringBuilder(uri.toString());
		requestUri.append("?client_id=");
		requestUri.append(URLEncoder.encode(appKey,"UTF-8"));
		requestUri.append("&response_type=");
		requestUri.append(URLEncoder.encode("code","UTF-8"));
		requestUri.append("&redirect_uri="+redirectURI.toString());
		
		URL requestUrl=new URL(requestUri.toString());
		System.out.println("RequestURL : " + requestUrl.toString());
		
		queryResult=requestUri.toString();
	}
}
