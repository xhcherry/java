package Demo;

/*
��֧�ṹ֮����sitch-case
��ʽ
switch�����ʽ��{
case����1��
ִ�����1��
break��
case ����2��
ִ�����2��
break��
default��
ִ�����n��
break�������п��ޣ�}
˵��
����switch���ʽ��ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧcase�ṹ�У�������ִ�����
��������ִ������Ժ�����Ȼ��������ִ������case�ṹ�е�ִ����䣬
ֱ������break�ؼ��ֻ��switch-case�ṹĩβ����Ϊֹ
break����ʹ����switch-case�ṹ�У���ʾһ��ִ�е��ؼ��־�����switch-case�ṹ
switch�ṹ�еı��ʽ��ֻ����������������֮һ��byte short char int ö������ String����
case֮��ֻ����������������������Χ
break�ؼ����ǿ�ѡ��
default �൱��if-else�е�else
default�ṹ�ǿ�ѡ��   λ��������
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
		/*boolean���͵Ĳ��ܷŽ�switch��
		boolean isHandsome = true;
		switch(isHandsome)
		{
			case true:
				System.out.println("��˧");
				break;
			case false:
				System.out.println("�ó�");
				break;
			default:
				System.out.println("�������");
				*/
	}
}
