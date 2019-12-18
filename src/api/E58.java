package api;

public class E58 {

	public static void main(String[] args) {
		String s="我爱你中国";
		System.out.println(s);
		StringBuffer zfhc=new StringBuffer(s);
		//添加
		zfhc.append("!");
		System.out.println(zfhc);
		zfhc.insert(3,',');
		System.out.println(zfhc);
		//删除
		zfhc.delete(2,4);
		System.out.println(zfhc);
		//修改
		zfhc.replace(2,4,"湖北");
		System.out.println(zfhc);
		//翻转
		zfhc.reverse();
		System.out.println(zfhc);
	}

}
