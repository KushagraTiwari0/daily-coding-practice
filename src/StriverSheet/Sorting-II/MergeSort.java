import java.util.Scanner;

public class MergeSort {
    public static void Merger(int a[],int low,int mid,int high)
    {
        int arr[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int i=0;
        while(left<=mid&& right<=high)
        {
            if(a[left]<=a[right])
            {
                arr[i]=a[left++];
            }
            else
            {
                arr[i]=a[right++];
            }
            i++;
        }
        while(left<=mid)
        {
            arr[i]=a[left++];
            i++;
        }
        while(right<=high)
        {
            arr[i]=a[right++];
            i++;
        }
        for(int j=low;j<=high;j++)
        {
            a[j]=arr[j-low];
        }

    }
    public static void mSort(int a[],int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(high+low)/2;
        mSort(a,low,mid);
        mSort((a), mid+1, high);
        Merger(a, low,mid, high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter Elements of Array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mSort(a,0,n-1);
        System.out.println("Sorted -> ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
