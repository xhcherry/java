package Demo;/*��С���μ�java���ԣ����͸�������Ⱥ��ɳ�ŵ
����ɼ�100  ����bmw
�ɼ�(80��99]ʱ������iphone x
�ɼ�[60,80]ʱ ����ipad
����ʱ��ʲô��û��
�Ӽ����������ĳɼ�
˵��
else�ṹ�ǿ�ѡ��
��Զ�����ʽ
�������������ʽ֮���ǻ���ģ�û�н�����ϵ���ĸ��жϺ�ִ��������������滹�����棬����ν
�������������ʽ֮���н�����ϵ����Ҫ����ʵ����� �������Ӧ�ý��ĸ��ṹ����������
�������������ʽ֮���а�����ϵ��ͨ������£���Ҫ����ΧС�������ڷ�Χ������棬
����С�Ľ�û����ִ��
*/
import java.util.Scanner;
class IfTest1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("�ɼ�");
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
