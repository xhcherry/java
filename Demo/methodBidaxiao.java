package Demo;

public class methodBidaxiao {
    public static void main(String[] args) {
        double max = max(12,45);
        System.out.println(max);
    }

    public static double max(double num1,double num2) {
        double result = 0;
        if(num1 == num2){
            System.out.println("num1 == num2");
            return 0;
        }
        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }
    public static int max(int num1,int num2) {
        int result = 0;
        if(num1 == num2){
            System.out.println("num1 == num2");
            return 0;
        }
        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }
}
