package org.openapitools.codegen.utils;

public enum DecimalType {
	CURRENCY("Currency"),
	PERCENTAGE("Percentage");

	private final String value;

	DecimalType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
