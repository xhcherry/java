package Demo;

/*
������� λ�����
���� 
λ����������Ķ������͵�����
<<��һ����Χ�ڣ�ÿ������һλ���൱��*2
>>��һ����Χ�ڣ�ÿ������һλ���൱��/2
�⣺
���Ч��ʽ����2 * 8��    2 << 3    8 << 1 
*/
class BitTest
{
	public static void main(String[] args)
	{
		int i = 21;
		System.out.println("i >> 2:" + (i >> 2));
		System.out.println("i << 3:" + (i << 3));
		System.out.println("i << 26:" + (i << 26));
		System.out.println("i << 27:" + (i << 27));
		int m = 12;
		int n = 5;
		System.out.println("m & n:" + (m & n));
		System.out.println("m | n:" + (m | n));
		System.out.println("m ^ n:" + (m ^ n));
		//��������������ֵ
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ",num2 = "+ num2);
		//��ʽ1 ������ʱ����
		//int temp = num1;
		//num1 = num2;
		//num2 = temp;
		//��ʽ2  �ô� ���ö�����ʱ����
		//����  ��Ӳ������ܳ����洢��Χ  �����ԣ�ֻ����������ֵ����
		//num1 = num1 + num2;
		//num2 = num1 - num2;
		//num1 = num1 - num2;
		//��ʽ3 ʹ��λ�����     ֻ����������ֵ����
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("num1 = " + num1 + ",num2 = "+ num2);
	}
}