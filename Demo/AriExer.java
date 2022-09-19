package Demo;/*
练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值
格式如下：
数字xxx的情况下；
个位数：
十位数：
百位数：

例如：
数字153的情况下：
个位数：3
十位数：5
百位数：1
*/

class AriExer
{
	public static void main(String[] args) 
	{
		int num = 187;
		int bai = num / 100;
		int shi = num % 100 / 10;//int shi = num /10 % 10;
		int ge = num % 10;
		System.out.println("bai:" + bai);
		System.out.println("shi:" + shi);
		System.out.println("ge:" + ge);
	}
}
