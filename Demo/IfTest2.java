package Demo;/*
编写程序，由键盘输入三个整数分别存入变量num1 num2 num3
对他们进行排序 并且从小到大输出
说明：if-else结构是可以相互嵌套的
如果if-else结构中的执行语句只有一行时，对应的一对{}可以省略
*/
import java.util.Scanner;
class IfTest2 
{
	public static void main(String[] args) 
	{
			Scanner scanner = new Scanner(System.in);
		System.out.println("num1 = ");
		int num1 = scanner.nextInt();
		System.out.println("num2 = ");
		int num2 = scanner.nextInt();
		System.out.println("num3 = ");
		int num3 = scanner.nextInt();
		if(num1 > num2)
			{
			if(num3 > num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			}else if(num3 <= num2){
				System.out.println(num3 + "," + num2 + "," + num1);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}else{
		if(num3 >= num2){
			System.out.println(num1 + "," + num2 + "," + num3);
		}else if(num3 <= num1){
			System.out.println(num3 + "," + num1 + "," + num2);
		}else{
			System.out.println(num1 + "," + num3 + "," + num2);
		}
	}
}
}
