package Demo;

/*
�����֮������ֵ�����
= += -= *= /= %=
*/
class SetValueTest 
{
	public static void main(String[] args) 
	{
		//��ֵ������� =
		int i1 = 10;
		int j1 = 10;
		int i2,j2;//������ֵ
		i2= j2 = 10;
		int i3 = 10,j3 = 20;
		
		int num1 = 10;
		num1 +=2;//num1 = num1 + 2;
		System.out.println(num1);//12
		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5;
		System.out.println(num2);
		short s1 = 10;
		//s1 = s1 + 2;����ʧ��
		s1 += 2;//����ı�����������������
		System.out.println(s1);
		//�����У����ϣ������ʵ��+2�Ĳ������м��ַ�����  int num = 10;
		//1.num = num + 2;
		//2.num += 2;(�Ƽ�)

		//�����У����ϣ������ʵ��+1�Ĳ������м��ַ�����  int num = 10;
		//1.num = num + 1;
		//2.num += 1;
		//3.num++;(�Ƽ�)
	}
}
