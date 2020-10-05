package com.ym.fundamental.iteration;

import java.util.Scanner;

class NtoM2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        NtoM2 test = new NtoM2();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.print("answer: ");
            test.solution(n, m);

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n, int m) {
        for (int i = n, j = 1; i <= m; i++, j++) {
            System.out.print(i + " ");
            if (j%8 == 0) System.out.println();
        }
    }
}
