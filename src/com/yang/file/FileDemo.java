package com.yang.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		//�����ļ�
//		File f = new File("a.txt");
//		System.out.println(f.createNewFile());
		
		//�����ļ���
		File f1 = new File("b");
//		System.out.println(f1.mkdir());
		
		//ɾ��ָ�����ļ����ļ��� delete()
		//ע�⣺ɾ��һ���ļ���ʱ������ļ������治�����������ļ����ļ���
//		System.out.println(f.delete());
		System.out.println(f1.delete());
	}

}
