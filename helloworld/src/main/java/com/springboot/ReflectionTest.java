package com.springboot;

import java.lang.reflect.Field;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		ReflectionClass obj = new ReflectionClass();
		Class className = Class.forName("com.springboot.ReflectionClass");
		
		
		obj.setName("Devendra");
		obj.setSal(30);
		
		System.out.println(obj.getName()+"-->"+obj.getSal());
		
		Field[] fields = className.getDeclaredFields();
		
		for (Field field : fields) {
			
			field.setAccessible(true);
			
			if(field.getType().equals(String.class)){
				field.set(obj, "Dev");
			}
			if(field.getType().equals(Integer.class)){
				field.set(obj, 25);
			}
//			System.out.println(field.getType());
		}
		
		

		System.out.println(obj.getName()+"-->"+obj.getSal());
		
		
	}

}
