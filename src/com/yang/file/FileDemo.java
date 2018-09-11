package com.yang.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		//创建文件
//		File f = new File("a.txt");
//		System.out.println(f.createNewFile());
		
		//创建文件夹
		File f1 = new File("b");
//		System.out.println(f1.mkdir());
		
		//删除指定的文件或文件夹 delete()
		//注意：删除一个文件夹时，这个文件夹下面不能有其他的文件和文件夹
//		System.out.println(f.delete());
		System.out.println(f1.delete());
	}

}
