package com.yc.bean2_sort2.selectionsort;

import com.yc.bean2_sort.Sortable;

/**
 * ѡ������ ����ʱ�䣺10677ms
 * �Ľ��㣺�ȽϵĴ�����С
 * @author eden
 *
 */
public class SelectionSort implements Sortable{
	private int[] a;
	
	public SelectionSort( int[] a){
		this.a=a;
	}
	/**
	 * ÿһ����ѭ������һ����Сֵ����¼�����Сֵ������������ѭ����Ϻ󣬽������Сֵ����ѭ����ǰ����Ԫ�ؽ��н���
	 */
	public void sort(){
		//��ѭ ��ÿѭ��һ�Σ���ʾ�ҵ�һ����Сֵ
		for(  int i=0;i<a.length;i++){
			//��ѭ��  �ҵ���Сֵ��λ�ã�������
			int minindex=i;
			for( int j=i+1;j<a.length;j++){ // ������ѡ����Сֵ
				//��j��ǰ��Ԫ��ֵ����Сֵ��
				//�������j��ǰ��ֵ��С���������Сֵ��������ֱ��ȫ��ѭ��
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
