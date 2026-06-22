package StriverSheet.Array.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array -> ");
        int n = sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter K -> ");
        int k = sc.nextInt();
        System.out.println();
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < a.length; i++) {
        sum += a[i];

        if (sum == k) {
            maxLen = i + 1;
        }

        int rem = sum - k;

        if (map.containsKey(rem)) {
            maxLen = Math.max(maxLen, i - map.get(rem));
        }

        if (!map.containsKey(sum)) {
            map.put(sum, i);
        }
    }

     System.out.println(" -> "+maxLen);;
    }
}
