package com.ym.fundamental.iteration;

import java.util.Scanner;

class 돈모으기 {

    private int solution(int m) {
        int sum = 0;

        int n = 1;
        while (true) {
            sum += n;
            if (sum >= m) break;
            n++;
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        돈모으기 test = new 돈모으기();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int m = sc.nextInt();

            System.out.print("answer: ");
            System.out.println(test.solution(m));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));

    }
}
