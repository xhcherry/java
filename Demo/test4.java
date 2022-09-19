package Demo;

class test4
{
	public static void main(String[] args)
	{
		//1.编码情况：
		long l = 12326;
		System.out.println(l);
		//编译失败：提示整数太大
		//long l1 = 245625462464624564346;需要加l

		//float f1 = 12.3;编译失败f1 = 12.3F;必须要有F
		float f1 = 12.3f;//没有加f方便
		//2.编译情况
		//整型常量，默认为int
		//浮点型 默认double
		byte b = 12;
		//byte b1 = b + 1;//编译失败
		//float f1 = b + 12.3;//编译失败
	}
}