package Demo;

/*������������֮����������
ǰ�᣺�������۵�ֻ��7�ֻ����������ͼ�����㣬������boolean����
   �Զ����͵�����:
   ���ۣ�������С�����ݱ��������������������������ʱ������Զ�����Ϊ���������������
   byte��char��short-->int-->long-->float-->double
   �ر�ģ���byte char short �������͵ı���������ʱ�����Ϊint����
   ˵������ʱ��������Сָ���Ǳ�ʾ���ķ�Χ�Ĵ��С�����磺float����>long������
   ǿ������ת��*/
   //'a'=97
class test2 
{
	public static void main(String[] args) 
	{
		byte b1 = 2;
		int i1 = 12;
		//byte b2 = b1 + i1;��ͨ��
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);
		float f = b1 + i1;
		System.out.println(f);
		short s1 =123;
		double d1 = s1;
		System.out.println(d1);//123.0
		//********************************
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
		short s2 = 10;
		//char c2 = c1 + s2;���벻ͨ��

		byte b2 = 10;
		//char c3 = c1 + b2;���벻ͨ��
		//short s3 = b2 + s2;���벻ͨ��
	}
}
