package com.yc.bean3_datatype2.StackType;

public class StackType {
	protected static final int MAXLEN = 100;
	// ����ʹ�����Ա�Ҳ����ʹ������
	protected Object[] data = new Object[MAXLEN];

	protected int top; // ջ��

	// ��ʼ��ջ
	public void init() {
		top = 0;
		data = new Object[MAXLEN];
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
		data[top] = obj;
		top++;
		return true;
	}

	// ��ջ
	public Object pop() {
		// �ж��Ƿ�ջ��
		if (top == 0) {
			throw new RuntimeException("ջ�ѳ���.");
		}
		return data[--top];
	}

	// ͵kuiջ��ֵ
	public Object peek() {
		// �ж��Ƿ�ջ��
		if (top == 0) {
			throw new RuntimeException("ջ�ѳ���.");
		}
		return data[top - 1];
	}
	
	//��ȡ��С
	public int size(){
		return top;
	}

	public static void main(String[] args) {
		StackType st=new StackType();
		st.push("a");
		st.push("b");
		
		st.push("c");
		
		System.out.println(   st.size()  );
		
		System.out.println(   st.peek() );
		
		System.out.println( st.pop() );
		
		System.out.println( st.peek() );
		
	}

}
