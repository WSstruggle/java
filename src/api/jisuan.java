package api;

public class jisuan {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		for(long i=0;i<10000000000l;i++) {
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从0加到1亿运行时间为:"+(jssj-kssj)+"毫秒");
	}

}
