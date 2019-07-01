package com.yc.bean3_datatype1.LinkedList.questions;

import com.yc.bean3_datatype1.LinkedList.LinkedListType;

public class Test3 {

    /**
     * �Ը���ֵx Ϊ��׼�������Ϊ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ��
     * ˼·�� ������������һ�������С��x��Ԫ�أ�һ���������ڻ����x��Ԫ��.
     * ѭ������������Ԫ�ز����������������������������������ɣ��ٺϲ���������
     */
    public static void main(String[] args) {
        LinkedListType llt = new LinkedListType();
        llt.add(100);
        llt.add(20);
        llt.add(32);
        llt.add(41);
        llt.add(25);

        LinkedListType head = partition(llt, 40);

        for (int i = 0; i < head.size(); i++) {
            System.out.println(head.get(i));
        }
    }

    public static LinkedListType partition(LinkedListType head, Comparable obj) {
        LinkedListType beforeStart = null;
        LinkedListType afterStart = null;

        while (head != null) {
            LinkedListType next = head.nextNode;
            //�жϴ�С���浽��Ӧ��������
            if (obj.compareTo(head.t) > 0) {
                head.nextNode = beforeStart;
                beforeStart = head;
            } else {
                head.nextNode = afterStart;
                afterStart = head;
            }
            head = next;
        }
        //�ϲ�
        //���ж�beforeStart�Ƿ�Ϊ��
        if (beforeStart == null) {
            return afterStart;
        }
        LinkedListType newHead = beforeStart;   //��beforeStart���������ǰ�벿��
        while (beforeStart.nextNode != null) {
            beforeStart = beforeStart.nextNode;
        }
        beforeStart.nextNode = afterStart;
        return newHead;
    }

}
