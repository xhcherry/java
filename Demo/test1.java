package Demo;

/*
java定义的数据类型
变量按照数据类型来分
  基本数据类型
     整型：byte short int long
	 浮点型：float  4字节 double  8字节
	 字符型 char  1字符 = 2字节
	 布尔型 boolean
  引用数据类型
     类  class
	 接口 interface
	 数组 array
变量在类中声明的位置
     成员变量   局部变量
	 */
class test1 
{
	public static void main(String[] args) 
	{
		//整型：byte 1字节=8bit   short 2字节     int 4字节    long 8字节
		//byte范围  -128~127
		byte b1 = 12;
		byte b2 = -128;
		System.out.println(b1);
		System.out.println(b2);
		//声明long型变量，必须以1或L结尾
		//通常，定义整型变量用int
		short s1 = 128;
		int i1 = 1234;
		long l1 = 45298347589L;
		System.out.println(l1);

		double d1 = 123.3;
		System.out.println(d1 + 1);
		//定义float类型变量时，变量要以   f   F  结尾
		float f1 = 12.3F;
		System.out.println(f1);
		//字符型 char 1字符=2字节,内部只能写一个字符
		char c1 = 'a';
		System.out.println(c1);
		//表示方式：声明一个字符   转义字符   直接使用Unicode值来表示字符型常量
		char c2 = '\n';//换行符
		c2 = '\t';//制表符 类似tab
		System.out.print("hello" + c2);
		System.out.println("world");
		char c3 = '\u0043';
		System.out.println(c3);
		//布尔型  boolean
		//只能去两个值之一  true false
		//常常在条件判断，循环结构中使用
		boolean bb1 = true;
		System.out.println(bb1);
		boolean isMarried = true;
		if(isMarried)
		{
			System.out.println("你就不能参加\"单身\"派对了\\n");
		}
		else
		{
			System.out.println("谈对象");
		}
	}
}
