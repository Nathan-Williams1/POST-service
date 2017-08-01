package com.inmarsat.esb;

import com.fasterxml.jackson.databind.JsonNode;

public class App {
	/**
	 * main method
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		CurrencyConversion conversion = new CurrencyConversion();
		conversion.setName("this");
		conversion.setOriginalCurrency("CAD");
		conversion.setConvertCurrency("USD");
		conversion.setConversionRate("1.223");
		conversion.setEffectiveDate("1/1/2001");
		JsonNode node = Utility.objectToJson(conversion);
		String payload = Utility.jsonToString(node);
		Utility.post(payload);
	}
}
