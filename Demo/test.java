package Demo;

/*标识符的使用
凡是自己可以起名字的地方都叫标识符
类名 变量名 方法名 接口名 包名
java中的名称命名规范
包名：多单词组成时所有字母小写：xxxyyyzzz
类名，接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
变量名，方法名：多单词组成时，第一个单词首字母小写，第二个单词首字母大写xxxYyyZzz
常量名：所有字母都大写，多单词时每个单词用下划线连接：XXX_YYY_ZZZ
变量的使用
java定义变量的格式：数据类型 变量名 = 变量值
*/
/*class test
{	
	public static void main(String[] args)
	{
		int myNumber = 1001;
		System.out.println(myNumber);
	}
}
class he$_
{
}*/
class VariableTest 
{
	public static void main(String[] args) 
	{
		int myAge = 12;
		System.out.println(myAge);
		int myNumber;
		myNumber = 1001;
		System.out.println(myNumber);
	}
	public void method()
	{
		int myClass = 1;
	}
}
