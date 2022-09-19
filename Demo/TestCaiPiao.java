package Demo;

import java.util.Scanner;
class TestCaiPiao
{
	public static void main(String[] args) 
	{
		//随机产生一个两位数
		//System.out.println(Math.random());//产生[0,1)
		int number = (int)(Math.random() * 90 + 10);//得到[10,99]  [10,100)
		//System.out.println(number);
		int numberShi = number/10;
		int numberGe = number%10;
		//用户输入一个两位数
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个两位数 ：");
		int guess = input.nextInt();
		int guessShi = guess/10;
		int guessGe = guess%10;
		if(number == guess)
		{
			System.out.println("10000$");
		}else if(numberShi == guessGe && numberGe == guessShi){
			System.out.println("3000$");
		}else if(numberShi == guessShi || numberGe == guessGe){
			System.out.println("1000$");
		}else if(numberShi == guessGe || numberGe == guessShi){
			System.out.println("500$");
		}else{
			System.out.println("0$");
		}
		System.out.println("中奖号码：" + number);
	}
}
