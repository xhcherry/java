package HomeWork;

public class HW4_1_2 {
    public static void main(String[] args) {
        String str1 = "�ഺ�й��������й����ܽ��й���";
        System.out.println(str1.length());
        System.out.println(str1.indexOf("�й�"));
        System.out.println(str1.lastIndexOf("�й�", 10));
        System.out.println(str1.substring(5, 9));
        System.out.println(str1.replace("�й�", "China"));
        System.out.println("Java".equalsIgnoreCase("JAVA"));
    }

}
