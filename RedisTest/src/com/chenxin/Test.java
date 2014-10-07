package com.chenxin;

import java.io.File;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = Thread.currentThread().getContextClassLoader()
				.getResource("").getPath();
		System.out.println(path);
		File file = new File(path + File.separator + "test.txt");
		file.createNewFile();
	}

}
