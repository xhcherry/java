package Demo;

/*
�����֮�����Ƚ������
==     != > < >= <= instanceof
����
�Ƚ�������Ľ����boolean��
���� ==  = 

*/
class  CompareTest
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 20;
		System.out.println(i == j);//flase
		System.out.println(i = j);//20
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b2 == b1);//flase
		System.out.println(b2 = b1);//true
	}
}
