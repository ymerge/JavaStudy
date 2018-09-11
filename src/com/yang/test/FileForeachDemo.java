package com.yang.test;

import java.io.File;

/**
 * ���ָ��·������Ŀ¼�µ�java�ļ�
 * @author ymerge
 *
 */
public class FileForeachDemo {
	
	public static void main(String[] args) {
		File file = new File("src");
		method(file);
	}
	
	public static void method(File file){
		if(file.isDirectory()){//�ж��Ƿ��ļ���
			File[] files = file.listFiles();//�õ������ļ�����
			for(File f : files){//����
				if(f.isFile()){//������ļ�
					if(f.getName().endsWith(".java")){//�ж��Ƿ���java�ļ�
						System.out.println(f.getName());
					}
				}else{//������ļ���
					method(f);//�ݹ����
				}
			}
		}
	}

}
