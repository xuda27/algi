package com.yc.bean3_datatype3.array.questions;

import java.util.Random;

/**
 * �������. ��10000����,�������һ�ţ�Ҫʹ������������Ʋ��ظ�������ʱ�䣬�ռ临�Ӷ�Ҫ�㶨�����ʵ��?


   =>  [1,2,3,4,5,6,7,8.....10000];
 *
 */
public class Test4 {
	
public static final int length=10;
	
	public static void main(String[] args) {
		int[] arr=new int[length];
		for( int i=1;i<=length;i++){
			arr[i-1]=i;
		}
		Random r=new Random();
		int index=length;
		int temp=0;
		int i=1;
		while(  index>0 ){
			int tempindex=r.nextInt(index);
			System.out.println(  arr[tempindex]);
			temp=arr[index-1];
			arr[index-1]=arr[tempindex];
			arr[tempindex]=temp;
			index--;
			i++;
		}
	}
}
