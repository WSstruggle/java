package api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("�������ֵ�Ľ��"+Math.abs(-1));
		System.out.println("�������ҵĽ��"+Math.sin(1.57));
		System.out.println("�������ҵĽ��"+Math.cos(2.0));
		System.out.println("�������еĽ��"+Math.tan(0.8));
		System.out.println("����ƽ�����Ľ��"+Math.sqrt(4));
		System.out.println("�����������Ľ��"+Math.cbrt(27));
		System.out.println("����˷��Ľ��"+Math.pow(2, 2));
		//ceil���컨��,floor:�ذ�
		System.out.println("�����3.4����С����:"+Math.ceil(3.4));
		System.out.println("��С��3.4���������:"+Math.floor(3.4));
		System.out.println("��5.8�������������Ľ��:"+Math.round(5.8));
		System.out.println("��5.9��5.8�Ľϴ�ֵ:"+Math.max(5.9,5.8));
		System.out.println("��6.2��6.6�Ľ�Сֵ:"+Math.min(6.2,6.6));
		System.out.println("��С��ȡ��:"+(int)(5.5));
		System.out.println("����һ�����ڵ���0.0С��1.0�����ֵ"+Math.random());
	}

}
