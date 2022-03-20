package com.ahasan.arraysdemo.java11;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommandRequest {
	private Integer commandId;
	private String apiType;
	private String endpoint;
	private String requestType;
	private Map<String, Object> payload;

	public Integer getCommandId() {
		return commandId;
	}

	public void setCommandId(Integer commandId) {
		this.commandId = commandId;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Map<String,Object> getPayload(){
		return payload;
	}

	public void setPayload(Map<String,Object> payload){
		this.payload=payload;
	}
}