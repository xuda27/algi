package com.yc.bean3_datatype3.array.questions;

/**
 * ������������������a��b, ����a��δ�����㹻�Ŀռ�����b,,��дһ����������b�ϲ���a������. 
     �������:  ����������ʼ�Ƚϣ�������Ԫ�طŵ�����a�����
 */
public class Test1 {

	public static void main(String[] args){
		int[] x=new int[]{2,4,7,99,100,200,0,0,0,0,0};
		int[] y={3,6,8,9,220};
		merge(x,y,6,5);
		for(   int t: x){
			System.out.print( t+"\t");
		}
	}
	
	/**
	 * �ϲ�
	 * @param a: ��һ����������
	 * @param b: �ڶ�����������
	 * @param lastA: ��һ���������Ч���ݵĳ���
	 * @param lastB: �ڶ����������Ч���ݵĳ���
	 */
	public static void merge( int[] a, int [] b, int lastA, int lastB){
		int indexA=lastA-1;
		int indexB=lastB-1;
		
		int indexmerged=lastA+lastB-1;  //�ϲ������Ԫ�ص�����
		while(  indexA>=0&&indexB>=0 ){
			if(  a[indexA]>b[indexB]){
				a[indexmerged]=a[indexA];
				indexmerged--;
				indexA--;
			}else{
				a[indexmerged]=b[indexB];
				indexmerged--;
				indexB--;
			}
		}
		
		while(     indexB>=0){
			a[indexmerged]=b[indexB];
			indexmerged--;
			indexB--;
		}
		//������ b ����Ԫ�غ󣬲���Ҫ����a��shengyuԪ��.
	}
}
