package com.reflect;

import java.lang.reflect.Method;

public class MethodCall {
	public static void main(String[] args) throws Exception {

		Class<?> c = Class.forName("com.reflect.A");
		Object o = c.newInstance();
		Method m1 = c.getDeclaredMethod("message", null);
		m1.setAccessible(true);
		m1.invoke(o, null);

		
		
		Method m2 = c.getDeclaredMethod("cube", new Class[] { int.class });
		m2.setAccessible(true);
		m2.invoke(o, 5);
	}

}
