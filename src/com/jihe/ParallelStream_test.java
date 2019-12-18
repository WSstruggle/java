package com.jihe;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("王帅","谢雷","陈龙","陈盼盼");
		Stream<String> ps=list.parallelStream();
		if (ps.isParallel()) {
			System.out.println("这是一个并行流");
		}
		ps.limit(3).forEach(ls->System.out.println(ls));
	}

}
