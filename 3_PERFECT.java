
package perfect;

import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        
        int n,sum=0,i;
        System.out.println("Enter a numvber:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++){
        if(n%i==0){
        sum=sum+i;
        }
        }
        if(sum==n){
        System.out.println(n+" is a Perfect Number");
        }
        else if(sum>n){
        System.out.println(n+" is a abundant Number");
        }
        else{
         System.out.println(n+" is a deficient Number");
        }
    }
    
}
