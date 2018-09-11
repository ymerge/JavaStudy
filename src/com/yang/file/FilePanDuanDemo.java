package com.yang.file;

import java.io.File;
import java.io.IOException;

public class FilePanDuanDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
//		f.createNewFile();
		
		//exists()判断文件和文件夹是否存在
//		System.out.println(f.exists());
		
		//isAbsolute()判断是否是绝对路径
//		System.out.println(f.isAbsolute());
		
		File f1 = new File("b");
//		f1.mkdir();
		
		//isDirectory()判断是否是文件夹
		System.out.println(f1.isDirectory());
		
		//isFile()判断是否是文件
		System.out.println(f.isFile());
	}
}
