package com.yc.bean2_sort5.mergesort;

import com.yc.bean2_sort4.shellsort.ShellSorter;
// {3,1}
public class MergeSorter {

	private int[] a;

	public MergeSorter(int[] a) {
		this.a = a;
	}

	public void sort() {
		if(  a.length<=1  ){
			return;
		}
		//��a����������
		int[] first=new int[  a.length/2 ];
		int[] second=new int[  a.length-first.length   ];
		//��  a����  ��0��ʼ��a.length/2-1��λ�õ�Ԫ��ֵ�ŵ�first��
		System.arraycopy(a, 0, first, 0, first.length);
		System.arraycopy(a,first.length,second,0,second.length);   // first=> 3    seond:1
		//�ݹ��ٷ�
		MergeSorter ms1=new MergeSorter(first);
		MergeSorter ms2=new MergeSorter( second);
		ms1.sort();   // first: {3}
		ms2.sort();   // second: {1}
		merge(first, second);
		
	}
	
	
	//�ϲ���������������
	private void merge(  int[] first, int [] second  ){
		//��������   iFirst ָfirst    iSecondָsecond,     jָ������
		int iFirst=0, iSecond=0, j=0;
		//ѭ ���������飬�ҵ�С��ֵ�浽  a��
		while(   iFirst<first.length &&iSecond<second.length ){
			if(   first[iFirst]<second[iSecond]  ){
				a[j]=first[iFirst];
				iFirst++;
			}else {
				a[j]=second[iSecond];
				iSecond++;
			}
			j++;
		}
		//Ԥ��  first������������
		System.arraycopy(first, iFirst, a, j,    first.length-iFirst );
		//Ԥ��second������������
		System.arraycopy(  second, iSecond, a, j, second.length-iSecond);   // a: 1,3
	}
	
	
	public static void main(String[] args) {
		/* */
		int[] arr = { 6, 2,4,1,5,9};
		MergeSorter bs = new MergeSorter(arr);
		bs.sort();
		for (int t : arr) {
			System.out.print(t + "\t");
		}
		
		/**
		 * ��һС����ʵ��������������ĺϲ�
		
		int[] x={2,66,99};
		int[] y={3,6,90};
		
		int[] r=new int[6];
		MergeSorter ms=new MergeSorter(r);
		ms.merge(x, y);
		for( int t: ms.a){
			System.out.print(   t +"\t");
		}
		 */
		
		
		
		
	}
}
