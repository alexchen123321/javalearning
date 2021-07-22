package com.itranswarp.learnjava;
import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class cls=p.getClass();
		java.lang.reflect.Field f =cls.getDeclaredField("name");
		java.lang.reflect.Field f2 =cls.getDeclaredField("age");
		f.setAccessible(true);
		f2.setAccessible(true);
		f.set(p, name);
		f2.set(p, age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
		// the first parameter is getDeclaredField and the second is inputted.
		f.set(p,"xxx");
		System.out.println(p.getName());
	}
}

