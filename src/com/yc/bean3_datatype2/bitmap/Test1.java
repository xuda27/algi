package com.yc.bean3_datatype2.bitmap;

import java.util.BitSet;

/**
 * һ����վҪ�����Ծ�û�������ȥ��һ��ÿ�춼��¼���û���
 * @author xxx
 *
 */
public class Test1 {

	public static void main(String[] args) {
		//��һ
		BitSet monDay = new BitSet();
		monDay.set(1, true);
		monDay.set(2, false);
		monDay.set(3, true);
		monDay.set(4, true);
		monDay.set(5, true);
		monDay.set(6, true);
		//�ܶ�
		BitSet tuesDay = new BitSet();
		tuesDay.set(1, true);
		tuesDay.set(2, false);
		tuesDay.set(3, true);
		tuesDay.set(4, true);
		tuesDay.set(5, true);
		tuesDay.set(6, true);
		
		monDay.and(tuesDay);
	}

}
