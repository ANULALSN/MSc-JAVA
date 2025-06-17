
package gcd;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
  
        int n1,n2,i;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1:");
        n1=sc.nextInt();
        System.out.println("Enter n2:");
        n2=sc.nextInt();
        int gcd=1;
        for(i=1;i<=n1 && i<=n2;++i){
        if(n1%i==0 && n2%i==0){
        gcd=i;
        }
        }
        System.out.println("GCD of "+n1+" and "+n2+" is = "+gcd);
       
    }
    
}
