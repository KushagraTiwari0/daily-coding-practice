package StriverSheet.BasicMaths;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to be reversed -> ");
        int n=sc.nextInt();
        //Method 1
        // boolean neg=false;
        // if(n<0)
        // {
        //     neg=true;
        //     n=Math.abs(n);
        // }
        // int rev=0;
        // while(n>0)
        // {
        //     rev=rev*10+n%10;;
        //     n=n/10;
        // }
        // if(neg)
        // {
        //     rev=-rev;
        // }
        // System.out.println("Reversed -> "+rev);


        //Method 2
        // boolean isNeg=false;
        // if(n==0)
        // {
        // System.out.println("Reverse -> 0");
        // return;
        // }
        // if(n<0)
        // {
        //     isNeg=true;
        //     n=Math.abs(n);
        // }
        // int d=(int)Math.log10(Math.abs(n))+1;

        // int rev=0;
        
        // while(n>0)
        // {
        //     rev=rev*10+n%10;
        //     n=n/10;
        // }
        // if(isNeg)
        // {
        //     System.out.printf("reverse -> -"+"%0"+d+"d%n",rev);
        // }
        // else
        // {
        //     System.out.printf("Reverse -> "+"%0"+d+"d%n",rev);
        // }
        int temp = Math.abs(n);

        int d = (temp == 0) ? 1 : 0;

        int copy = temp;
        while (copy > 0) {
            d++;
            copy /= 10;
        }

        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (n < 0) {
            System.out.print("-");
        }

        System.out.printf("%0" + d + "d%n", rev);
    }
}
