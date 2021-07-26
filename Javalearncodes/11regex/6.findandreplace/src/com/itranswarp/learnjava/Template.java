package com.itranswarp.learnjava;

import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Template {

	final String template;  // 1. 定义字符串模版
	final Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}"); // 2. $ 符号开头，{  大小写字母，数字和下划线,至少一个字符 }
	public Template(String template) {
		this.template = template;
	}
	public String render(Map<String, Object> data) {

		Matcher m = pattern.matcher(template); // 3. 匹配 $ 符号开头，{  大小写字母，数字和下划线,至少一个字符 } from template
		// TODO:
		//appendReplacement 方法参考下面链接
		// https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/regex/Matcher.html#appendReplacement(java.lang.StringBuilder,java.lang.String)
		StringBuilder sb = new StringBuilder();
		while (m.find()) {
			System.out.println("m0:" + m.group(0)); // ${name}
			System.out.println("m:" + m.group(1)); // m:name ,m:lang
			System.out.println(data.get(m.group(1)).toString());
			m.appendReplacement(sb,data.get(m.group(1)).toString());
		}
		m.appendTail(sb);
		return  sb.toString();
	}

}