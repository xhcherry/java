package Demo;/*
如何从键盘获取类型不同的变量，需要使用Scanner类
具体实现步骤
1.导包：import java.util.Scanner;
Scanner的实例化
调用Scanner类的相关方法，啦获取指定类型的变量
注意
需要根据相应的方法，未输入指定类型的值，如果输入的数据类型与要求的类型不匹配时，
会报异常：InputMisMatchException
*/
import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
		System.out.println("输入你的姓名");
		String name = scan.next();
		System.out.println(name);

		System.out.println("年龄");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("体重");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("是否相中");
		boolean agree = scan.nextBoolean();
		System.out.println(agree);

		//对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
		System.out.println("请输入你的性别");
		String gender = scan.next();//男
		char genderChar = gender.charAt(0);//获取索引为0位置上的字符
		System.out.println(genderChar);
	}
}
