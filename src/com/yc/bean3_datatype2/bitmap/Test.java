package com.yc.bean3_datatype2.bitmap;

/**
 * ��ʹ���κ�һ���ڲ������㷨����һ�������Ԫ���������
 * λͼ�� Ͱ����
 *
 * @author Eden
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 3, 4, 6, 3, 4};
        int[] b = new int[7];

        for (int i = 0; i < b.length; i++) {
            for (int a : arr) {
                if (a == i) {
                    b[i]++;
                }
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (b[j] > 0) {
                System.out.print(j + " ");
            }
        }
    }
}
