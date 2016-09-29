package com.yc.bean3_datatype2.bitmap;

/**
 * 不使用任何一种内部排序算法，将一个数组的元素排序输出
 * 位图法 桶排序
 * @author Eden
 *
 */
public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] {2,1,5,3,4,6};
		boolean []b = new boolean[7];
		
		for( int i = 0; i < b.length; i++) {
			for( int a : arr){
				if(a==i){
					b[i]=true;
				}
			}
		}
		
		for(int j=0; j<b.length; j++) {
			if(b[j]){
				System.out.print(j + " ");
			}
		}
	}
}
