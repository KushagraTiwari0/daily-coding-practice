package StriverSheet.BasicMaths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number -> ");
        int n=sc.nextInt();
        int k=String.valueOf(n).length();
        int d=(int)Math.log10(Math.abs(n))+1;
        int s=0;
        int c=n;
        if(n==0)
        {
            System.out.println("Armstrong");
            return;
        }
        while(c>0)
        {
            int ld=c%10;
            s+=(int)Math.pow(ld,d);
            c/=10;
        }
        if(s==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armsttrong Number");
        }
    }
}
