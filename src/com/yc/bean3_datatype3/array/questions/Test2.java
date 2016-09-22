package com.yc.bean3_datatype3.array.questions;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * ��дһ������ �����ַ�������������򣬽����б�λ���������ڵ�����λ��.
 * ��λ��ָ����   "ab","ba"�����Ĵ�
 *
 */
public class Test2 {

	public static void main(String[] args) {
		String[] arr=new String[]{"abc","cba","efg","bac","ab","gh"};
		sort(   arr );
		
		for(    String s: arr){
			System.out.print( s+"\t");
		}
	}

	public static String sortChars(String s) {
		char[] chs = s.toCharArray();
		Arrays.sort(chs);
		return new String(chs);
	}

	public static void sort(String[] array) {
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();

		// ��ͬΪ��λ�ʵĵ��ʷ���һ��
		for (String s : array) {
			String key = sortChars(s);
			if (!hash.containsKey(key)) {
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> ll = hash.get(key);
			ll.push(s);
		}
		// ��ɢ�б�ת��Ϊ����
		int index = 0;
		for (String key : hash.keySet()) {
			LinkedList<String> ll = hash.get(key);
			for (String t : ll) {
				array[index] = t;
				index++;
			}
		}
	}
}
