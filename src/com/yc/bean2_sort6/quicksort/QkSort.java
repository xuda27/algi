package com.yc.bean2_sort6.quicksort;

import com.yc.bean2_sort.Sortable;
/**
 * 找pivot值
 * 1.一次外循环要保证过所有比pivot小的值在左边，比pivot大的值在右边
 * 2.让i从第一个索引循环，找比pivot大的值，找到就记录索引
 * 3.让j从最后一个元素向前循环，找比pivot小的值，找到就记录索引
 * 4.接着小的值与大的值的位置交换一次
 * 5.取出pivot当前位置，在递归调用快排
 *
 * @author Eden
 *
 */
public class QkSort implements Sortable {
	public int[] arr;
	
	public QkSort(int[] arr) {
		this.arr = arr;
	}
	
	@Override
	public void sort() {
		sort(0, arr.length-1);
	}

	private void sort(int from, int to) {
		//递归的终止条件
		if(from >= to) {
			return ;
		}
		//取pivot的当前位置
		int pivotIndex = partition(from, to);
		//递归调用快排
		sort(from, pivotIndex);
		sort(pivotIndex+1, to);
	}
	
	/**
	 * 分区算法：根据起点位置和终点位置，查找一个pivot的最终位置，并返回
	 * @param from
	 * @param to
	 * @return
	 */
	private int partition(int from, int to) {
		// 找pivot值
		int pivot = arr[from];
		int i = from;
		int j = to;
		// 一次外循环要保证所有比pivot小的值在左边，比pivot大的值在右边
		while(i <= j){
			while( arr[j] >= pivot && i<j) {
				j--;
			}
			arr[i] = arr[j];
			while( arr[i] <= pivot && i<j) {
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = pivot;
		return i;
	}
}
