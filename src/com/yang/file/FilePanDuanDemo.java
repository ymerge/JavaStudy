package com.yang.file;

import java.io.File;
import java.io.IOException;

public class FilePanDuanDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
//		f.createNewFile();
		
		//exists()�ж��ļ����ļ����Ƿ����
//		System.out.println(f.exists());
		
		//isAbsolute()�ж��Ƿ��Ǿ���·��
//		System.out.println(f.isAbsolute());
		
		File f1 = new File("b");
//		f1.mkdir();
		
		//isDirectory()�ж��Ƿ����ļ���
		System.out.println(f1.isDirectory());
		
		//isFile()�ж��Ƿ����ļ�
		System.out.println(f.isFile());
	}
}
