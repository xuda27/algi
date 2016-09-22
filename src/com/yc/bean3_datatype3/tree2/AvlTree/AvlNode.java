package com.yc.bean3_datatype3.tree2.AvlTree;

import com.yc.bean3_datatype3.tree1.BinarySearchTree.*;

public class AvlNode  {
	public int height; // �߶�

	public Comparable element;   //Ԫ�� 
	public AvlNode left;   //��ڵ�
	public AvlNode right;  //�ҽڵ�
	
	 AvlNode( Comparable theElement )
     {
         this( theElement, null, null );
     }

     AvlNode( Comparable theElement, AvlNode lt, AvlNode rt )
     {
         element  = theElement;
         left     = lt;
         right    = rt;
         height   = 0;
     }
     
	@Override
	public String toString() {
		return "AvlNode [element=" + element + ", left=" + left + ", right="
				+ right + ",height="+height+"]";
	}

}
