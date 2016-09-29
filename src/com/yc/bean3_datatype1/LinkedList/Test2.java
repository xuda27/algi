package com.yc.bean3_datatype1.LinkedList;
/**
 *  实现一个算法，找出单向链表中倒数第n个结点。
 *  思路：使用两个指针，开始时，它们都指向链表的首结点，然后将p2指针向前移动n个结点，
 *      之后，以同样的速度移动这两个指针，p2会在移动length-n后到达链表的最后，此时，p1会指向链表倒数第n个结点
 * @author Eden
 *
 */
public class Test2 {

	public static void main(String[] args) {
		LinkedListType<Integer> llt=new LinkedListType<Integer>();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		llt.add(4);
		llt.add(2);
		LinkedListType<Integer> node = toLastN(llt, 0);
		System.out.println(node == null ? null : node.t);
		
	}

	/**
	 * 使用快慢两个指针，开始时，他们都指向头节点，将p2指针向前移动n个节点
	 *  再让两个指针以同样的速度一起移动，当p2指针到达最后时，则p1指针指向的元素就是倒数第n个节点
	 * @param head
	 * @param n
	 * @return 目标节点
	 */
	private static LinkedListType<Integer> toLastN( LinkedListType<Integer> head, int n) {
		if(n <= 0) {
			return null;
		}
		LinkedListType<Integer> p1 = head;
		LinkedListType<Integer> p2 = head;
		
		for(int i = 0; i < n; i++) {
			if( p2 == null) {
				return null;
			} else {
				p2 =p2.nextNode;
			}
		}
		if(p2 ==  null) {
			return null;
		}
		
		while(p2.nextNode != null) {
			p1 = p1.nextNode;
			p2 = p2.nextNode;
		}
		return p1;
	}
}
