package com.yc.bean1_recursion;

/**
 * ���һ��ѭ�����������϶ȸߣ��ݹ��࣬�ڴ�������
 * @author eden
 *
 */
public class Test1 {
	//���󣺼���n�Ľ׳�
	public static void main(String[] args) {
		System.out.println(    factorial( 10) );
	}

	//n�׳�
	public static int factorial(int i) {
		if( i==1){
			return 1;
		}else{
			return i*factorial( i-1 );
		}
	}
	
	public static int sum(int i) {
		if( i==1){
			return 1;
		}else{
			return i*sum( i-1 );
		}
	}
	
	
	

}
