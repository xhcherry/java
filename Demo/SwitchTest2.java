package Demo;/*
对于学生成绩大于60的，输出合格 低于60的输出不合格
说明 如果switch-case结构中的多个case的执行语句相同，则可以进行合并
说明  break在switch中是可选的
*/
import java.util.Scanner;
class SwitchTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("分数：");
		int score = scan.nextInt();
		switch(score / 60){
			case 0:
				System.out.println("不合格");break;
			case 1:
				System.out.println("合格");break;
		}
//根据用于指定月份，打印改月份所属的季节
		System.out.println("月份：");
		int mon = scan.nextInt();
		switch(mon){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");break;
			}
//从键盘上输入2019年的“month 和 day”，要求通过程序输出输入的日期为2019年的第几天
			System.out.println("输入2019的month：");
			int month = scan.nextInt();
			System.out.println("输入2019的day：");
			int day = scan.nextInt();
			//定义一个变量 保存天数
			int sumDays = 0;
			switch(month){
				case 12:
					sumDays += 30;
				case 11:
					sumDays += 31;
				case 10:
					sumDays += 30;
				case 9:
					sumDays += 31;
				case 8:
					sumDays += 31;
				case 7:
					sumDays += 30;
				case 6:
					sumDays += 31;
				case 5:
					sumDays += 30;
				case 4:
					sumDays += 31;
				case 3:
					sumDays += 28;
				case 2:
					sumDays += 31;
				case 1:
					sumDays += day;
			}
			System.out.println("2019." + month + "." + day + " 共" + sumDays + "天");
/*从键盘输入年月日判断这一天是当年的第几天
判断一年是否是闰年的标准
可以被4整除 但不可被100整除
或
可以被400整除
*/
		System.out.println("输入年：");
		int year1 = scan.nextInt();
		System.out.println("输入月：");
		int month1 = scan.nextInt();
		System.out.println("输入日：");
		int day1 = scan.nextInt();
		int sumDays1 = 0;
			switch(month){
				case 12:
					sumDays1 += 30;
				case 11:
					sumDays1 += 31;
				case 10:
					sumDays1 += 30;
				case 9:
					sumDays1 += 31;
				case 8:
					sumDays1 += 31;
				case 7:
					sumDays1 += 30;
				case 6:
					sumDays1 += 31;
				case 5:
					sumDays1 += 30;
				case 4:
					sumDays1 += 31;
				case 3:
		if((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0){
					sumDays1 += 29;
				}else{
					sumDays1 += 28;
				}
				case 2:
					sumDays1 += 31;
				case 1:
					sumDays1 += day1;
			}
			System.out.println(year1 + "." + month1 + "." + day1 + " 共" + sumDays1 + "天");
	}		
}
//凡是可以使用switch-case的结构，都可以转换为if-else 反之  不成立
//写分支结构时，当发现既可以用switch-case  （switch中表达式取值情况不太多）
//又可以使用if-else时 优先选择switch-case   执行效率更高