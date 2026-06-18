import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array -> ");
        int n =sc.nextInt();
        System.out.println("Enter Elements -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
        System.out.println("Sorted Array -> ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
