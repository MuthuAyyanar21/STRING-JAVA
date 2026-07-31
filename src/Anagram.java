import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next().toLowerCase();
        String str2=sc.next().toLowerCase();
        int [] freq=new int[26];
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int x:freq){
            if(x!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
