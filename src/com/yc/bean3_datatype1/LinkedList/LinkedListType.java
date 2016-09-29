package com.yc.bean3_datatype1.LinkedList;

/**
 * 单链表： 它是一个对象，这个对象中有两个元素，存真实对象，另一个元素是下一个节点的引用
 * 
 * @author Eden
 *
 * @param <T>
 */
public class LinkedListType<T> {
	// 链表存的元素的类型
	public T t;
	// 下一节点
	public LinkedListType<T> nextNode; 

	/**
	 * 获取链表的长度
	 * @return 链表的长度
	 */
	public int size() {
		int size = 0;
		LinkedListType<T> temp = this;
		// temp 不为空,说明头节点存在
		while (temp != null) {
			size++;
			temp = temp.nextNode;
		}
		return size;
	}

	/**
	 * 遍历链表信息
	 */
	public void showAllNode() {
		LinkedListType<T> temp = this;
		int length = size();
		System.out.println("总共有" + length + "个节点...,它们是:");
		while (temp != null) {
			System.out.println(temp.t);
			temp = temp.nextNode;
		}
	}

	/**
	 * 添加节点，默认在链表结尾添加节点
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
			throw new RuntimeException("申请内存空间失败...");
		}
		// 新节点的数据
		newNextNode.t = t; // 将数据t存到新节点中
		newNextNode.nextNode = null;
		// 循环查找链表的最后一个元素
		// 异常：head为空，则 node为首节点

		// 循 环查找 this这个节点的下一个节点，一直找到最后一个节点（nextNode==null）
		LinkedListType<T> temp = this;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNextNode;
		return this;
	}

	/**
	 * 在链表首部添加节点
	 * 
	 * @param t
	 *            作为头节点添加
	 * @return
	 */
	@SuppressWarnings("unused")
	public LinkedListType<T> addFirst(T t) {
		LinkedListType<T> newNode = new LinkedListType<T>();
		if (newNode == null) {
			throw new RuntimeException("申请内存空间失败...");
		}
		// 新节点的数据
		newNode.t = t; // 将数据t存到新节点中
		newNode.nextNode = this;
		return newNode;
	}

	/**
	 * 在链表结尾添加节点
	 * 
	 * @param t
	 * @return
	 */
	public LinkedListType<T> addLast(T t) {
		return add(t);
	}

	public LinkedListType<T> remove(T t) {
		// 快行指针
		// 下一节点
		LinkedListType<T> temp = this;
		// 上一节点
		LinkedListType<T> pre = null;
		while (temp != null) {
			if(temp.t.equals(t)){
				// 这个temp则是要删除的节点
				break;
			}
			pre=temp;
			temp=temp.nextNode;
		}
		// 当temp是空，pre是倒数第二个节点 找到了最后一个节点
		pre.nextNode = null;
		return this;
	}

	/**
	 * 删除第一个节点
	 * 
	 * @return LinkedListType<T> 变化后的链表
	 */
	public LinkedListType<T> removeFirst() {
		LinkedListType<T> newhead = this.nextNode;
		return newhead;
	}

	/**
	 * 删除最后一个元素
	 * 
	 * @return
	 */
	public LinkedListType<T> removeLast() {
		// 快行指针
		// 下一节点
		LinkedListType<T> temp = this;
		// 上一节点
		LinkedListType<T> pre = null;
		while (temp.nextNode != null) {
			pre = temp;
			temp = temp.nextNode;
		}
		// 当temp是空，pre是倒数第二个节点 找到了最后一个节点
		pre.nextNode = null;
		return this;
	}

	/**
	 * 根据索引取元素
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
		throw new RuntimeException("索引下标越界");
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
