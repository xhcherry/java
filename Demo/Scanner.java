package Demo;/*
��δӼ��̻�ȡ���Ͳ�ͬ�ı�������Ҫʹ��Scanner��
����ʵ�ֲ���
1.������import java.util.Scanner;
Scanner��ʵ����
����Scanner�����ط���������ȡָ�����͵ı���
ע��
��Ҫ������Ӧ�ķ�����δ����ָ�����͵�ֵ��������������������Ҫ������Ͳ�ƥ��ʱ��
�ᱨ�쳣��InputMisMatchException
*/
import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
		System.out.println("�����������");
		String name = scan.next();
		System.out.println(name);

		System.out.println("����");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("����");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("�Ƿ�����");
		boolean agree = scan.nextBoolean();
		System.out.println(agree);

		//����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ�ܻ�ȡһ���ַ���
		System.out.println("����������Ա�");
		String gender = scan.next();//��
		char genderChar = gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
		System.out.println(genderChar);
	}
}
