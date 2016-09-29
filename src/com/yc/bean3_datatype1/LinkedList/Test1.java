package com.yc.bean3_datatype1.LinkedList;

import java.util.Hashtable;


/**
 * 移除没有排序的链表中重复的节点
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
	 * 以空间换时间
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
				//在hashtable中已经存在这个键，表明重复了
				previous.nextNode = list.nextNode;
			}else{
				table.put(list.t, true);
				previous = list;
			}
				list = list.nextNode;
		}
	}
	
	private static void delete2( LinkedListType<Integer> list) {
		//使用快慢行指针的方案来实现
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
