package com.yang.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ֽ�������ͼƬ
 * 
 * 
 * �ֽ�����inputstream  outputstream
 * �ַ����ܸɵģ��ֽ������ܸɣ����ֽ����ܸɵ��ַ�����һ���ܸ�
 * һ���ַ���ֻ�ܲ����ı��ļ��������ļ�ֻ�����ֽ���
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
