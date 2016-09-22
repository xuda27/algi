package com.yc.bean3_datatype1.LinkedList.questions;

import java.util.Hashtable;

import com.yc.bean3_datatype1.LinkedList.LinkedListType;

public class Test1 {

	
	/**
	 * 2. ��д���룬�Ƴ�û���Ź���������е��ظ���㣿
    ˼·�� ����һ�� ����ֱ�ӷ�������������ÿ��������ɢ�б��������ظ�Ԫ���򽫸ý����������Ƴ���Ȼ�������
        �������� ��ʹ�û���ɢ�б������������ָ����ѭ����p1ѭ����������p2�������Ľ���Ƿ����ظ���
	 */
	public static void main(String[] args) {
		LinkedListType llt=new LinkedListType();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		llt.add(4);
		
		llt.add(2);
		
		for( int i=0;i<llt.size();i++){
			System.out.println(   llt.get(i));
		}
		
		delete2(  llt );
		for( int i=0;i<llt.size();i++){
			System.out.println(   llt.get(i));
		}
	}
	
	public static void delete1(  LinkedListType node){
		Hashtable ht=new Hashtable();
		LinkedListType previous=null;
		while(    node!=null ){

			if(  ht.containsKey(node.t)   ){



				//ִ��ɾ��
				previous.nextNode=node.nextNode;
			}else{
				ht.put(node.t, true);
				previous=node;
			}
			node=node.nextNode;
		}
	}
	
	public static void delete2( LinkedListType node){
		if(  node==null){
			return;
		}
		LinkedListType p1=node;   //��ʱָ��
		while(  p1!=null ){
			LinkedListType p2=p1;   //��p1��p2ָ��ͬһ�ڵ�
			//���ж�p2�Ƿ�����һ���ڵ㣬����У���ȡ����һ���ڵ��������ж�
			while(  p2.nextNode!=null  ){
				if(  p2.nextNode.t.equals(p1.t)){
					p2.nextNode=p2.nextNode.nextNode;
				}else{
					p2=p2.nextNode;
				}
			}
			p1=p1.nextNode;
		}
	}
	

}
