package com.ym.fundamental.array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        Array2 test = new Array2();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    arr[i][j] = sc. nextInt();

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(arr, a, b));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private int solution(int[][] arr, int a, int b) {
        return arr[a][b];
    }
}
