package Demo;

/*
�����֮��  �߼������
& && |  ||  ��   ^
˵��
�߼�����������Ķ���boolean���͵ı���

*/
class LogicTest 
{
	public static void main(String[] args) 
	{
		//����&  &&
		//��ͬ��  ���ߵ���������ͬ   �����������trueʱ�����߶���ִ�з����ұߵ�����
		//��ͬ  �����������falseʱ &����ִ�з����ұߵ����㣬&&����ִ���ұߵ�����
		//������ �����ö�·��
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 &(num1++ > 0))
		{
			System.out.println("beijing");
	}
	else
		{
		System.out.println("nanjing");
		}

System.out.println("num1 = " + num1);
boolean b2 = true;
b2 = false;
		int num2 = 10;
		if(b2 &&(num2++ > 0))
		{
			System.out.println("beijing");
	}
	else
		{
		System.out.println("nanjing");
		}
		System.out.println("num2 = " + num2);
		//���� |  ��|| 
		//��ͬ ���ߵ���������ͬ   �����������falseʱ ���߶���ִ�з����ұߵ�����
		//��ͬ �����������trueʱ |����ִ���ұߵ����� ||����ִ��
		boolean b3 = false;
		b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0))
		{
			System.out.println("beijing");
		}
		else
		{
			System.out.println("nanjing");
		}
		System.out.println("num3 = " + num3);
		
		boolean b4 = false;
		b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0))
		{
			System.out.println("beijing");
		}
		else
		{
			System.out.println("nanjing");
		}
		System.out.println("num4 = " + num4);
	}
}
