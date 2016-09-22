package com.yc.bean1_recursion;

public class Test2 {

	public static void main(String[] args) {
//		System.out.println(  fib(10) );
/*		System.out.println(Byte.MAX_VALUE);//8位
		System.out.println(Short.MAX_VALUE);//16位
		System.out.println(Integer.MAX_VALUE);//32位
		System.out.println(Long.MAX_VALUE);//64位
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);*/
		int sum = 0;
		for(int i=1;i<=5;i++){
			sum+=fib(i);
		}
		System.out.println(sum);
	}
	
	/**
	 * fib数列： 1 1 2 3 5 8 13
	 * @param i 数列的值
	 * @return
	 */
	private static int fib(int i) { 
		//终止条件先写
		if( i==1 ){
			return 1;
		}else if( i==2 ){
			return 1;
		}else{
			return fib(i-1)+fib(i-2);
		}
	}
	

}
