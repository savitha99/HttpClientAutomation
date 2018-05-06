package com.http.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.http.base.TestBase;
import com.http.client.RestClient;
import com.qa.data.Comments;
import com.qa.data.Posts;
import com.qa.data.Users;



public class PostAPITest extends TestBase {
	

private	String url;
private	RestClient restClient;
private	CloseableHttpResponse closebaleHttpResponse;
	
		
	@Test
	public void usersAPITest() throws JsonGenerationException,
			JsonMappingException, IOException {
		String serviceUrl = "users";
		url = setUp(serviceUrl);
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		// jackson API:
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("morpheus", "leader"); // expected users obejct

		// object to json file:
		mapper.writeValue(new File(System.getProperty("user.dir")
				+ "/src/main/java/com/qa/data/users.json"), users);

		// java object to json in String:
		String usersJsonString = mapper.writeValueAsString(users);
		System.out.println(usersJsonString);

		closebaleHttpResponse = restClient
				.post(url, usersJsonString, headerMap); // call the API

		// validate response from API:
		// 1. status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, 201,"Status code is not 201");
	}
	
	@Test
	public void commentsAPITest() throws JsonGenerationException,
			JsonMappingException, IOException {
		String serviceUrl = "commentUrl";
		url =setUp(serviceUrl);
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		// jackson API:
		ObjectMapper mapper = new ObjectMapper();
		Comments comments = new Comments("morpheus", "leader"); // expected
																// users obejct

		// object to json file:
		mapper.writeValue(new File(System.getProperty("user.dir")
				+ "/src/main/java/com/qa/data/comments.json"), comments);

		// java object to json in String:
		String usersJsonString = mapper.writeValueAsString(comments);
		System.out.println(usersJsonString);

		closebaleHttpResponse = restClient
				.post(url, usersJsonString, headerMap); // call the API

		// validate response from API:
		// 1. status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, 201 ,"Status code is not 201");
	}

	@Test
	public void postsAPITest() throws JsonGenerationException,
			JsonMappingException, IOException {
		String serviceUrl = "posts";
		url =setUp(serviceUrl);
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		// jackson API:
		ObjectMapper mapper = new ObjectMapper();
		Posts posts = new Posts("morpheus", "leader"); // expected users obejct

		// object to json file:
		mapper.writeValue(new File(System.getProperty("user.dir")
				+ "/src/main/java/com/qa/data/posts.json"), posts);

		// java object to json in String:
		String usersJsonString = mapper.writeValueAsString(posts);
		System.out.println(usersJsonString);

		closebaleHttpResponse = restClient
				.post(url, usersJsonString, headerMap); // call the API

		// validate response from API:
		// 1. status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, 201,"Status code is not 201");
	}
	
	
	
	
	
	
	
	
	
	
	
}
