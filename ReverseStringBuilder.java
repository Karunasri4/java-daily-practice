import java.util.*;
public class ReverseStringBuilder{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);
        
        
    }
}
