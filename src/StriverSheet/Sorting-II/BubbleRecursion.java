import java.util.Scanner;

public class BubbleRecursion {

    public static void bubbRec(int a[],int n)
    {
        if(n==1)
        {    
            return;
        }
        boolean isSwapped=false;
        for(int j=0;j<n-1;j++)
        {
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                isSwapped=true;
            }
        }
        if(!isSwapped)
        {
            return;
        }
        bubbRec(a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of Array -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        bubbRec(a,n);
        System.out.println("Sorted -> ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}
