package Demo;

/*
java�������������
��������������������
  ������������
     ���ͣ�byte short int long
	 �����ͣ�float  4�ֽ� double  8�ֽ�
	 �ַ��� char  1�ַ� = 2�ֽ�
	 ������ boolean
  ������������
     ��  class
	 �ӿ� interface
	 ���� array
����������������λ��
     ��Ա����   �ֲ�����
	 */
class test1 
{
	public static void main(String[] args) 
	{
		//���ͣ�byte 1�ֽ�=8bit   short 2�ֽ�     int 4�ֽ�    long 8�ֽ�
		//byte��Χ  -128~127
		byte b1 = 12;
		byte b2 = -128;
		System.out.println(b1);
		System.out.println(b2);
		//����long�ͱ�����������1��L��β
		//ͨ�����������ͱ�����int
		short s1 = 128;
		int i1 = 1234;
		long l1 = 45298347589L;
		System.out.println(l1);

		double d1 = 123.3;
		System.out.println(d1 + 1);
		//����float���ͱ���ʱ������Ҫ��   f   F  ��β
		float f1 = 12.3F;
		System.out.println(f1);
		//�ַ��� char 1�ַ�=2�ֽ�,�ڲ�ֻ��дһ���ַ�
		char c1 = 'a';
		System.out.println(c1);
		//��ʾ��ʽ������һ���ַ�   ת���ַ�   ֱ��ʹ��Unicodeֵ����ʾ�ַ��ͳ���
		char c2 = '\n';//���з�
		c2 = '\t';//�Ʊ�� ����tab
		System.out.print("hello" + c2);
		System.out.println("world");
		char c3 = '\u0043';
		System.out.println(c3);
		//������  boolean
		//ֻ��ȥ����ֵ֮һ  true false
		//�����������жϣ�ѭ���ṹ��ʹ��
		boolean bb1 = true;
		System.out.println(bb1);
		boolean isMarried = true;
		if(isMarried)
		{
			System.out.println("��Ͳ��ܲμ�\"����\"�ɶ���\\n");
		}
		else
		{
			System.out.println("̸����");
		}
	}
}
