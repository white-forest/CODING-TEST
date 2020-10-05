package com.ym.fundamental.array;

import java.util.Scanner;

class Array3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        Array3 test = new Array3();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            test.solution(n);

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x += i;
            int y = x;
            for (int j = i; j <= n; j++) {
                System.out.print(y + " ");
                y += j;
            }
            System.out.println();
        }
    }
}
