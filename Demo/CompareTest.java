package Demo;

/*
运算符之三：比较运算符
==     != > < >= <= instanceof
结论
比较运算符的结果是boolean型
区分 ==  = 

*/
class  CompareTest
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 20;
		System.out.println(i == j);//flase
		System.out.println(i = j);//20
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b2 == b1);//flase
		System.out.println(b2 = b1);//true
	}
}
