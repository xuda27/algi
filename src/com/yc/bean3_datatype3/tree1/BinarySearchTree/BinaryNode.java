package com.yc.bean3_datatype3.tree1.BinarySearchTree;

//����������Ľ��
//�����ǹ��У��ǰ�Ȩ�ޣ�ֻ���ڱ����б�����
 public class BinaryNode {
	//������������������������Ҫ��ڵ��е�Ԫ�ض��ǿ��ԱȽϵġ� 
	public Comparable element;    
	public BinaryNode left;   //��ڵ�
	public BinaryNode right;  //�ҽڵ�
	
	public BinaryNode( Comparable element){
		this( element,null, null);
	}
	
	public BinaryNode( Comparable element, BinaryNode left, BinaryNode right){
		this.element=element;
		this.left=left;
		this.right=right;
	}

	@Override
	public String toString() {
		return "BinaryNode [element=" + element + ", left=" + left + ", right="
				+ right + "]";
	}
	
	
}
