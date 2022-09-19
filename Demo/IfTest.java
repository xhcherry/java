package Demo;

/*
选择语句
if选择（单项选择）
只考虑一种情况，只针对这一种情况进行处理，其他情况根本不考虑
语法规则
if（条件表达式）
{
	满足条件表达式的时候，执行语句s;
	}
	if-else选择（双分支选择）
	if- else考虑两种互斥的情况，这两种互斥的情况级囊括了所有的情况
	要么是这样，要么不是这样
	语法规则
	if（条件表达式）
	{
		条件成立执行语句s；
	}else
	{
		在条件表达式不成立时执行的语句s；
	}
	if（条件表达式）
	{
		执行表达式1
	}
	else if（条件表达式）
	{
	执行表达式2
	}else if
	{
	执行表达式3
	}
else{
}
*/
//if
class IfTest
{
	public static void main(String[] args) 
	{
		//举例1
		int heartBeats = 79;
		if (heartBeats < 60 || heartBeats > 100)
		{
			System.out.println("需要进一步检查");
		}
		System.out.println("正常");
		//举例2
		int age = 23;
		if(age < 18)
		{
			System.out.println("看动画片");
		}else{
			System.out.println("看成人电影");
		}
		//举例3
		if(age < 0){
			System.out.println("输入的数据不正确");
		}else if(age < 18){
			System.out.println("青少年时期");
		}else if(age < 35){
			System.out.println("壮年");
		}else if(age < 60){
			System.out.println("中年");
		}else if(age < 120){
			System.out.println("老年");
		}else{
			System.out.println("成仙");
		}
	}
}

class Choose1 
{
	public static void main(String[] args) 
	{
		int score = 77;
		if (score == 100)
		{
			System.out.println("BMW");
		}else if(score > 80 & score <= 99){
		System.out.println("iphonex");
		}else if(score >= 60 & score <= 80){
			System.out.println("ipad");
		}else{
			System.out.println("nothing");
		}

		
	}
}
