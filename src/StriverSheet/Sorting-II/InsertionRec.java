import java.util.Scanner;

public class InsertionRec {
    public static void insertRec(int a[],int n,int i)
    {
        if(n==i)
        {
            return;
        }
        for(int j=i;j>0;j--)
        {
            if(a[j-1]>a[j])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
        insertRec(a, n, i+1);
    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n = sc.nextInt();
        System.out.println("Enter Elements -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertRec(a,n,1);
        System.out.println("Sorted Array -> ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }    
}
