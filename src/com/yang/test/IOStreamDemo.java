package com.yang.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用字节流复制图片
 * 
 * 
 * 字节流：inputstream  outputstream
 * 字符流能干的，字节流都能干，但字节流能干的字符流不一定能干
 * 一般字符流只能操作文本文件，其余文件只能用字节流
 * @author ymerge
 *
 */
public class IOStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("02.jpg");
		FileOutputStream fos = new FileOutputStream("d:\\02.jpg");
		
//		int len;
//		byte[] bytes = new byte[1024];
//		while((len=fis.read(bytes))!=-1){
//			fos.write(bytes, 0, len);
//		}
		
		int len;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		
		fos.close();
		fis.close();
	}
}
