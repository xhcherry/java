package Demo;/*
����¼�빤��
���û������ڳ�������й����У�������������ݣ�������Խ��յ��û��������Ϣ
scanner�࣬��������Ǳ����ṩ�����ǵ�
����
1.ָ���������ڵ�λ�� ���� import java.util.Scanner;��Ҫд�ڷ�ע�ʹ���ĵ�һ�У������ߣ�
2.��ȡ���� Scanner tool = new Scanner(System.in);
3.ʹ�ù��� int age = tool.nextint();
4.�������� System.out.println(age);
�ڳ�������й����У�Ҫ���û��Ӽ���¼���������������ӡ����Ļ��
*/
import java.util.Scanner;
class  ToolScanner
{
	public static void main(String[] args) 
	{
		Scanner tool = new Scanner(System.in);
		System.out.print("���䣺");
		int age = tool.nextInt();//�Ӽ����Ͻ���һ���û����������
		//��������
		System.out.print("������");
		String name = tool.next();//���ռ���¼�����һ������
		System.out.println("����" + age + "��" + "����" + name);
	}
}
