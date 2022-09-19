package Demo;

/*
运算符之四  逻辑运算符
& && |  ||  ！   ^
说明
逻辑运算符操作的都是boolean类型的变量

*/
class LogicTest 
{
	public static void main(String[] args) 
	{
		//区分&  &&
		//相同点  两者的运算结果相同   当符号左边是true时，二者都会执行符号右边的运算
		//不同  当符号左边是false时 &继续执行符号右边的运算，&&不再执行右边的运算
		//开发中 先试用短路的
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 &(num1++ > 0))
		{
			System.out.println("beijing");
	}
	else
		{
		System.out.println("nanjing");
		}

System.out.println("num1 = " + num1);
boolean b2 = true;
b2 = false;
		int num2 = 10;
		if(b2 &&(num2++ > 0))
		{
			System.out.println("beijing");
	}
	else
		{
		System.out.println("nanjing");
		}
		System.out.println("num2 = " + num2);
		//区分 |  与|| 
		//相同 二者的运算结果相同   当符号左边是false时 二者都会执行符号右边的运算
		//不同 当符号左边是true时 |继续执行右边的运算 ||不再执行
		boolean b3 = false;
		b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0))
		{
			System.out.println("beijing");
		}
		else
		{
			System.out.println("nanjing");
		}
		System.out.println("num3 = " + num3);
		
		boolean b4 = false;
		b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0))
		{
			System.out.println("beijing");
		}
		else
		{
			System.out.println("nanjing");
		}
		System.out.println("num4 = " + num4);
	}
}
