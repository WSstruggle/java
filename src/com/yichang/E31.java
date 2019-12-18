package com.yichang;
class blcException extends Exception{

	public blcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public blcException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E31 {
	public static int divide(int x,int y) throws blcException{
		if(y==0) {
			throw new blcException("除数不能为0");
		}
			int result=x/y;
			return result;
	}
	public static void main(String[] args){
		try {
			int result=divide(4, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获异常为:"+e.getMessage());
		}
		
	}
}
