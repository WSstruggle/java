package api;

public class E56 {

	public static void main(String[] args) {
		//substring��ȡ
		String s="2019-10-12";
		System.out.println("������"+s.substring(0,4)+"��");
		System.out.println("������"+s.substring(5,7)+"��");
		System.out.println("������"+s.substring(8)+"��");
		//split�ָ�
		String[] zfsz=s.split("-");
		System.out.println("������"+zfsz[0]+"��"+zfsz[1]+"��"+zfsz[2]+"��");
	}

}
