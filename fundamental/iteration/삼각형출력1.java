package com.ym.fundamental.iteration;

import java.util.Scanner;

class 삼각형출력1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        삼각형출력1 test = new 삼각형출력1();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.println("answer====");
            test.solution(n);

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();;
        }
    }
}
