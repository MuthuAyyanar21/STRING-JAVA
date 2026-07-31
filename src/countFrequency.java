import java.util.*;
public class countFrequency {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch==c){
                count++;
            }

        }
        System.out.println(count);
    }
}
