package com.yc.bean3_datatype2.StackType.questions;

import com.yc.bean3_datatype2.StackType.StackType;

/**
 * 2. ���һ��ջ������pop(), push()�⣬����min�����ɷ���ջ����С��ֵ��
 * ��������� ���ö����stackType����¼
 */
public class Test2 {

	public static void main(String[] args) {
		MyStack2 ms=new MyStack2();
		ms.push(1);
		ms.push(3);
		ms.push(22);
		
		System.out.println( ms.min()  );
		System.out.println( ms.max()  );
		ms.pop();
		System.out.println( ms.min()  );
		System.out.println( ms.max()  );
		ms.pop();
		System.out.println( ms.min()  );
		System.out.println( ms.max()  );
	}

}

class MyStack2 extends StackType {
	// ����һ����ջ�����ڴ浱ǰ���ջ����С��ֵ
	private StackType mins = new StackType();
	private StackType maxs= new StackType();

	/**
	 * ѹջ
	 * @param obj
	 * @return
	 */
	public boolean push(Comparable obj) {
		// ��ȡ����ǰջ����С��ֵ,���Ա�֤mins���ջ�е�ջ��������Сֵ
		if (min()==null||obj.compareTo(min()) < 0) {
			mins.push(obj);
		}
		if (max()==null||obj.compareTo(max()) > 0) {
			maxs.push(obj);
		}
		return super.push(obj);
	}

	// ��ջ:��ջʱ���п��Խ���Сֵ��ջ��ȥ��������ҲҪ��֤mins��ҲҪ����Сֵȥ��
	public Object pop() {
		Comparable obj=(Comparable) super.pop();
		if(  obj.compareTo(min())==0){
			mins.pop();
		}
		if(  obj.compareTo(max())==0){
			maxs.pop();
		}
		return obj;
	}

	public Comparable min() {
		if (mins.isEmpty()) {
			return null;
		}else{
			return (Comparable) mins.peek();   //ȡ��mins����С��ֵ
		}
	}
	
	public Comparable max() {
		if (maxs.isEmpty()) {
			return null;
		}else{
			return (Comparable) maxs.peek();   //ȡ��mins����С��ֵ
		}
	}
}
