package com.jihe;

import java.util.*;
import java.util.Map.Entry;


public class HashMap_test {
	public static void main(String[] args) {
		Map<String, String> hmap = new HashMap<String, String>();
		hmap.put("1", "王帅");
		hmap.put("2", "陈盼盼");
		hmap.put("3", "谢雷");
		hmap.put("4", "陈龙");
		System.out.println(hmap);
		if (hmap.containsKey("1")) {
			System.out.println("这个HashMap集合包含健1");
		}
		System.out.println("这个HashMap集合键1的值为：" + hmap.get("1"));
		// 输出集合所有的键
		System.out.println("这个集合中所有的键是：" + hmap.keySet());
		System.out.println("这个集合中所有的值是：" + hmap.values());
		// 替换
		hmap.replace("2", "王楠");
		System.out.println("将键2的值替换为王楠：" + hmap);
		// 增加
		hmap.put("5", "张浩");
		System.out.println("增加键值（5）：" + hmap);
		// 删除制定键
		hmap.remove("2");
		System.out.println("删除键2后：" + hmap);

		// 用迭代来便利集合
		System.out.println("用键集来获取集合的键值");
		Set<String> keySet = hmap.keySet();
		Iterator<String> diedai = keySet.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = hmap.get(key);
			System.out.println(key + ":" + value);
		}
		// 用迭代来便利集合
		System.out.println("用键值对来获取集合的键值");
		Set<Entry<String, String>> jianzhiduiji = hmap.entrySet();
		Iterator<Entry<String, String>> diedai2 = jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			Map.Entry<String,String> jianzhidui=(Map.Entry<String,String>)diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key + ":" + value);
		}
		// 用foreach循环遍历集合
		System.out.println("用forEach循环遍历集合：");
		hmap.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("用forEach循环遍历双列表集合的值：");
		Collection<String> jianji=hmap.values();
		jianji.forEach(value -> System.out.println(value));
		
		Map<String, String> hmap2 = new LinkedHashMap<String, String>();
		hmap2.put("2", "王帅");
		hmap2.put("1", "陈盼盼");
		hmap2.put("4", "谢雷");
		hmap2.put("3", "陈龙");
		System.out.println(hmap2);
	}
}
