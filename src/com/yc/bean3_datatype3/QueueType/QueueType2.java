package com.yc.bean3_datatype3.QueueType;

import com.yc.bean3_datatype1.LinkedList.LinkedListType;

/**
 * ʹ��������Ϊ�ײ�洢ʵ��
 * @author Eden
 *
 */
public class QueueType2 {
	private static final int MAXLEN = Integer.MAX_VALUE;
	private LinkedListType data=new LinkedListType();   // TODO:
	private int head; // ��ͷ
	private int tail; // ��β

	public void init() {
		data=new LinkedListType();   //TODO:
		head = 0;
		tail = 0;
		System.gc();
	}

	// �ж��Ƿ�Ϊ�ն���
	public boolean isEmpty() {
		return head == tail ? true : false;
	}

	// �ж϶����Ƿ��Ѿ�����
	public boolean isFull() {
		return tail == MAXLEN ? true : false;
	}

	// ��ն���
	public void clear() {
		head = 0;
		tail = 0;
	}

	// ���: ���β, tail++
	public boolean enqueue(Object obj) {
		// �ж϶����Ƿ��Ѵ���
		if (tail == MAXLEN) {
			throw new RuntimeException("��������");
		}
		data.add(obj);   // TODO:
		tail++;
		return true;
	}

	// ���ӣ� ȡ����ͷԪ��
	public Object dequeue() {
		if (tail == head) {
			throw new RuntimeException("�����ѳ���...");
		}
		return data.get(head++);
	}

	// ͵��ͷ��ֵ
	public Object peek() {
		if (tail == head) {
			throw new RuntimeException("�����ѳ���...");
		}
		return data.get(head);
	}

	// ȡ��С
	public int size() {
		return tail - head;
	}

	public static void main(String[] args) {
		QueueType2 qt=new QueueType2();
		
		for( int i=0;i<100;i++){
			qt.enqueue(   i+5 );
		}
		System.out.println( qt.size() );
		System.out.println(   qt.peek() );
		
		for( int i=0;i<30;i++){
			System.out.println(  qt.dequeue());
		}
	}

}
