package StriverSheet.Array.Medium;

import java.util.Scanner;

public class SetMatrixZero {

    public static void setZero(int a[][], int r, int c) {

        boolean fr = false;
        boolean fc = false;

        for (int j = 0; j < c; j++) {
            if (a[0][j] == 0) {
                fr = true;
                break;
            }
        }

        for (int i = 0; i < r; i++) {
            if (a[i][0] == 0) {
                fc = true;
                break;
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (a[i][j] == 0) {
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (a[i][0] == 0 || a[0][j] == 0) {
                    a[i][j] = 0;
                }
            }
        }

        if (fr) {
            for (int j = 0; j < c; j++) {
                a[0][j] = 0;
            }
        }

        if (fc) {
            for (int i = 0; i < r; i++) {
                a[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows -> ");
        int r = sc.nextInt();

        System.out.print("Enter columns -> ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter matrix -> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        setZero(a, r, c);

        System.out.println("Matrix after setting zeroes -> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}