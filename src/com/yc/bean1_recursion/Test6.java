package com.yc.bean1_recursion;

/**
 * �õݹ�ʵ�ֶ��������ݵĶ��ֲ���
 * 
 * @author eden
 *
 */
public class Test6 {

	public static void main(String[] args) {
		// ���ֲ���: ˳�����飬
		int[] t = { 1, 2, 3, 6, 8, 9, 15, 18 };
		System.out.println(binarySearch(t, 18));

	}

	private static int binarySearch(int[] a, int target) {
		return recuisiveBinarySearch(a, target, 0, a.length - 1);
	}

	/**
	 * ʹ�õݹ�ʵ�ֶ��ֲ��� ��key�����������
	 * 
	 * @param list
	 *            ��ѯ����������
	 * @param key
	 *            Ҫ���ֵ
	 * @param low
	 * @param high
	 * @return
	 */
	private static int recuisiveBinarySearch(int[] list, int key, int low,
			int high) { // 0, 9 4 0-3 1
		if (low > high) {
			return -1;
		} else {
			// ���ֲ���: ���м������.

			// ���м������
			int mid = (low + high) / 2;

			if (key < list[mid]) {
				// ����ߵݹ�
				return recuisiveBinarySearch(list, key, low, mid - 1);
			} else if (key > list[mid]) {
				// ���ұߵݹ�
				return recuisiveBinarySearch(list, key, mid + 1, high);
			} else {
				return mid;
			}
		}
	}

}
