package com.yc.bean2_sort6.quicksort;

import com.yc.bean2_sort.Sortable;
/**
 * ��pivotֵ
 * 1.һ����ѭ��Ҫ��֤�����б�pivotС��ֵ����ߣ���pivot���ֵ���ұ�
 * 2.��i�ӵ�һ������ѭ�����ұ�pivot���ֵ���ҵ��ͼ�¼����
 * 3.��j�����һ��Ԫ����ǰѭ�����ұ�pivotС��ֵ���ҵ��ͼ�¼����
 * 4.����С��ֵ����ֵ��λ�ý���һ��
 * 5.ȡ��pivot��ǰλ�ã��ڵݹ���ÿ���
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
		//�ݹ����ֹ����
		if(from >= to) {
			return ;
		}
		//ȡpivot�ĵ�ǰλ��
		int pivotIndex = partition(from, to);
		//�ݹ���ÿ���
		sort(from, pivotIndex);
		sort(pivotIndex+1, to);
	}
	
	/**
	 * �����㷨���������λ�ú��յ�λ�ã�����һ��pivot������λ�ã�������
	 * @param from
	 * @param to
	 * @return
	 */
	private int partition(int from, int to) {
		// ��pivotֵ
		int pivot = arr[from];
		int i = from;
		int j = to;
		// һ����ѭ��Ҫ��֤���б�pivotС��ֵ����ߣ���pivot���ֵ���ұ�
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
