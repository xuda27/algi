package com.yc.bean3_datatype1.LinkedList;

//������
public  class LinkedListType<T>{
	public T t;
	public LinkedListType<T> nextNode;    //��һ�ڵ�
	//��ȡ����ĳ���
	public int size(     ){
		int size=0;
		LinkedListType temp=this;
		while(    temp!=null  ){
			size++;
			//
			temp=temp.nextNode;
		}
		return size;
	}
	//�����ڵ�
	public void showAllNode(   ){
		LinkedListType temp=this;
		int length=size(   );
		System.out.println("�ܹ���"+ length+"���ڵ�...,������:");
		while(    temp!=null  ){
			System.out.println( temp.t ); 
			//
			temp=temp.nextNode;
		}
	}
	//     add( t )
	public LinkedListType add(   T t  ){
		if(   this.t==null){
			this.t=t;
			return this;
		}
		LinkedListType<T> node=new LinkedListType<T>();
		if(   node==null   ){
			throw new RuntimeException("�����ڴ�ռ�ʧ��...");
		}
		//�½ڵ������
		node.t=t;   //������t�浽�½ڵ���
		node.nextNode=null;
		//ѭ��������������һ��Ԫ��
		//�쳣��headΪ�գ���  nodeΪ�׽ڵ�
		
		//ѭ ��
		LinkedListType temp=this;
		while(  temp.nextNode!=null  ){
			temp=temp.nextNode;
		}
		temp.nextNode=node;
		return this;
	}
	
	public LinkedListType addFirst(   T t){
		LinkedListType<T> node=new LinkedListType<T>();
		if(   node==null   ){
			throw new RuntimeException("�����ڴ�ռ�ʧ��...");
		}
		//�½ڵ������
		node.t=t;   //������t�浽�½ڵ���
		node.nextNode=this;
		return node;
	}
	
	public LinkedListType addLast(T t){
		return add( t);
	}
	
	public LinkedListType removeFirst( ){
		LinkedListType<T> newhead= this.nextNode;
		return newhead;
	}
	
	public LinkedListType removeLast( ){
		LinkedListType<T> temp=this;
		LinkedListType<T> pre=null;
		while(   temp!=null ){
			pre=temp;
			temp=temp.nextNode;
		}
		//�ҵ������һ���ڵ�
		pre.nextNode=null;
		return this;
	}
	
	public T get( int index){
		int i=0;
		LinkedListType<T> temp=this;
		while( temp!=null  ){
			if( i==index){
				return temp.t;
			}
			i++;
			temp=temp.nextNode;
		}
		throw new RuntimeException("�����±�Խ��");
	}
	
	public static void main(String[] args){
		LinkedListType head=new LinkedListType();
		head.add("tom");
		head.add("smith");
		
		System.out.println(   head.size(  ));
		
		System.out.println(  head.get(0));
		 head=head.removeFirst();
		System.out.println(  head.size()  );
		System.out.println(  head.get(0));
		
		
	}
	
	//TODO: ������...
	
	
	
}
