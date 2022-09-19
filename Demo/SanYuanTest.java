package Demo;

/*
运算符之六：三目运算符  条件运算符
语法格式：条件表达式 ？结果表达式1 ：结果表达式2  ;
运算规则：
1.计算条件表达式（true/false） 
2.如果条件表达式的结果为true，结果表达式为1将作为表达式的结果；
如果条件表达式的结果为false，结果表达式2将作为整个表达式的结果
*/
//题：找出num1 和 num2中的大数 num1 != num2
class SanYuanTest 
{
	public static void main(String[] args) 
	{
		int num1 = 1000;
		int num2 = 100;
		//判断num1 >num2 是否正确，若真，出num1；弱假，出num2
		int max = num1 > num2 ? num1 : num2;

		System.out.println(max);
		//小红今年20岁，刚好爸爸的年龄是她的两倍，请计算并用变量存储18年后，小红和爸爸分别的年龄
		int hong1 = 20;
		int hong2 = 20 + 18;
		int ba = 2*20+18;
		System.out.println(" hong2 = " +hong2 + ", ba = " + ba);
		//写出可以让整数变量i的值减1，并赋值给自己的集中形式
		int i = 5;
		//i -= 1;
		//i = --i;
		i = i - 1;
		System.out.println("i = " + i);
		//利用三目运算符找出两数的最小值
		int num3 = 555;
		int num4 = 666;
		int min1 = num3 < num4 ? num3 : num4;
		System.out.println(min1);
		//利用三目运算符找出三个数中的最小数
		int num5 = 45;
		int num6 = 55;
		int num7 = 66;
		int min2 = num5 > num6 ? num6 : num5;
		int mid1 = num6 > num7 ? num7 : num6;
		int max1 = num5 > num7 ? num5 : num7;
		System.out.println("min2 = " + min2 +",mid1 = " +mid1+ ",max1 = " + max1);
	}
}
