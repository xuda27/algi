package com.yc.bean3_datatype1.LinkedList;

import java.util.Hashtable;


/**
 * �Ƴ�û��������������ظ��Ľڵ�
 * @author Eden
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		LinkedListType<Integer> listType = new LinkedListType<Integer>();
		listType.add(1);
		listType.add(2);
		listType.add(3);
		listType.add(4);
		listType.add(5);
		listType.add(5);
		listType.add(3);
		
		delete2(listType);
		listType.showAllNode();
	}
	
	/**
	 * �Կռ任ʱ��
	 * HashTable<Integer, Boolean>
	 * @param list
	 */
	public static void delete1(LinkedListType<Integer> list) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		LinkedListType<Integer> previous = null;
		if(list == null) {
			throw new RuntimeException("LinkedList should not be null!");
		}
		list = list.nextNode;
		while (list != null) {
			if(table.containsKey(list.t)) {
				//��hashtable���Ѿ�����������������ظ���
				previous.nextNode = list.nextNode;
			}else{
				table.put(list.t, true);
				previous = list;
			}
				list = list.nextNode;
		}
	}
	
	private static void delete2( LinkedListType<Integer> list) {
		//ʹ�ÿ�����ָ��ķ�����ʵ��
		if( list == null) {
			throw new RuntimeException();
		}
		LinkedListType<Integer> p1 = list;
		while(p1 != null) {
			LinkedListType<Integer> p2 = p1;
			while( p2.nextNode != null) {
				if(p2.nextNode.t.equals(p1.t)) {
					p2.nextNode = p2.nextNode.nextNode;
				}else {
					p2 = p2.nextNode;
				}
			}
			p1 = p1.nextNode;
		}
	}
}
