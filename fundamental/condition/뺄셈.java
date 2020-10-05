package com.ym.fundamental.condition;

import java.util.Scanner;

class 뺄셈 {

    private int solution(int a, int b) {
        if (a < b) return -1;
        return a - b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        뺄셈 test = new 뺄셈();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.print("answer: ");
            System.out.println(test.solution(a, b));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));

    }
}
