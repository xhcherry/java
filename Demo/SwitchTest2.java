package Demo;/*
����ѧ���ɼ�����60�ģ�����ϸ� ����60��������ϸ�
˵�� ���switch-case�ṹ�еĶ��case��ִ�������ͬ������Խ��кϲ�
˵��  break��switch���ǿ�ѡ��
*/
import java.util.Scanner;
class SwitchTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("������");
		int score = scan.nextInt();
		switch(score / 60){
			case 0:
				System.out.println("���ϸ�");break;
			case 1:
				System.out.println("�ϸ�");break;
		}
//��������ָ���·ݣ���ӡ���·������ļ���
		System.out.println("�·ݣ�");
		int mon = scan.nextInt();
		switch(mon){
			case 3:
			case 4:
			case 5:
				System.out.println("����");break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");break;
			}
//�Ӽ���������2019��ġ�month �� day����Ҫ��ͨ������������������Ϊ2019��ĵڼ���
			System.out.println("����2019��month��");
			int month = scan.nextInt();
			System.out.println("����2019��day��");
			int day = scan.nextInt();
			//����һ������ ��������
			int sumDays = 0;
			switch(month){
				case 12:
					sumDays += 30;
				case 11:
					sumDays += 31;
				case 10:
					sumDays += 30;
				case 9:
					sumDays += 31;
				case 8:
					sumDays += 31;
				case 7:
					sumDays += 30;
				case 6:
					sumDays += 31;
				case 5:
					sumDays += 30;
				case 4:
					sumDays += 31;
				case 3:
					sumDays += 28;
				case 2:
					sumDays += 31;
				case 1:
					sumDays += day;
			}
			System.out.println("2019." + month + "." + day + " ��" + sumDays + "��");
/*�Ӽ��������������ж���һ���ǵ���ĵڼ���
�ж�һ���Ƿ�������ı�׼
���Ա�4���� �����ɱ�100����
��
���Ա�400����
*/
		System.out.println("�����꣺");
		int year1 = scan.nextInt();
		System.out.println("�����£�");
		int month1 = scan.nextInt();
		System.out.println("�����գ�");
		int day1 = scan.nextInt();
		int sumDays1 = 0;
			switch(month){
				case 12:
					sumDays1 += 30;
				case 11:
					sumDays1 += 31;
				case 10:
					sumDays1 += 30;
				case 9:
					sumDays1 += 31;
				case 8:
					sumDays1 += 31;
				case 7:
					sumDays1 += 30;
				case 6:
					sumDays1 += 31;
				case 5:
					sumDays1 += 30;
				case 4:
					sumDays1 += 31;
				case 3:
		if((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0){
					sumDays1 += 29;
				}else{
					sumDays1 += 28;
				}
				case 2:
					sumDays1 += 31;
				case 1:
					sumDays1 += day1;
			}
			System.out.println(year1 + "." + month1 + "." + day1 + " ��" + sumDays1 + "��");
	}		
}
//���ǿ���ʹ��switch-case�Ľṹ��������ת��Ϊif-else ��֮  ������
//д��֧�ṹʱ�������ּȿ�����switch-case  ��switch�б��ʽȡֵ�����̫�ࣩ
//�ֿ���ʹ��if-elseʱ ����ѡ��switch-case   ִ��Ч�ʸ���