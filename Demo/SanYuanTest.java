package Demo;

/*
�����֮������Ŀ�����  ���������
�﷨��ʽ���������ʽ ��������ʽ1 ��������ʽ2  ;
�������
1.�����������ʽ��true/false�� 
2.����������ʽ�Ľ��Ϊtrue��������ʽΪ1����Ϊ���ʽ�Ľ����
����������ʽ�Ľ��Ϊfalse��������ʽ2����Ϊ�������ʽ�Ľ��
*/
//�⣺�ҳ�num1 �� num2�еĴ��� num1 != num2
class SanYuanTest 
{
	public static void main(String[] args) 
	{
		int num1 = 1000;
		int num2 = 100;
		//�ж�num1 >num2 �Ƿ���ȷ�����棬��num1�����٣���num2
		int max = num1 > num2 ? num1 : num2;

		System.out.println(max);
		//С�����20�꣬�պðְֵ���������������������㲢�ñ����洢18���С��Ͱְֱַ������
		int hong1 = 20;
		int hong2 = 20 + 18;
		int ba = 2*20+18;
		System.out.println(" hong2 = " +hong2 + ", ba = " + ba);
		//д����������������i��ֵ��1������ֵ���Լ��ļ�����ʽ
		int i = 5;
		//i -= 1;
		//i = --i;
		i = i - 1;
		System.out.println("i = " + i);
		//������Ŀ������ҳ���������Сֵ
		int num3 = 555;
		int num4 = 666;
		int min1 = num3 < num4 ? num3 : num4;
		System.out.println(min1);
		//������Ŀ������ҳ��������е���С��
		int num5 = 45;
		int num6 = 55;
		int num7 = 66;
		int min2 = num5 > num6 ? num6 : num5;
		int mid1 = num6 > num7 ? num7 : num6;
		int max1 = num5 > num7 ? num5 : num7;
		System.out.println("min2 = " + min2 +",mid1 = " +mid1+ ",max1 = " + max1);
	}
}
