package com.itranswarp.learnjava;
import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
		Method m1 = Person.class.getMethod("setName", String.class);
		m1.invoke(p,name);

		Method m2 = Person.class.getMethod("setAge", int.class);
		m2.invoke(p,age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
