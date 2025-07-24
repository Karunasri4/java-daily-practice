import java.util.*;

public class SecondLargeElementInArray {
    static int secondLarge(int[] arr,int n){
        
        int max=Integer.MIN_VALUE;
        int secMax=max;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
            
        }
        return secMax;
    }
    
   

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
                                 

        }
        System.out.println(secondLarge(arr,n));
        
        
        
        
    }
}
