package api;

public class E58 {

	public static void main(String[] args) {
		String s="�Ұ����й�";
		System.out.println(s);
		StringBuffer zfhc=new StringBuffer(s);
		//���
		zfhc.append("!");
		System.out.println(zfhc);
		zfhc.insert(3,',');
		System.out.println(zfhc);
		//ɾ��
		zfhc.delete(2,4);
		System.out.println(zfhc);
		//�޸�
		zfhc.replace(2,4,"����");
		System.out.println(zfhc);
		//��ת
		zfhc.reverse();
		System.out.println(zfhc);
	}

}
