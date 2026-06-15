package StriverSheet.BasicMaths;

import java.util.Scanner;

public class CountDigitsOfNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Numbder -> ");
        int n=sc.nextInt();

        int digits=(int)Math.log10(Math.abs(n))+1;

        int c=0;
        if(n==0)
        {
            System.out.println("Number of digits -> 1");
            return;
        }
        n=Math.abs(n);
        while(n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println("Number digits -> "+c);
        System.out.println("Number digits -> "+digits);
    }
}