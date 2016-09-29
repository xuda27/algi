package com.yc.bean3_datatype1.LinkedList;
/**
 *  ʵ��һ���㷨���ҳ����������е�����n����㡣
 *  ˼·��ʹ������ָ�룬��ʼʱ�����Ƕ�ָ��������׽�㣬Ȼ��p2ָ����ǰ�ƶ�n����㣬
 *      ֮����ͬ�����ٶ��ƶ�������ָ�룬p2�����ƶ�length-n�󵽴��������󣬴�ʱ��p1��ָ����������n�����
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
	 * ʹ�ÿ�������ָ�룬��ʼʱ�����Ƕ�ָ��ͷ�ڵ㣬��p2ָ����ǰ�ƶ�n���ڵ�
	 *  ��������ָ����ͬ�����ٶ�һ���ƶ�����p2ָ�뵽�����ʱ����p1ָ��ָ���Ԫ�ؾ��ǵ�����n���ڵ�
	 * @param head
	 * @param n
	 * @return Ŀ��ڵ�
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
