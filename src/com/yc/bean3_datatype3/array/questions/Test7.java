package com.yc.bean3_datatype3.array.questions;

/**
 * ��һ���Ѿ���������飨���򣩣������п�����������������0����������Ԫ�صľ���ֵ��С������Ҫ�󣬲�����˳��Ƚϵķ��������Ӷ���ҪС��O��n����������ʹ���κ�����ʵ��

���磬����{-20��-13��-4, 6, 77,200} ������ֵ��С����-4��



�����Ľ��˼·�ǣ�

    1.�����е�Ԫ��ȫΪ����ȡ����ߵ����֣�

    2.�����е�Ԫ��ȫΪ����ȡ���ұߵ����ֵľ���ֵ��

    3.�������������и��������ö��ַ����ң��ж��м�Ԫ�صķ���

       a)�м�Ԫ��Ϊ���������ж��м�Ԫ��ǰ��һ��Ԫ�صķ���

       b)�м�Ԫ��Ϊ�����ж��м�Ԫ�غ�һ��Ԫ�صķ���

       c)�м�Ԫ��Ϊ�㣬������ڽ��ֵ����

�����Ǹ���������뷨�Ĵ���ʵ�֣�Ӧ�û�����©��
 *
 */
public class Test7 {
	public static void main(String[] args) {
		int [] arr={-22,-11,-5,-2,3,55,77,88,99,120};
		int min=minAbsoluteInSortedArray(   arr );
		System.out.println(    min );
	}
	
	public static int minAbsoluteInSortedArray(   int[] arr){
		int first=0;
		int last=arr.length-1;
		int result=0;
		//������ȫ�Ǹ�������ȡ���ұߵ���
		if(    arr[0]<0&&arr[last]<0){
			result=arr[last];
		}else if(  arr[0]>0&&arr[last]>0){
			result=arr[0];
		}else{
			//���ֲ���
			while(  first<last){
				int mid=(first+last)/2;
				if( arr[mid]>0){     //�м�Ԫ��Ϊ���������ж��м�Ԫ��ǰ��һ��Ԫ�صķ���
					if( arr[mid-1]>0){
						last=mid-1;
					}else if( arr[mid-1]<0){
						result=   -arr[mid-1]<arr[mid]?arr[mid-1]:arr[mid];
						break;
					}else{
						result=arr[mid-1];
						break;
					}
				}else if(  arr[mid]<0){
					if(  arr[mid+1]<0){
						first=mid+1;
					}else if(   arr[mid+1]>0){
						result=   -arr[mid]<arr[mid+1]?arr[mid]:arr[mid+1];
						break;
					}else{
						result=arr[mid+1];
						break;
					}
				}
			}
			
		}
		return result;
	}
}
