package com.yc.bean1_recursion;

public class Test3 {

    public static void main(String[] args) {
        printHello("hello world", 10);
    }

    //�Եݹ�ʵ����� n��hello world.
    private static void printHello(String string, int i) {
        if (i < 1) {
            return;
        } else {
            System.out.println("��" + i + "��:" + string);
            printHello(string, i - 1);
        }
    }


}
