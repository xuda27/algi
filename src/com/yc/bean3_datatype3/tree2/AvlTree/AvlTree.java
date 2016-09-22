package com.yc.bean3_datatype3.tree2.AvlTree;

import com.yc.bean3_datatype3.tree1.BinarySearchTree.BinarySearchTree;

/**
 * ƽ�������: ƽ�������Ҫ�����ÿһ���ڵ���˵���������������ĸ߶�֮��ܳ���1������������ɾ��һ���ڵ�ʹ�ø߶�֮�����1����Ҫ���нڵ�֮�����ת��������������ά����һ��ƽ��״̬��
 *
 * ƽ�������ʵ�ֵĴ󲿷ֹ��̺Ͷ����������һ���ģ�ѧƽ�������֮ǰһ��Ҫ����������������������ڲ����ɾ��֮��Ҫдһ����ת�㷨ȥά��ƽ�⣬ά��ƽ����Ҫ����һ���ڵ�߶ȵ����ԡ�

 * Comparable find( x) 
 * Comparable findMin()
 * Comparable findMax() 
 * boolean isEmpty() 
 * void makeEmpty() 
 * 
 *  * void insert( x) 
 * void remove( x) 
 * 
 * void printTree()
 * 
 * static int height(AvlNode t)  �� ��ת�㷨��Ҫ������һ�����ܵĸ����������ĸ߶ȡ�����涨��һ�ÿ����ĸ߶�Ϊ-1��ֻ��һ�����ڵ�����ĸ߶�Ϊ0���Ժ�ÿ��һ��߶ȼ�1
 * 
 * 
 */
public class AvlTree {
	private AvlNode root;

	public AvlTree() {
		root = null;
	}

	public void insert(Comparable x) {
		root = insert(x, root);
	}
	/**
	 * @param x
	 *           Ҫ����Ľڵ�
	 * @param t
	 *            ���ĸ��ڵ�
	 * @return �µĸ��ڵ�
	 */
	private AvlNode insert(Comparable x, AvlNode t) {
		if (t == null)
			t = new AvlNode(x, null, null);
		else if (x.compareTo(t.element) < 0) {   //x��ֵС�� t.element,��ŵ�������. 
			t.left = insert(x, t.left);    //�ݹ���뵽������
			//����֦�ڵ�߶Ȳ�Ϊ2
			if (height(t.left) - height(t.right) == 2)
				if (x.compareTo(t.left.element) < 0)
					t = rotateWithLeftChild(t);
				else
					t = doubleWithLeftChild(t);
		} else if (x.compareTo(t.element) > 0) {   //x��ֵ����  t.element,��ŵ�������. 
			t.right = insert(x, t.right);          //�ݹ��������. 
			//TODO:
			if (height(t.right) - height(t.left) == 2)
				if (x.compareTo(t.right.element) > 0)
					t = rotateWithRightChild(t);
				else
					t = doubleWithRightChild(t);
		} else
			; // ����Ľڵ���t��element��ͬ�������.
		//�½ڵ�ĸ߶�Ϊ����������߸߶�+1
		t.height = max(height(t.left), height(t.right)) + 1;
		return t;
	}

	/**
	 * ɾ����û��ʵ��.
	 * @param x
	 */
	public void remove(Comparable x) {
		System.out.println("Sorry, remove unimplemented");
	}

	/**
	 * ������С�ڵ��д��Ԫ��.
	 * @return 
	 */
	public Comparable findMin() {
		return elementAt(findMin(root));
	}
	
	/**
	 * @param t
	 * @return ��Сֵ�Ľڵ�
	 */
	private AvlNode findMin(AvlNode t) {
		if (t == null)
			return t;
		while (t.left != null)
			t = t.left;
		return t;
	}

	/**
	 * �������ֵԪ��
	 */
	public Comparable findMax() {
		return elementAt(findMax(root));
	}
	
	/**
	 * @param t
	 * @return 
	 */
	private AvlNode findMax(AvlNode t) {
		if (t == null)
			return t;
		while (t.right != null)
			t = t.right;
		return t;
	}

	/**
	 * �����в���ĳ��Ԫ��
	 * @param x
	 * @return 
	 */
	public Comparable find(Comparable x) {
		return elementAt(find(x, root));
	}
	
	/**
	 * @param x
	 * @param t
	 * @return 
	 */
	private AvlNode find(Comparable x, AvlNode t) {
		while (t != null)
			if (x.compareTo(t.element) < 0)
				t = t.left;
			else if (x.compareTo(t.element) > 0)
				t = t.right;
			else
				return t; // Match

		return null; // No match
	}

	/**
	 * �����ڵ���null
	 */
	public void makeEmpty() {
		root = null;
	}

	/**
	 * �жϸ��ڵ��Ƿ�Ϊ��.
	 * @return 
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * ��ʾ��
	 */
	public void printTree() {
		if (isEmpty())
			System.out.println("Empty tree");
		else
			printTree(root);
	}
	/**
	 * @param t
	 */
	private void printTree(AvlNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}

	/**
	 * @param t
	 * @return ��ʾ�ڵ��е�Ԫ��ֵ
	 */
	private Comparable elementAt(AvlNode t) {
		return t == null ? null : t.element;
	}
	

	/**
	 * �������ڵ�ĸ߶�
	 */
	private static int height(AvlNode t) {
		return t == null ? -1 : t.height;
	}

	/**
	 * ������ֵ
	 */
	private static int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;
	}

	/**
	 * ����ת�� ������ת�����
	 */
	private static AvlNode rotateWithLeftChild(AvlNode k2) {
		AvlNode k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		k2.height = max(height(k2.left), height(k2.right)) + 1;
		k1.height = max(height(k1.left), k2.height) + 1;
		return k1;
	}

	/**
	 * ����ת��������ת�����
	 */
	private static AvlNode rotateWithRightChild(AvlNode k1) {
		AvlNode k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		k1.height = max(height(k1.left), height(k1.right)) + 1;
		k2.height = max(height(k2.right), k1.height) + 1;
		return k2;
	}

	/**
	 * Double rotate binary tree node: first left child with its right child;
	 * then node k3 with new left child. For AVL trees, this is a double
	 * rotation for case 2. Update heights, then return new root.
	 */
	private static AvlNode doubleWithLeftChild(AvlNode k3) {
		k3.left = rotateWithRightChild(k3.left);
		return rotateWithLeftChild(k3);
	}

	/**
	 * Double rotate binary tree node: first right child with its left child;
	 * then node k1 with new right child. For AVL trees, this is a double
	 * rotation for case 3. Update heights, then return new root.
	 */
	private static AvlNode doubleWithRightChild(AvlNode k1) {
		k1.right = rotateWithLeftChild(k1.right);
		return rotateWithRightChild(k1);
	}

	
	

	/*// Test program
	public static void main( String [ ] args )
    {
        AvlTree t = new AvlTree( );
        final int NUMS = 4000;
        final int GAP  =   37;

        System.out.println( "Checking... (no more output means success)" );

        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( new MyInteger( i ) );

        if( NUMS < 40 )
            t.printTree( );
        if( ((MyInteger)(t.findMin( ))).intValue( ) != 1 ||
            ((MyInteger)(t.findMax( ))).intValue( ) != NUMS - 1 )
            System.out.println( "FindMin or FindMax error!" );

        for( int i = 1; i < NUMS; i++ )
             if( ((MyInteger)(t.find( new MyInteger( i ) ))).intValue( ) != i )
                 System.out.println( "Find error1!" );
    }*/
}
