package com.ym.fundamental.iteration;

import java.util.Scanner;

class 더하기빼기 {

    private int solution(int a, int b) {
        int answer = 0;

        for (int i = a; i <= b; i++) {
            if (i%2 == 0) answer -= i;
            else answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        더하기빼기 test = new 더하기빼기();

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
