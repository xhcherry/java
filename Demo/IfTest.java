package Demo;

/*
ѡ�����
ifѡ�񣨵���ѡ��
ֻ����һ�������ֻ�����һ��������д��������������������
�﷨����
if���������ʽ��
{
	�����������ʽ��ʱ��ִ�����s;
	}
	if-elseѡ��˫��֧ѡ��
	if- else�������ֻ��������������ֻ������������������е����
	Ҫô��������Ҫô��������
	�﷨����
	if���������ʽ��
	{
		��������ִ�����s��
	}else
	{
		���������ʽ������ʱִ�е����s��
	}
	if���������ʽ��
	{
		ִ�б��ʽ1
	}
	else if���������ʽ��
	{
	ִ�б��ʽ2
	}else if
	{
	ִ�б��ʽ3
	}
else{
}
*/
//if
class IfTest
{
	public static void main(String[] args) 
	{
		//����1
		int heartBeats = 79;
		if (heartBeats < 60 || heartBeats > 100)
		{
			System.out.println("��Ҫ��һ�����");
		}
		System.out.println("����");
		//����2
		int age = 23;
		if(age < 18)
		{
			System.out.println("������Ƭ");
		}else{
			System.out.println("�����˵�Ӱ");
		}
		//����3
		if(age < 0){
			System.out.println("��������ݲ���ȷ");
		}else if(age < 18){
			System.out.println("������ʱ��");
		}else if(age < 35){
			System.out.println("׳��");
		}else if(age < 60){
			System.out.println("����");
		}else if(age < 120){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}
}

class Choose1 
{
	public static void main(String[] args) 
	{
		int score = 77;
		if (score == 100)
		{
			System.out.println("BMW");
		}else if(score > 80 & score <= 99){
		System.out.println("iphonex");
		}else if(score >= 60 & score <= 80){
			System.out.println("ipad");
		}else{
			System.out.println("nothing");
		}

		
	}
}
