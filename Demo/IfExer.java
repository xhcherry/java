package Demo;/*
Ů������
180cm����  �Ƹ�1000w����   ��˧
��ͬʱ����  һ���޸���
����������������� ���Ҽް�
�������� ����
*/
import java.util.Scanner;
class IfExer 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("�������cm");
		int high = scan.nextInt();
		System.out.println("����Ƹ�w");
		double wealth = scan.nextDouble();
		/*��ʽ1
		System.out.println("�Ƿ�˧��true false��");
		boolean handsome = scan.nextBoolean();
		if(high >= 180 && wealth >= 1000 && handsome)
		{
			System.out.println("һ���޸���");
		}else if(high >= 180 || wealth >= 1000 || handsome)
		{
			System.out.println("���Ҽ޸���");
		}else{
			System.out.println("����");
			}*/
			//��ʽ2
			System.out.println("�����Ƿ�˧����/��");
			String handsome = scan.next();
			if(high >= 180 && wealth >= 1000 && handsome.equals("��"))
		{
			System.out.println("һ���޸���");
		}else if(high >= 180 || wealth >= 1000 || handsome.equals("��"))
		{
			System.out.println("���Ҽ޸���");
		}else{
			System.out.println("����");
			}
	}
}
