package com.vonage.sample.serversdk.springboot.whatsapp;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vonage.client.Jsonable;
import com.vonage.client.JsonableBaseObject;

public class AlienLocationRequest extends JsonableBaseObject {

	public enum AlienType {
		TYPE_1,
		TYPE_2,
		TYPE_3;

		@JsonCreator
		public static AlienType fromString(String value) {
			if (value == null) return null;
			return AlienType.valueOf(value.replace(" ", "_").toUpperCase());
		}

		@JsonValue
		@Override
		public String toString() {
			return name().replace("_", " ").toLowerCase();
		}
	}

	public enum AlienNumber {
		SMALL,
		MEDIUM,
		LARGE;

		@JsonCreator
		public static AlienNumber fromString(String value) {
			if (value == null) return null;
			return AlienNumber.valueOf(value.toUpperCase());
		}

		@JsonValue
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}

	protected AlienLocationRequest() {
	}

	@JsonAnySetter protected Map<String, Object> unknownProperties;

	@JsonProperty("latitude") protected Double latitude;
	@JsonProperty("longitude") protected Double longitude;
	@JsonProperty("type") protected AlienType type;
	@JsonProperty("number") protected AlienNumber number;

	public static AlienLocationRequest fromJson(String json) {
		return Jsonable.fromJson(json);
	}



	public Map<String, Object> getUnknownProperties() {
		return unknownProperties;
	}



	public Double getLatitude() {
		return latitude;
	}



	public Double getLongitude() {
		return longitude;
	}



	public AlienType getType() {
		return type;
	}



	public AlienNumber getNumber() {
		return number;
	}
}
