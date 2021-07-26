package com.itranswarp.learnjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		args = new String[] {"/Users/bill/Desktop/Javaproject/test1/src/input","/Users/bill/Desktop/Javaproject/test1/src/output"};
		if (args.length != 2) {
			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
			System.exit(1);
		}
		copy(args[0], args[1]);
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件
		// TODO:
		File inputFile = new File(source);
		File outputFile = new File(target);
		try(InputStream fileInputStream = new FileInputStream(inputFile);
			OutputStream fileOutputStream = new FileOutputStream(outputFile)){
			fileInputStream.transferTo(fileOutputStream);
		}
	}
}
