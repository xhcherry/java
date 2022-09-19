package Demo;/*
键盘录入工具
让用户可以在程序的运行过程中，向程序输入数据，程序可以接收到用户输入的信息
scanner类，这个工具是别人提供给我们的
步骤
1.指定工具所在的位置 导包 import java.util.Scanner;需要写在非注释代码的第一行（类的外边）
2.获取工具 Scanner tool = new Scanner(System.in);
3.使用工具 int age = tool.nextint();
4.操作数据 System.out.println(age);
在程序的运行过程中，要求用户从键盘录入年龄和姓名，打印到屏幕上
*/
import java.util.Scanner;
class  ToolScanner
{
	public static void main(String[] args) 
	{
		Scanner tool = new Scanner(System.in);
		System.out.print("年龄：");
		int age = tool.nextInt();//从键盘上接收一个用户输入的整数
		//输入姓名
		System.out.print("姓名：");
		String name = tool.next();//接收键盘录入的下一个数据
		System.out.println("你是" + age + "岁" + "姓名" + name);
	}
}
