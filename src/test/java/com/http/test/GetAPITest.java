package com.http.test;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.http.base.TestBase;
import com.http.client.RestClient;

public class GetAPITest extends TestBase{
	
	private	String url;
	private	RestClient restClient;
	private	CloseableHttpResponse closebaleHttpResponse;

	@Test
	public void postsAPITest() throws JsonGenerationException, JsonMappingException, IOException{
		String serviceUrl="postUrl";
		url=setUp(serviceUrl);
		restClient = new RestClient();
		closebaleHttpResponse = restClient.get(url);

		//a. Status Code:
				int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
				System.out.println("Status Code--->"+ statusCode);
				
				Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

		
	}
	@Test
	public void commentsAPITest() throws JsonGenerationException, JsonMappingException, IOException{
		String serviceUrl="commentUrl";
		url=setUp(serviceUrl);
		restClient = new RestClient();
		closebaleHttpResponse = restClient.get(url);

		//a. Status Code:
				int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
				System.out.println("Status Code--->"+ statusCode);
				
				Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

		
	}
	@Test
	public void UsersAPITest() throws JsonGenerationException, JsonMappingException, IOException{
		String serviceUrl="users";
		url=setUp(serviceUrl);
		restClient = new RestClient();
		closebaleHttpResponse = restClient.get(url);

		//a. Status Code:
				int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
				System.out.println("Status Code--->"+ statusCode);
				
				Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

		
	}
	
}
