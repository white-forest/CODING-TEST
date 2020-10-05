package com.ym.fundamental.iteration;

import java.util.Scanner;

public class 제곱근 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        제곱근 test = new 제곱근();

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
        int answer = 1;

        int i = 1;
        while (true) {
            if (i*i >= n) {
                answer = i;
                break;
            }
            i++;
        }

        return answer;
    }
}
