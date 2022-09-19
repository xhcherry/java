package Demo;

/*
运算符之二：赋值运算符
= += -= *= /= %=
*/
class SetValueTest 
{
	public static void main(String[] args) 
	{
		//赋值运算符： =
		int i1 = 10;
		int j1 = 10;
		int i2,j2;//连续赋值
		i2= j2 = 10;
		int i3 = 10,j3 = 20;
		
		int num1 = 10;
		num1 +=2;//num1 = num1 + 2;
		System.out.println(num1);//12
		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5;
		System.out.println(num2);
		short s1 = 10;
		//s1 = s1 + 2;编译失败
		s1 += 2;//不会改变变量本身的数据类型
		System.out.println(s1);
		//开发中，如果希望变量实现+2的操作，有几种方法？  int num = 10;
		//1.num = num + 2;
		//2.num += 2;(推荐)

		//开发中，如果希望变量实现+1的操作，有几种方法？  int num = 10;
		//1.num = num + 1;
		//2.num += 1;
		//3.num++;(推荐)
	}
}
