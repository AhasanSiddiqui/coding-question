package com.ahasan.arraysdemo.array;

import java.util.ArrayList;
import java.util.List;

public class TestProgram2 {
	public static void main(String[] args) {
		A1 a1=new A1();
		A1 a2=new A1();
	}
}

class A1 implements Cloneable{
	static List<Class> objectList=new ArrayList<>();
	public A1() {

		if (!objectList.contains(this.getClass())) {
			objectList.add(this.getClass());
		} else
			throw new RuntimeException("Can not create another Object");
	}

}
class B1 extends A1 {

}

class C1 extends A1{

}