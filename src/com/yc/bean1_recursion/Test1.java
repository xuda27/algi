package com.yc.bean1_recursion;

/**
 * 替代一层循环，代码整合度高，递归层多，内存可能溢出
 * @author eden
 *
 */
public class Test1 {
	//需求：计算n的阶乘
	public static void main(String[] args) {
		System.out.println(    factorial( 10) );
	}

	//n阶乘
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
