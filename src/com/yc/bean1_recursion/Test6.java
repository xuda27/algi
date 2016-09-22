package com.yc.bean1_recursion;

/**
 * 用递归实现对有序数据的二分查找
 * 
 * @author eden
 *
 */
public class Test6 {

	public static void main(String[] args) {
		// 二分查找: 顺序数组，
		int[] t = { 1, 2, 3, 6, 8, 9, 15, 18 };
		System.out.println(binarySearch(t, 18));

	}

	private static int binarySearch(int[] a, int target) {
		return recuisiveBinarySearch(a, target, 0, a.length - 1);
	}

	/**
	 * 使用递归实现二分查找 在key在数组的索引
	 * 
	 * @param list
	 *            查询的有序数组
	 * @param key
	 *            要查的值
	 * @param low
	 * @param high
	 * @return
	 */
	private static int recuisiveBinarySearch(int[] list, int key, int low,
			int high) { // 0, 9 4 0-3 1
		if (low > high) {
			return -1;
		} else {
			// 二分查找: 找中间的索引.

			// 找中间的索引
			int mid = (low + high) / 2;

			if (key < list[mid]) {
				// 在左边递归
				return recuisiveBinarySearch(list, key, low, mid - 1);
			} else if (key > list[mid]) {
				// 在右边递归
				return recuisiveBinarySearch(list, key, mid + 1, high);
			} else {
				return mid;
			}
		}
	}

}
