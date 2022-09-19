package Demo;

import java.util.Arrays;

public class ArrayDemomaopao {
    public static void main(String[] args) {
        int[] a = {1,32,54,76,7687,9,8,54};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for(int i = 0;i < array.length - 1;i++ ){
            boolean flag = false;//通过flag表示位减少没有意义的比较
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]>array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
        return array;
    }
}
