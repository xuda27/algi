package com.yc.bean2_sort2.selectionsort;

import com.yc.bean2_sort.Sortable;

/**
 * 选择排序 排序时间：10677ms
 * 改进点：比较的次数减小
 * @author eden
 *
 */
public class SelectionSort implements Sortable{
	private int[] a;
	
	public SelectionSort( int[] a){
		this.a=a;
	}
	/**
	 * 每一次内循环，找一个最小值，记录这个最小值的索引，当内循环完毕后，将这个最小值与外循环当前索引元素进行交换
	 */
	public void sort(){
		//外循 环每循环一次，表示找到一个最小值
		for(  int i=0;i<a.length;i++){
			//内循环  找到最小值的位置（索引）
			int minindex=i;
			for( int j=i+1;j<a.length;j++){ // 无序区选出最小值
				//将j当前的元素值与最小值比
				//如果发现j当前的值还小，则更改最小值的索引，直到全部循环
				if( a[j]<a[minindex]){
					minindex=j;
				}
			}
			if(minindex != i){
				int t=a[i];
				a[i]=a[minindex];
				a[minindex]=t;
			}
			
		}
	}
	
	public static void main(String[] args){
		int[] arr={44,32,6,9,22};
		
		SelectionSort bs=new SelectionSort( arr );
		bs.sort();
		
		for( int t:arr){
			System.out.print(   t+"\t");
		}
	}
}
