package com.yang.test;

import java.io.File;

/**
 * 输出指定路径及子目录下的java文件
 * @author ymerge
 *
 */
public class FileForeachDemo {
	
	public static void main(String[] args) {
		File file = new File("src");
		method(file);
	}
	
	public static void method(File file){
		if(file.isDirectory()){//判断是否文件夹
			File[] files = file.listFiles();//得到所有文件对象
			for(File f : files){//遍历
				if(f.isFile()){//如果是文件
					if(f.getName().endsWith(".java")){//判断是否是java文件
						System.out.println(f.getName());
					}
				}else{//如果是文件夹
					method(f);//递归调用
				}
			}
		}
	}

}
