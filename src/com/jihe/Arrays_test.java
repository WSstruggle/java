package com.jihe;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2,12,18};
		System.out.println("����ǰ��");
		printarray(arr);
		Arrays.sort(arr);
		System.out.println("\n�����");
		printarray(arr);
		int index=Arrays.binarySearch(arr, 9);
		System.out.println("\nԪ��9�������������е�������:"+index);
		int[]copied=Arrays.copyOfRange(arr, 2,8);
		System.out.println("�������������ǣ�");
		printarray(copied);
		Arrays.fill(copied,8);
		System.out.println("\n���������������Ԫ��ȫ���滻��8���ǣ�");
		printarray(copied);
	}
	
	private static void printarray(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
