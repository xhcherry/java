package Demo;

public class ArrayDemoxishu {
    public static void main(String[] args) {
        //������ά����11*11   0��û������ 1������  2������
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        //���ԭʼ������
        System.out.println("ԭʼ����");
        for(int[] ints : array1){
            for(int anInt : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        //ת��Ϊϡ������
        //��ȡ��Чֵ�ĸ���
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("��Чֵ����" + sum);
        //����һ��ϡ������
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        //������ά���飬����0ֵ�����ϡ������
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        //���ϡ������
        System.out.println("ϡ������");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"
                    +array2[i][1] + "\t"
                    +array2[i][2] + "\t");
        }
    }
}
