package com.yc.bean3_datatype2.StackType;
/**
 * ջ��
 * 	�ص㣺����ȳ�
 * 	Ӧ�ã�����������
 * @author Eden
 *
 */
public class StackType<T> {
	protected static final int MAXLEN = 100;
	// ����ʹ�����Ա�Ҳ����ʹ������
	protected Object[] data = new Object[MAXLEN];
	
	// ��¼ջ����ָ��
	protected int top; // ջ��

	/**
	 * ��ʼ��ջ
	 */
	public void init() {
		top = 0;
		data = new Object[MAXLEN];
		System.gc();
	}

	/**
	 * �ж��Ƿ�Ϊ��
	 * @return true:��
	 */
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	/**
	 * �ж��Ƿ��Ѿ�����
	 * @return
	 */
	public boolean isFull() {
		return top == MAXLEN ? true : false;
	}

	/**
	 * ���ջ
	 */
	public void clear() {
		top = 0;
	}

	/**
	 * ѹջ
	 * @param obj
	 * @return
	 */
	public boolean push(T obj) {
		// �ж��Ƿ����
		if (top >= MAXLEN) {
			throw new RuntimeException("ջ���");
		}
		data[top] = obj;
		top++;
		return true;
	}

	/**
	 *  ��ջ
	 * @return
	 */
	public T pop() {
		// �ж��Ƿ�ջ��
		if (top == 0) {
			throw new RuntimeException("ջ�����.");
		}
		return (T) data[--top];
	}

	/**
	 * �鿴ջ��ֵ
	 * @return popֵ
	 */
	public T peek() {
		// �ж��Ƿ�ջ��
		if (top == 0) {
			throw new RuntimeException("ջ�ѳ���.");
		}
		return (T) data[top - 1];
	}
	
	/**
	 * ��ȡ��С
	 * @return
	 */
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
