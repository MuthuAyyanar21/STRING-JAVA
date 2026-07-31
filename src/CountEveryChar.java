import java.util.*;
public class CountEveryChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch+"  "+count);

        }
    }
}
