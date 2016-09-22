package com.yc.bean3_datatype3.QueueType;

//ʹ����������Ϊ�ײ�洢ʵ��
public class QueueType {
	private static final int MAXLEN = 100;
	private Object[] data = new Object[MAXLEN];
	private int head; // ��ͷ
	private int tail; // ��β

	public void init() {
		data = new Object[MAXLEN];
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
		data[tail] = obj;
		tail++;
		return true;
	}

	// ���ӣ� ȡ����ͷԪ��
	public Object dequeue() {
		if (tail == head) {
			throw new RuntimeException("�����ѳ���...");
		}
		return data[head++];
	}

	// ͵��ͷ��ֵ
	public Object peek() {
		if (tail == head) {
			throw new RuntimeException("�����ѳ���...");
		}
		return data[head];
	}

	// ȡ��С
	public int size() {
		return tail - head;
	}

	public static void main(String[] args) {
		QueueType qt=new QueueType();
		
		for( int i=0;i<10;i++){
			qt.enqueue(   i+5 );
		}
		System.out.println( qt.size() );
		System.out.println(   qt.peek() );
		
		for( int i=0;i<30;i++){
			System.out.println(  qt.dequeue());
		}
	}

}
