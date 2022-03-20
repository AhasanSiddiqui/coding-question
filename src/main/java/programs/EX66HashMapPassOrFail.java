/**
 * input=("ram":80.5,"prakash":70.4) (hashmap<string,float> ) 
 * output=("ram":PASS,"prakask":PASS) (hashmap<string,string>)
 * if float value is above 60 then PASS else FAIL 
 */

package com.ahasan.arraysdemo.programs;

import java.util.HashMap;
import java.util.Map;

public class EX66HashMapPassOrFail {

	public static void main(String[] args) {
		Map<String, Float> input = new HashMap<String, Float>();
		input.put("ram", 80.5f);
		input.put("prakash", 70.4f);
		input.put("Mullai", 40f);

		Map<String, String> output = new HashMap<String, String>();

		for (String a : input.keySet()) {
			if (input.get(a) > 60) {
				output.put(a, "Pass");
			} else {
				output.put(a, "Fail");
			}
		}

		System.out.println(output);
	}
}
