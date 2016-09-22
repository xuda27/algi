package com.yc.bean2_sort6.quicksort;


public class QuickSort {
	private int[] a;
	public QuickSort(int[] a) {
		this.a = a;
	}
	public void sort() {
		sort( 0,a.length-1);
	}
	private void sort(int from, int to) {
		if(from>=to){
			return;
		}
		int p=partition( from, to);
		sort( from ,p);
		sort( p+1,to);
	}
	private int partition(int from, int to) {
		int pivot=a[from];//����ֵ
		int i=from-1;
		int j=to+1;
		while( i<j ){
			//i��ʾ��ߣ�ֻҪ�����һ��ֵ��pivot����������λ��(ͣ��)
			i++;
			while(    a[i]<pivot){
				i++;
			}
			//j��ʾ�ұߣ�ֻҪ�ұ���һ��ֵ�� pivotС�����¼�¡�
			j--;
			while( a[j]>pivot){
				j--;
			}
			//����i, j
			if( i<j ){
				swap( i,j);
			}
		}
		return j;
	}
	private void swap(  int minPos, int i ){
		int temp=a[i];
		a[i]=a[minPos];
		a[minPos]=temp;
	}
	public static void main(String[] args) {
		int[] arr = { 6, 2,4,1,5,9};

		QuickSort bs = new QuickSort(arr);
		bs.sort();

		for (int t : arr) {
			System.out.print(t + "\t");
		}
	}
}
