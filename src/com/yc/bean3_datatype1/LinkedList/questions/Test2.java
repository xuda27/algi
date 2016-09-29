package com.yc.bean3_datatype1.LinkedList.questions;

import com.yc.bean3_datatype1.LinkedList.LinkedListType;

public class Test2 {

	/**
	 * ʵ��һ���㷨���ҳ����������е�����n����㡣
	 *˼·�� ʹ������ָ�룬��ʼʱ�����Ƕ�ָ��������׽�㣬Ȼ��p2ָ����ǰ�ƶ�n����㣬
           ֮����ͬ�����ٶ��ƶ�������ָ�룬p2�����ƶ�length-n�󵽴��������󣬴�ʱ��p1��ָ����������n�����
	 */
	public static void main(String[] args) {
		LinkedListType llt=new LinkedListType();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		llt.add(4);
		llt.add(2);
		LinkedListType node=toLastN( llt, 0);
		System.out.println(   node==null?null: node.t   );
	}
	
	public static LinkedListType toLastN(  LinkedListType head, int n    ){
		if(  n<=0){
			return null;
		}
		LinkedListType p1=head;
		LinkedListType p2=head;
		
		for( int i=0;i<n;i++){
			if(  p2==null){
				return null;
			}else {
				p2 =p2.nextNode;
			}
			
		}
		if(  p2==null){
			return null;
		}
		while(  p2.nextNode!=null ){
			p1=p1.nextNode;
			p2=p2.nextNode;
		}
		return p1;
	}

}
