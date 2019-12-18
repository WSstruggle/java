package com.jihe;

import java.util.*;
import java.util.Map.Entry;


public class HashMap_test {
	public static void main(String[] args) {
		Map<String, String> hmap = new HashMap<String, String>();
		hmap.put("1", "��˧");
		hmap.put("2", "������");
		hmap.put("3", "л��");
		hmap.put("4", "����");
		System.out.println(hmap);
		if (hmap.containsKey("1")) {
			System.out.println("���HashMap���ϰ�����1");
		}
		System.out.println("���HashMap���ϼ�1��ֵΪ��" + hmap.get("1"));
		// ����������еļ�
		System.out.println("������������еļ��ǣ�" + hmap.keySet());
		System.out.println("������������е�ֵ�ǣ�" + hmap.values());
		// �滻
		hmap.replace("2", "���");
		System.out.println("����2��ֵ�滻Ϊ��骣�" + hmap);
		// ����
		hmap.put("5", "�ź�");
		System.out.println("���Ӽ�ֵ��5����" + hmap);
		// ɾ���ƶ���
		hmap.remove("2");
		System.out.println("ɾ����2��" + hmap);

		// �õ�������������
		System.out.println("�ü�������ȡ���ϵļ�ֵ");
		Set<String> keySet = hmap.keySet();
		Iterator<String> diedai = keySet.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = hmap.get(key);
			System.out.println(key + ":" + value);
		}
		// �õ�������������
		System.out.println("�ü�ֵ������ȡ���ϵļ�ֵ");
		Set<Entry<String, String>> jianzhiduiji = hmap.entrySet();
		Iterator<Entry<String, String>> diedai2 = jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			Map.Entry<String,String> jianzhidui=(Map.Entry<String,String>)diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key + ":" + value);
		}
		// ��foreachѭ����������
		System.out.println("��forEachѭ���������ϣ�");
		hmap.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("��forEachѭ������˫�б��ϵ�ֵ��");
		Collection<String> jianji=hmap.values();
		jianji.forEach(value -> System.out.println(value));
		
		Map<String, String> hmap2 = new LinkedHashMap<String, String>();
		hmap2.put("2", "��˧");
		hmap2.put("1", "������");
		hmap2.put("4", "л��");
		hmap2.put("3", "����");
		System.out.println(hmap2);
	}
}
