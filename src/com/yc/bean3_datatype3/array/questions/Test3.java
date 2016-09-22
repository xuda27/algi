package com.yc.bean3_datatype3.array.questions;

/**
 * �и��������ַ������飬 �м��кܶ�մ�����дһ���������ҳ������ַ�����λ��. 
   �������: �Ľ����ַ�����. ,  ���ַ�����������Ҫ�ľ����м����ݣ�����м���Ϊ�գ����м���������������ķǿ��ַ�����λ�� �� 
 */
public class Test3 {

	public static void main(String[] args) {
		String[] strs=new String[]{"ab","bc","ef"," "," ","gh","hi"," "," ","jk","lm"};
		System.out.println(  search( strs,"hi",0, strs.length-1));
	}
	
	public static int search2(String[] strings, String str, int first, int last) {
		if (first > last)
			return -1;
		int mid = (first + last) / 2;
		if (str.equals(strings[mid])) {
			return mid;
		} else if (strings[mid].compareTo(str) < 0) {
			return search(strings, str, mid + 1, last);
		} else {
			return search(strings, str, first, mid - 1);
		}
	}

	public static int search(String[] strings, String str, int first, int last) {
		if (first > last)
			return -1;
		int mid = (first + last) / 2;
		if (strings[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			while (true) {
				if (left < first && right > last) {
					return -1;
				} else if (right <= last && !strings[right].isEmpty()) {
					mid = right;
					break;
				} else if (left >= first && !strings[left].isEmpty()) {
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}
		if (str.equals(strings[mid])) {
			return mid;
		} else if (strings[mid].compareTo(str) < 0) {
			return search(strings, str, mid + 1, last);
		} else {
			return search(strings, str, first, mid - 1);
		}
	}

}
