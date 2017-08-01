package com.inmarsat.esb;

public class CurrencyConversion {
	private String name;
	private String originalCurrency;
	private String convertCurrency;
	private String conversionRate;
	private String effectiveDate;

	public CurrencyConversion() {// Constructor does nothing, because the class is a simple object meant to hold data
	}

	/**
	 * name accessor
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name mutator
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * originalCurrency accessor
	 * 
	 * @return originalCurrency
	 */
	public String getOriginalCurrency() {
		return originalCurrency;
	}

	/**
	 * originalCurrency mutator
	 * 
	 * @param originalCurrency
	 */
	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

	/**
	 * convertCurrency accessor
	 * 
	 * @return convertCurrency
	 */
	public String getConvertCurrency() {
		return convertCurrency;
	}

	/**
	 * convertCurrency mutator
	 * 
	 * @param convertCurrency
	 */
	public void setConvertCurrency(String convertCurrency) {
		this.convertCurrency = convertCurrency;
	}

	/**
	 * conversionRate accessor
	 * 
	 * @return conversionRate
	 */
	public String getConversionRate() {
		return conversionRate;
	}

	/**
	 * conversionRate mutator
	 * 
	 * @param conversionRate
	 */
	public void setConversionRate(String conversionRate) {
		this.conversionRate = conversionRate;
	}

	/**
	 * effectiveDate accessor
	 * 
	 * @return effectiveDate
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * effectiveDate mutator
	 * 
	 * @param effectiveDate
	 */
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

}
