package com.yang.file;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		
		File f = new File("F:\\JavaStudy\\myIO");
		
		//list()���ص�ǰ·���������ļ����ļ��е�����
		//ֻ��ָ��file������Ե��ø÷���������ᱨ���쳣
//		String[] files = f.list();
//		for(int i=0;i<files.length;i++){
//			System.out.println(files[i]);
//		}
		
		//listFiles()���ص�ǰ·���������ļ����ļ��ж���
		//ֻ��ָ��file������Ե��ø÷���������ᱨ���쳣
		File[] files2 = f.listFiles();
		for(File file : files2){
			System.out.println(file);
		}
	}
}
