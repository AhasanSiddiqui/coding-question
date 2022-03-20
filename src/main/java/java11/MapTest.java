package com.ahasan.arraysdemo.java11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest{
	public static void main(String[] args) throws JsonProcessingException{
		Map<String,Object> payload=new HashMap<>();

		payload.put("111" ,"Ahasan");
		payload.put("112" ,"Siddiqui");
		payload.put("113" ,"Priyanka");
		payload.put("114" ,"Mishra");


		//List<String> str=List.of("Alok" ,"Harika" ,"Sateesh");
		String []str={"Alok" ,"Harika" ,"Sateesh"};
		payload.put("115" ,str);
		System.out.println( List.of(payload.get("115")));

		ObjectMapper mapper=new ObjectMapper();
		CommandRequest reqBody=new CommandRequest();
		reqBody.setApiType("Curl");
		reqBody.setCommandId(14);
		reqBody.setRequestType("POST");
		reqBody.setApiType("ABC");
		reqBody.setPayload(payload);
		String requestBody=mapper.writeValueAsString(reqBody.getPayload());
		System.out.println(requestBody);
	}
}
