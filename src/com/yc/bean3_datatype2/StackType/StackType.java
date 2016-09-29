package com.yc.bean3_datatype2.StackType;
/**
 * 栈：
 * 	特点：后进先出
 * 	应用：撤销和重做
 * @author Eden
 *
 */
public class StackType<T> {
	protected static final int MAXLEN = 100;
	// 可以使用线性表，也可以使用链表
	protected Object[] data = new Object[MAXLEN];
	
	// 记录栈顶的指针
	protected int top; // 栈顶

	/**
	 * 初始化栈
	 */
	public void init() {
		top = 0;
		data = new Object[MAXLEN];
		System.gc();
	}

	/**
	 * 判断是否为空
	 * @return true:空
	 */
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	/**
	 * 判断是否已经存满
	 * @return
	 */
	public boolean isFull() {
		return top == MAXLEN ? true : false;
	}

	/**
	 * 清空栈
	 */
	public void clear() {
		top = 0;
	}

	/**
	 * 压栈
	 * @param obj
	 * @return
	 */
	public boolean push(T obj) {
		// 判断是否溢出
		if (top >= MAXLEN) {
			throw new RuntimeException("栈溢出");
		}
		data[top] = obj;
		top++;
		return true;
	}

	/**
	 *  出栈
	 * @return
	 */
	public T pop() {
		// 判断是否到栈底
		if (top == 0) {
			throw new RuntimeException("栈已清空.");
		}
		return (T) data[--top];
	}

	/**
	 * 查看栈顶值
	 * @return pop值
	 */
	public T peek() {
		// 判断是否到栈底
		if (top == 0) {
			throw new RuntimeException("栈已出空.");
		}
		return (T) data[top - 1];
	}
	
	/**
	 * 获取大小
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
