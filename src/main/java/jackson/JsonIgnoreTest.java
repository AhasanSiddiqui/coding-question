package com.ahasan.arraysdemo.jackson;

import java.io.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
public class JsonIgnoreTest {
   public static void main(String[] args) throws IOException {
      Customer customer = new Customer("110", "Surya Kiran", "Chennai");
      System.out.println(customer);
      ObjectMapper mapper = new ObjectMapper();
      String jsonString = mapper.writeValueAsString(customer);
      System.out.println("JSON: " + jsonString);
      System.out.println("---------");
      jsonString = "{\"id\":\"120\",\"name\":\"Devaraj\"}";
      System.out.println("JSON: " + jsonString);
      customer = mapper.readValue(jsonString, Customer.class);
      System.out.println(customer);
   }
}
// Customer class
class Customer {
   private String id;
   private String name;
   @JsonIgnore
   private String address;
   public Customer() {
   }
   public Customer(String id, String name, String address) {
      this.id = id;
      this.name = name;
      this.address = address;
   }
   public String getId() {
      return id;
   }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   @Override
   public String toString() {
      return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
   }
}