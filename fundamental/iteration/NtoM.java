package com.ym.fundamental.iteration;

import java.util.Scanner;

class NtoM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        NtoM test = new NtoM();

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
        for (int i = n; i <= m; i++)
            System.out.println(i + " ");
    }
}
