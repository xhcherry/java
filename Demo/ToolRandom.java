package Demo;

/*
������ɵĹ���
Random�࣬���ߵ����֣�����java.util.Random
�������У��кܶ಻�ɾ�ȷԤ����¼�
1.���� import java.util.Random;��Ҫд�ڷ�ע�ʹ���ĵ�һ�У������ߣ�
2.��ȡ���� Random tool = new Random();
3.ʹ�ù��� int age = tool.nextInt();
4.�������� System.out.println(age);
*/
//import java.util.Random;
class ToolRandom 
{
	public static void main(String[] args) 
	{
		//�������һ���н�����
		//Random tool = new Random();
		//int num = tool.nextInt();//�������һ������ �����е�����int�����ѡһ��
		//System.out.println("�н����� = " + num);
		//�������һ����ο��Գɼ�[0~150]
		//int score = tool.nextInt(150);//��Χ[0,100) [0,99]
		//System.out.println(" �ɼ� = " + score);
		//�������һ������ɼ�[60,100]
		//score = tool.nextInt(41) + 60;
		//System.out.println(" ����ɼ� = " + score);
		int value = (int)(Math.random() * 90 + 10);
	System.out.println(value);
	}
	

}
