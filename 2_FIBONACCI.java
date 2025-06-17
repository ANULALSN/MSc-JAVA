package nfibo;

import java.util.Scanner;

public class Nfibo {

    public static void main(String[] args) {
       
        int f1=0,f2=1,f3,n,i;
        System.out.println("Enter the Value for n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(f1);
        System.out.println(f2);
        for(i=0;i<n-2;i++)
        {
        f3=f1+f2;
        System.out.println(f3);
        f1=f2;
        f2=f3;
        }
    }
    
}
