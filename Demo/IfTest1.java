package Demo;/*岳小鹏参加java考试，他和父亲岳不群达成承诺
如果成绩100  奖励bmw
成绩(80，99]时，奖励iphone x
成绩[60,80]时 奖励ipad
其他时，什么都没有
从键盘输入他的成绩
说明
else结构是可选的
针对多个表达式
如果多个条件表达式之间是互斥的（没有交集关系）哪个判断和执行语句声明再上面还是下面，无所谓
如果多个条件表达式之间有交集关系。需要根据实际情况 考虑清楚应该将哪个结构声明在上面
如果多个条件表达式之间有包含关系，通常情况下，需要将范围小的声明在范围大的上面，
否则小的将没机会执行
*/
import java.util.Scanner;
class IfTest1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("成绩");
		int score = scan.nextInt();
		if(score == 100)
		{
			System.out.println("bmw");}
			else if (score > 80 && score <= 99)
			{
				System.out.println("iphone");
			}
			else if (score >= 60 && score <= 80)
			{
				System.out.println("ipad");
			}else {
				System.out.println("nothing");
			}
	}
}
