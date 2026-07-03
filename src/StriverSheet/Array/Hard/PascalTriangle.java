package StriverSheet.Array.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void pascal(int n)
    {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            List<Integer> l = new ArrayList<>();

            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    l.add(1);
                }
                else
                {
                    l.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }

            ans.add(l);
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        pascal(n);
    }
}