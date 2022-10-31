import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String[] regexStrs = {"^1[3-9]\\d{9}$", "a*b"};
        System.out.println(regexStrs.length);
        String[] checkStrings = {"27755610881", "aaaab"};
        System.out.println(checkStrings.length);
        if (checkStrings.length == regexStrs.length) {
            for (int i = 0; i < checkStrings.length; i++)
                System.out.println(Pattern.matches(regexStrs[i], checkStrings[i]));
        }
        Pattern p = Pattern.compile("/+");
        String[] results = p.split("张三/李四//王五///赵六/钱七");
        for (String s : results)
            System.out.print(s + "\t");
    }
}