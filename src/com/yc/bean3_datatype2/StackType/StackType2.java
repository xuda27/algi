package com.yc.bean3_datatype2.StackType;

import com.yc.bean3_datatype1.LinkedList.LinkedListType;

public class StackType2 {
	private static final int MAXLEN = 100;
	// ����ʹ�����Ա�Ҳ����ʹ������
	//private Object[] data = new Object[MAXLEN];
	private LinkedListType data=new LinkedListType();    //TODO:

	private int top; // ջ��

	// ��ʼ��ջ
	public void init() {
		top = 0;
		//data = new Object[MAXLEN];
		data =new LinkedListType();     //TODO:
		System.gc();
	}

	// �ж��Ƿ�Ϊ��ջ
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	// �ж�ջ�Ƿ��Ѿ�����
	public boolean isFull() {
		return top == MAXLEN ? true : false;
	}

	// ���ջ
	public void clear() {
		top = 0;
	}

	// ѹջ
	public boolean push(Object obj) {
		// �ж��Ƿ�yi��
		if (top >= MAXLEN) {
			throw new RuntimeException("ջ���");
		}
		//data[top] = obj;
		data.add(obj);   //TODO:
		top++;
		return true;
	}

	// ��ջ
	public Object pop() {
		// �ж��Ƿ�ջ��
		if (top == 0) {
			throw new RuntimeException("ջ�ѳ���.");
		}
		//return data[--top];
		return data.get(--top);   //TODO:
	}

	// ͵kuiջ��ֵ
	public Object peek() {
		// �ж��Ƿ�ջ��
		if (top == 0) {
			throw new RuntimeException("ջ�ѳ���.");
		}
		//return data[top - 1];
		return data.get(top-1);   //TODO:
	}
	
	//��ȡ��С
	public int size(){
		return top;
	}

	public static void main(String[] args) {
		StackType2 st=new StackType2();
		st.push("a");
		st.push("b");
		
		st.push("c");
		
		System.out.println(   st.size()  );
		
		System.out.println(   st.peek() );
		
		System.out.println( st.pop() );
		
		System.out.println( st.peek() );
		
	}

}
