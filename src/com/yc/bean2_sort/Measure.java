package com.yc.bean2_sort;

import java.util.Random;

import com.yc.bean2_sort1.bubblesort.BubbleSort;
import com.yc.bean2_sort2.selectionsort.SelectionSort;
import com.yc.bean2_sort3.insertsort.InsertSorter;

public class Measure {
	public static void main(String[] args) {
		int []a = new int[99999];
		Random r = new Random();
		for(int i=0; i<a.length; i++){
			a[i] = r.nextInt(9999999);
		}
		Sortable sort = new InsertSorter(a);
		
		long start = System.currentTimeMillis();
		sort.sort();
		long end = System.currentTimeMillis();
		System.out.println("ÅÅÐòÊ±¼ä£º"+(end-start));
	}
}
