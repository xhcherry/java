package Demo;

/*
随机生成的工具
Random类，工具的名字，它在java.util.Random
在生活中，有很多不可精确预测的事件
1.导包 import java.util.Random;需要写在非注释代码的第一行（类的外边）
2.获取工具 Random tool = new Random();
3.使用工具 int age = tool.nextInt();
4.操作数据 System.out.println(age);
*/
//import java.util.Random;
class ToolRandom 
{
	public static void main(String[] args) 
	{
		//随机生成一个中奖号码
		//Random tool = new Random();
		//int num = tool.nextInt();//随机生成一个整数 在所有的整数int随机挑选一个
		//System.out.println("中奖号码 = " + num);
		//随机生成一个这次考试成绩[0~150]
		//int score = tool.nextInt(150);//范围[0,100) [0,99]
		//System.out.println(" 成绩 = " + score);
		//随机生成一个及格成绩[60,100]
		//score = tool.nextInt(41) + 60;
		//System.out.println(" 及格成绩 = " + score);
		int value = (int)(Math.random() * 90 + 10);
	System.out.println(value);
	}
	

}
