package Demo;/*
女方条件
180cm以上  财富1000w以上   很帅
若同时满足  一定嫁给他
若三个条件有满足的 姑且嫁吧
都不满足 不嫁
*/
import java.util.Scanner;
class IfExer 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("输入身高cm");
		int high = scan.nextInt();
		System.out.println("输入财富w");
		double wealth = scan.nextDouble();
		/*方式1
		System.out.println("是否帅（true false）");
		boolean handsome = scan.nextBoolean();
		if(high >= 180 && wealth >= 1000 && handsome)
		{
			System.out.println("一定嫁给他");
		}else if(high >= 180 || wealth >= 1000 || handsome)
		{
			System.out.println("姑且嫁给他");
		}else{
			System.out.println("不嫁");
			}*/
			//方式2
			System.out.println("输入是否帅（是/否）");
			String handsome = scan.next();
			if(high >= 180 && wealth >= 1000 && handsome.equals("是"))
		{
			System.out.println("一定嫁给他");
		}else if(high >= 180 || wealth >= 1000 || handsome.equals("是"))
		{
			System.out.println("姑且嫁给他");
		}else{
			System.out.println("不嫁");
			}
	}
}
