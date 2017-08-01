package com.inmarsat.esb;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {
	private static final Logger logger = Logger.getLogger(Utility.class);

	/**
	 * Constructor
	 */
	private Utility() {
	}

	/**
	 * @param object
	 * @return JsonNode
	 * 
	 * converts object to JsonNode
	 */
	public static JsonNode objectToJson(Object object) {
		return new ObjectMapper().convertValue(object, JsonNode.class);
	}

	/**
	 * @param node
	 * @return String
	 * 
	 * converts JsonNode to String
	 */
	public static String jsonToString(JsonNode node) {
		return node.toString();
	}

	/**
	 * @param payload
	 * 
	 * POSTs String 
	 */
	public static void post(String payload) {
		BasicConfigurator.configure();
		StringEntity entity = new StringEntity(payload, ContentType.APPLICATION_FORM_URLENCODED);

		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(
				"http://mountebank-vs-imposter-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/CRMService/CurrencyConversion");
		request.setEntity(entity);
		HttpResponse response = null;
		try {
			response = httpClient.execute(request);
		} catch (ClientProtocolException e) {
			logger.error("ClientProtocolException", e);
		} catch (IOException e) {
			logger.error("IOException", e);
		}
		try {
		int responseCode = response.getStatusLine().getStatusCode();
		logger.info(responseCode);
		} catch (NullPointerException e) {
			logger.error("NullPointerException", e);
		}	
		
	}

}
