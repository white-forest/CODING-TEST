package com.ym.fundamental.iteration;

import java.util.Scanner;

class 배수 {

    private String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) answer += "X";
            else answer += String.valueOf(i);
            answer += " ";
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        배수 test = new 배수();

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
}
