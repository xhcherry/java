package Demo;

import java.util.Scanner;
class TestCaiPiao
{
	public static void main(String[] args) 
	{
		//�������һ����λ��
		//System.out.println(Math.random());//����[0,1)
		int number = (int)(Math.random() * 90 + 10);//�õ�[10,99]  [10,100)
		//System.out.println(number);
		int numberShi = number/10;
		int numberGe = number%10;
		//�û�����һ����λ��
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����λ�� ��");
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
		System.out.println("�н����룺" + number);
	}
}
