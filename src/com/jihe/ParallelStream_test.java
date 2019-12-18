package com.jihe;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("��˧","л��","����","������");
		Stream<String> ps=list.parallelStream();
		if (ps.isParallel()) {
			System.out.println("����һ��������");
		}
		ps.limit(3).forEach(ls->System.out.println(ls));
	}

}
