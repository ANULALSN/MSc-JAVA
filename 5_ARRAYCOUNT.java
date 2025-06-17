
package countarr;

import java.util.Scanner;

public class Countarr {

    public static void main(String[] args) {
        // TODO code application logic here
        int i,n;
        int pos=0;
        int neg=0;
        int even=0;
        int odd=0;
        int zero=0;
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array:");
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++){
        if(arr[i]>0)
            pos++;
        else if(arr[i]<0)
            neg++;
        else if(arr[i]==0)
            zero++;
        if(arr[i]%2==0)
            even++;
        else
            odd++;
        }
        
        System.out.println("Number of Even Numbers"+even);
         System.out.println("Number of Odd Numbers"+odd);
          System.out.println("Number of Positive Numbers"+pos);
           System.out.println("Number of Negative Numbers"+neg);
         
    }
    
}
