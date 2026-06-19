import java.util.Scanner;

public class QuickSort
{   
    public static int partition(int a[],int low,int high)
    {
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(a[i]<=pivot&&i<=high-1)
            {
                i++;
            }
            while(a[j]>pivot&&j>=low+1)
            {
                j--;
            }
            if(i<j)
            {
                int temp = a[i];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp=a[j];
        a[j]=a[low];
        a[low]=temp;
        
        return j;
    }

    public static void quickS(int a[],int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(a,low,high);
            quickS(a, low, pivot-1);
            quickS(a, pivot+1, high);
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size -> ");
        int n=sc.nextInt();
        System.out.println("Enter Elements of array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        quickS(a,0,n-1);
        System.out.println("Sorted -> ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}