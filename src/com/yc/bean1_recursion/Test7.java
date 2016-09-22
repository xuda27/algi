package com.yc.bean1_recursion;

import java.io.File;

public class Test7 {

	public static void main(String[] args) {
		String path=System.getProperty("user.home");
		File f=new File( path);
		long result=showAll( f );
		System.out.println(    "�ܴ�С:"+ result );
	}

	//��ʾ���   f�����е��ļ����ļ��У�������ļ�f�Ĵ�С:   ���ṹ  ->   ����, ����, ����. 
	//   isFile()    isDirectory()
	//   File[]  listFile();
	private static long showAll(File f) {
		long size=0;
		System.out.println(    f.getName() );
		if(   f.isFile() ){
			size=f.length();
		}else{
			File[] fs=f.listFiles();
			if(  fs!=null&&fs.length>0){
				for( File file:fs){
					size+=  showAll( file );  
				}
			}
		}
		return size;
	}
	
	

}
