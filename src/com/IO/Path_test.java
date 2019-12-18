package com.IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

	public static void main(String[] args) {
		Path path=Paths.get("E:\\办公室\\2017-2018下学期\\清明诗会");
		System.out.println("这个路径的根路径是:"+path.getRoot());
		System.out.println("这个路径的父路径是："+path.getParent());
		System.out.println("这个路径的路径名称数:"+path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("索引为"+i+"的路径路径名称是"+path.getName(i));
		}
		System.out.println("这个路径的URL路径是"+path.toUri());
		System.out.println("这个路径的绝对路径是"+path.toAbsolutePath());


	}

}
