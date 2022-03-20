package com.ahasan.arraysdemo.serialization;

import java.io.*;

class Dog implements Serializable{
	int i = 10;
	int j = 20;
}

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog dog = new Dog();
		FileOutputStream fileOutputStream = new FileOutputStream("ahasan.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(dog);

		FileInputStream fileInputStream = new FileInputStream("ahasan.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Dog d = (Dog) objectInputStream.readObject();
		System.out.println(d.i + " : " + d.j);
	}
}
