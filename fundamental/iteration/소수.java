package com.ym.fundamental.iteration;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        소수 test = new 소수();

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

    private String solution(int n) {
        String answer = "YES";
        for (int i = 2; i < n; i++){
            if (n%i == 0) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }
}
