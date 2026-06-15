package StriverSheet.BasicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number ->");
        int a=sc.nextInt();
        System.out.println("Enter Second Number ->");
        int b=sc.nextInt();
        while(a>0&&b>0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else
            {
                b=b%a;
            }
        }
        System.out.print("GCD -> ");
        if(a==0)
        {
            System.out.println(b);
        }
        else
            System.out.println(a);
    }
}
