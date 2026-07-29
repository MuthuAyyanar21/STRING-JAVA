import java.util.*;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int lowercase=0;
        int uppercase=0;
        int digit=0;
        int special=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
             lowercase++;
            } else if (ch >= 'A' && ch <= 'Z') {
               uppercase++;
            } else if (ch>='0'&&ch<='9') {
               digit++;
            }else{
                special++;
            }
        }
        System.out.println("lowercase"+ lowercase);
        System.out.println("uppercase"+ uppercase);
        System.out.println("digit"+ digit);
        System.out.println("special"+ special);

    }
}
