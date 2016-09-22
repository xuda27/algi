package com.yc.bean2_sort1.bubblesort;

import com.yc.bean2_sort.Sortable;

/**
 * 冒泡排序时间：36002ms
 * 稳定
 * @author eden
 *
 */
public class BubbleSort implements Sortable {
	private int[] a;

	public BubbleSort(int[] a) {
		this.a = a;
	}

	public void sort() {
		// 外循 环控制要找几个最大值
		for (int i = 0; i < a.length - 1; i++) {
			// 内循环控制循环次数
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	/**
	 * 改进版：一旦某一趟外循环比较时 没有出现任何元素交换，则说明已经排好序了
	 */
	public void sort1() {
		// 外循 环控制要找几个最大值
		for (int i = 0; i < a.length - 1; i++) {
			boolean exchange = false;
			// 内循环控制循环次数
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					exchange = true;
				}
			}
			if(exchange = false){ // 本趟没有发生交换，中途结束算法
				return ;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 44, 32, 6, 9, 22 };

		BubbleSort bs = new BubbleSort(arr);
		bs.sort();

		for (int t : arr) {
			System.out.print(t + "\t");
		}
	}
}
