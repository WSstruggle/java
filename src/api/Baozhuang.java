package api;

public class Baozhuang {

	public static void main(String[] args) {
		int a = 20;
		//�Զ�װ��
		Integer b=a;
		//�Զ�����
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String Age="55";
		System.out.println(Age);
		System.out.println("NO.1:��װ��valueOf����-->"+(Integer.valueOf(Age)+10));
		System.out.println("NO.2:ParseXxx����-->"+Integer.parseInt(Age));
		System.out.println("NO.3:���췽��-->"+new Integer(Age));
		Integer zs=88;
		System.out.println("NO.1:��װ���valueOf����-->"+String.valueOf(zs));
		System.out.println("NO.2:��װ���tostring����-->"+zs.toString());
		System.out.println("NO.3:���췽��-->"+zs+" ");
	}

}
