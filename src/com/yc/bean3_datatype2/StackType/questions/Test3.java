package com.yc.bean3_datatype2.StackType.questions;

import com.yc.bean3_datatype2.StackType.StackType;

/**
 * ʵ��һ��MyQueue��, ������ջ��ʵ��һ������. 
       �������:   ��Ҫ�޸�peek()��pop(), ���෴˳��ִ�в���. ���ǿ������õڶ���ջ��תԪ�صĴ���(����stackNew��Ԫ�أ�ѹ��stackOld).
 *
 */
public class Test3 {
	public static void main(String[] args) {
		MyQueue mq=new MyQueue();
		mq.enqueue(1);
		mq.enqueue(2);
		mq.enqueue(3);
		mq.enqueue(4);
		
		for( int i=0;i<4;i++){
			System.out.println( mq.dequeue() );
		}
	}
}

class MyQueue{
	StackType stackNew,stackOld;
	
	public MyQueue(){
		stackNew=new StackType();
		stackOld=new StackType();
	}
	
	public int size(){
		return stackNew.size()+stackOld.size();
	}
	/**
	 * ���,����Ԫ��ʼλ�����Ķ���
	 * @param value
	 */
	public void enqueue( Object value){
		stackNew.push(value);
	}
	
	private void shiftStack(){
		if( stackOld.isEmpty() ){
			while(  !stackNew.isEmpty() ){
				stackOld.push(   stackNew.pop());
			}
		}
	}
	//�鿴��ͷԪ�� 
	public Object peek(){
		shiftStack();
		return stackOld.peek();
	}
	//����
	public Object dequeue(){
		shiftStack();
		return stackOld.pop();
	}
}
