import java.util.*;
public class RevEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int start=0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                for (int j = i-1; j >= start ; j--) {
                    System.out.print(str.charAt(j));
                }
                if (i != str.length()) {
                    System.out.print(" ");
                }
                start=i+1;
            }
        }
    }
}
