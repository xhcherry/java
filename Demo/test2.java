package Demo;

/*基本数据类型之间的运算规则
前提：这里讨论的只有7种基本数据类型间的运算，不包含boolean类型
   自动类型的提升:
   结论：当容量小的数据变量与容量大的数据类型做运算时，结果自动提升为容量大的数据类型
   byte、char、short-->int-->long-->float-->double
   特别的：当byte char short 三种类型的变量做运算时，结果为int类型
   说明：此时的容量大小指的是表示数的范围的大和小，比如：float容量>long的容量
   强制类型转换*/
   //'a'=97
class test2 
{
	public static void main(String[] args) 
	{
		byte b1 = 2;
		int i1 = 12;
		//byte b2 = b1 + i1;不通过
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);
		float f = b1 + i1;
		System.out.println(f);
		short s1 =123;
		double d1 = s1;
		System.out.println(d1);//123.0
		//********************************
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
		short s2 = 10;
		//char c2 = c1 + s2;编译不通过

		byte b2 = 10;
		//char c3 = c1 + b2;编译不通过
		//short s3 = b2 + s2;编译不通过
	}
}
