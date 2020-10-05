package com.ym.fundamental.iteration;

import java.util.Scanner;

class 배수의개수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        배수의개수 test = new 배수의개수();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.print("answer: ");
            System.out.println(test.solution(a, b, c));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));

    }

    private int solution(int a, int b, int c) {
        int answer = 0;
        int s = (a < b)? a : b;
        int e = (a < b)? b : a;

        for (int i = s; i <= e; i++) {
            if (i % c == 0) answer++;
        }
        return  answer;
    }
}
