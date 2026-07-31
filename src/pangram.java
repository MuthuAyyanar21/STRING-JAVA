import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int [] freq=new int[26];
        if(str.length()<26){
            System.out.println("Not Pangram");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                freq[str.charAt(i)-'a']++;
            }
        }
        for(int x:freq){
            if(x==0){
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
