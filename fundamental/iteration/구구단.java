package com.ym.fundamental.iteration;

import java.util.Scanner;

class 구구단 {

    private void solution(int n) {
        for (int i = 1; i < 10; i++)
            System.out.println(n + "*" + i + "=" + n*i);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        구구단 test = new 구구단();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.print("answer: ");
            test.solution(n);

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));

    }
}
