package Demo;

/*
分支结构之二：sitch-case
格式
switch（表达式）{
case常量1：
执行语句1；
break；
case 常量2：
执行语句2；
break；
default：
执行语句n；
break；（可有可无）}
说明
根据switch表达式的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应case结构中，调用其执行语句
当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，
直到遇到break关键字或此switch-case结构末尾结束为止
break可以使用在switch-case结构中，表示一旦执行到关键字就跳出switch-case结构
switch结构中的表达式，只能是如下六中类型之一：byte short char int 枚举类型 String类型
case之后只能声明常量，不能声明范围
break关键字是可选的
default 相当于if-else中的else
default结构是可选的   位置是灵活的
*/
class SwitchCaseTest 
{
	public static void main(String[] args) 
	{
		int number = 2;
		switch(number){
			case 0:
			System.out.println("zero");break;
			case 1:
			System.out.println("one");break;
			case 2:
			System.out.println("two");break;
			case 3:
			System.out.println("three");break;
			default:
			System.out.println("other");
		}
		/*boolean类型的不能放进switch中
		boolean isHandsome = true;
		switch(isHandsome)
		{
			case true:
				System.out.println("好帅");
				break;
			case false:
				System.out.println("好丑");
				break;
			default:
				System.out.println("输入错误");
				*/
	}
}
