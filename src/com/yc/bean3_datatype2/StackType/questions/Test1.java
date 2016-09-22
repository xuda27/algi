package com.yc.bean3_datatype2.StackType.questions;

/**
 * 1. ֻ��һ������ʵ������ջ. �������������������ֳ����ȷݣ���ÿ��ջ�����������ڸ��ԵĿռ��С� ������ջ1ʹ�� 0-n/3, ջ2ʹ��
 * n/3-2n/3, ջ3ʹ�� 2n/3-n
 *
 */
public class Test1 {

	public static void main(String[] args) {
		MyStack ms=new MyStack();
		ms.push(0, 1);
		ms.push(0, 2);
		ms.push(0, 3);
		ms.push(0, 4);
		ms.push(1, 5);
		ms.push(1, 6);
		ms.push(1, 7);
		ms.push(1, 8);
		ms.push(2, 80);
		
		for( int t: ms.buffer){
			System.out.print(    t+"\t" );
		}
	}

}

class MyStack {

	int stackSize = 10;
	int[] buffer = new int[3 * stackSize];
	int[] stackPointer = { -1, -1, -1 }; // ÿ��ջ��ջ��ָ��

	public boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == -1;
	}

	public int size(int stackNum) {
		return stackPointer[stackNum] + 1;
	}

	public boolean isFull(int stackNum) {
		return stackPointer[stackNum] == (stackSize - 1);
	}

	// ��ջ
	public void push(int stackNum, int value) {
		// �ж�stackNum��ָ����ջ�Ƿ�����
		if (isFull(stackNum)) {
			throw new RuntimeException("stack " + stackNum + " is full");
		}
		stackPointer[stackNum]++;
		// ��ֵ buffer[0] buffer[100] buffer[200]
		int index = absPosStack(stackNum);
		buffer[index] = value;

	}

	// ��ջ
	public int pop(int stackNum) {
		// �ж�stackNum��ָ����ջ�Ƿ��ѿ�
		if (stackPointer[stackNum] == -1) {
			throw new RuntimeException("stack " + stackNum + " is empty");
		}
		int index = absPosStack(stackNum); // ȡ��ջ��������
		int value = buffer[index];
		stackPointer[stackNum]--;
		return value;
	}
	
	// ��ջ
		public int peek(int stackNum) {
			// �ж�stackNum��ָ����ջ�Ƿ��ѿ�
			if (stackPointer[stackNum] == -1) {
				throw new RuntimeException("stack " + stackNum + " is empty");
			}
			int index = absPosStack(stackNum); // ȡ��ջ��������
			int value = buffer[index];
			return value;
		}

	private int absPosStack(int stackNum) {
		return stackNum * stackSize + stackPointer[stackNum];
	}
}
