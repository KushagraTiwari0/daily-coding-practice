package StriverSheet.BasicMaths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number -> ");
        int n=sc.nextInt();
        List<Integer> result=new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                result.add(i);
                if(i!=n/i)
                {
                    result.add(n/i);
                }
            }
        }
        Collections.sort(result);
        for(var val:result)
        {
            System.out.print(val+ " ");
        }
    }
}
