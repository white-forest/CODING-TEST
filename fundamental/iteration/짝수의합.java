package com.ym.fundamental.iteration;

import java.util.Scanner;

class 짝수의합 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        짝수의합 test = new 짝수의합();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.print("answer: ");
            System.out.println(test.solution(n));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (i%2 == 0) sum += i;

            return sum;
    }
}
