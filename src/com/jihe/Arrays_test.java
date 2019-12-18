package com.jihe;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2,12,18};
		System.out.println("排序前：");
		printarray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后：");
		printarray(arr);
		int index=Arrays.binarySearch(arr, 9);
		System.out.println("\n元素9在排序后的数组中的索引是:"+index);
		int[]copied=Arrays.copyOfRange(arr, 2,8);
		System.out.println("被拷贝的数组是：");
		printarray(copied);
		Arrays.fill(copied,8);
		System.out.println("\n被拷贝的数组里的元素全部替换成8后是：");
		printarray(copied);
	}
	
	private static void printarray(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
