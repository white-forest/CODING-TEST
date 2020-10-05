package com.ym.fundamental.array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        Array1 test = new Array1();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int m = sc. nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            test.solution(n, m);

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n, int m) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
