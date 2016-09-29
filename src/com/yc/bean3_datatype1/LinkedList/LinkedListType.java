package com.yc.bean3_datatype1.LinkedList;

/**
 * ������ ����һ���������������������Ԫ�أ�����ʵ������һ��Ԫ������һ���ڵ������
 * 
 * @author Eden
 *
 * @param <T>
 */
public class LinkedListType<T> {
	// ������Ԫ�ص�����
	public T t;
	// ��һ�ڵ�
	public LinkedListType<T> nextNode; 

	/**
	 * ��ȡ����ĳ���
	 * @return ����ĳ���
	 */
	public int size() {
		int size = 0;
		LinkedListType<T> temp = this;
		// temp ��Ϊ��,˵��ͷ�ڵ����
		while (temp != null) {
			size++;
			temp = temp.nextNode;
		}
		return size;
	}

	/**
	 * ����������Ϣ
	 */
	public void showAllNode() {
		LinkedListType<T> temp = this;
		int length = size();
		System.out.println("�ܹ���" + length + "���ڵ�...,������:");
		while (temp != null) {
			System.out.println(temp.t);
			temp = temp.nextNode;
		}
	}

	/**
	 * ��ӽڵ㣬Ĭ���������β��ӽڵ�
	 * 
	 * @param t
	 * @return
	 */
	@SuppressWarnings("unused")
	public LinkedListType<T> add(T t) {
		if (this.t == null) {
			this.t = t;
			return this;
		}
		LinkedListType<T> newNextNode = new LinkedListType<T>();
		if (newNextNode == null) {
			throw new RuntimeException("�����ڴ�ռ�ʧ��...");
		}
		// �½ڵ������
		newNextNode.t = t; // ������t�浽�½ڵ���
		newNextNode.nextNode = null;
		// ѭ��������������һ��Ԫ��
		// �쳣��headΪ�գ��� nodeΪ�׽ڵ�

		// ѭ ������ this����ڵ����һ���ڵ㣬һֱ�ҵ����һ���ڵ㣨nextNode==null��
		LinkedListType<T> temp = this;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNextNode;
		return this;
	}

	/**
	 * �������ײ���ӽڵ�
	 * 
	 * @param t
	 *            ��Ϊͷ�ڵ����
	 * @return
	 */
	@SuppressWarnings("unused")
	public LinkedListType<T> addFirst(T t) {
		LinkedListType<T> newNode = new LinkedListType<T>();
		if (newNode == null) {
			throw new RuntimeException("�����ڴ�ռ�ʧ��...");
		}
		// �½ڵ������
		newNode.t = t; // ������t�浽�½ڵ���
		newNode.nextNode = this;
		return newNode;
	}

	/**
	 * �������β��ӽڵ�
	 * 
	 * @param t
	 * @return
	 */
	public LinkedListType<T> addLast(T t) {
		return add(t);
	}

	public LinkedListType<T> remove(T t) {
		// ����ָ��
		// ��һ�ڵ�
		LinkedListType<T> temp = this;
		// ��һ�ڵ�
		LinkedListType<T> pre = null;
		while (temp != null) {
			if(temp.t.equals(t)){
				// ���temp����Ҫɾ���Ľڵ�
				break;
			}
			pre=temp;
			temp=temp.nextNode;
		}
		// ��temp�ǿգ�pre�ǵ����ڶ����ڵ� �ҵ������һ���ڵ�
		pre.nextNode = null;
		return this;
	}

	/**
	 * ɾ����һ���ڵ�
	 * 
	 * @return LinkedListType<T> �仯�������
	 */
	public LinkedListType<T> removeFirst() {
		LinkedListType<T> newhead = this.nextNode;
		return newhead;
	}

	/**
	 * ɾ�����һ��Ԫ��
	 * 
	 * @return
	 */
	public LinkedListType<T> removeLast() {
		// ����ָ��
		// ��һ�ڵ�
		LinkedListType<T> temp = this;
		// ��һ�ڵ�
		LinkedListType<T> pre = null;
		while (temp.nextNode != null) {
			pre = temp;
			temp = temp.nextNode;
		}
		// ��temp�ǿգ�pre�ǵ����ڶ����ڵ� �ҵ������һ���ڵ�
		pre.nextNode = null;
		return this;
	}

	/**
	 * ��������ȡԪ��
	 * @param index
	 * @return
	 */
	public T get(int index) {
		int i = 0;
		LinkedListType<T> temp = this;
		while (temp != null) {
			if (i == index) {
				return temp.t;
			}
			i++;
			temp = temp.nextNode;
		}
		throw new RuntimeException("�����±�Խ��");
	}

	public static void main(String[] args) {
		LinkedListType<String> head = new LinkedListType<String>();
		head.add("tom");
		head.add("smith");

		System.out.println(head.size());

		System.out.println(head.get(0));
		head = head.removeFirst();
		System.out.println(head.size());
		System.out.println(head.get(0));

	}
}
