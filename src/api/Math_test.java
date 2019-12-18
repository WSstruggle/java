package api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("计算绝对值的结果"+Math.abs(-1));
		System.out.println("计算正弦的结果"+Math.sin(1.57));
		System.out.println("计算余弦的结果"+Math.cos(2.0));
		System.out.println("计算正切的结果"+Math.tan(0.8));
		System.out.println("计算平方根的结果"+Math.sqrt(4));
		System.out.println("计算立方根的结果"+Math.cbrt(27));
		System.out.println("计算乘方的结果"+Math.pow(2, 2));
		//ceil：天花板,floor:地板
		System.out.println("求大于3.4的最小整数:"+Math.ceil(3.4));
		System.out.println("求小于3.4的最大整数:"+Math.floor(3.4));
		System.out.println("对5.8进行四舍五入后的结果:"+Math.round(5.8));
		System.out.println("求5.9和5.8的较大值:"+Math.max(5.9,5.8));
		System.out.println("求6.2和6.6的较小值:"+Math.min(6.2,6.6));
		System.out.println("对小数取整:"+(int)(5.5));
		System.out.println("生成一个大于等于0.0小于1.0的随机值"+Math.random());
	}

}
