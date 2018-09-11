package com.yang.file;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		
		File f = new File("F:\\JavaStudy\\myIO");
		
		//list()返回当前路径下所有文件和文件夹的名称
		//只有指向file对象可以调用该方法，否则会报空异常
//		String[] files = f.list();
//		for(int i=0;i<files.length;i++){
//			System.out.println(files[i]);
//		}
		
		//listFiles()返回当前路径下所有文件和文件夹对象
		//只有指向file对象可以调用该方法，否则会报空异常
		File[] files2 = f.listFiles();
		for(File file : files2){
			System.out.println(file);
		}
	}
}
