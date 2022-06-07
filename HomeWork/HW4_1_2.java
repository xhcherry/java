package HomeWork;

public class HW4_1_2 {
    public static void main(String[] args) {
        String str1 = "青春中国、魅力中国、奋进中国！";
        System.out.println(str1.length());
        System.out.println(str1.indexOf("中国"));
        System.out.println(str1.lastIndexOf("中国", 10));
        System.out.println(str1.substring(5, 9));
        System.out.println(str1.replace("中国", "China"));
        System.out.println("Java".equalsIgnoreCase("JAVA"));
    }

}
