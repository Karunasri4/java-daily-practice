import java.util.Scanner;

public class contains_vowConsonantsIn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int v=0,cs=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if("aeiou".indexOf(c)!=-1){
                v++;

            }
            else{
                cs++;
            }
        }
        System.out.println("Vowels: "+v+" Consonants: "+cs);

    }
}
