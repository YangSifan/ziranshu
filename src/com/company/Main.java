package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        new Main().sf();
    }
    int n = 0;
    int[] a = new int[11];

    public void sf() {

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        in.close();

        dfs(0, 1, 1);
    }

    public void dfs(int he,int c,int qs) {
        if (he == n) {
            for (int i = 1; i <= c-2; i++) {
                System.out.print(a[i]+"+");
            }
            System.out.println(a[c-1]);
            return;
        }
        if (he > n) {
            return;
        }
        for (int i = qs; i <= n - 1; i++) {
            a[c] = i;
            dfs(he + i, c + 1, i);
            a[c] = 0;
        }
    }
}
