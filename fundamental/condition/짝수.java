package com.ym.fundamental.condition;
import java.util.Scanner;

class 짝수 {

    private String solution(int n) {
        String answer;

        answer = (n%2 == 0)? "even" : "not even";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String go;

        짝수 test = new 짝수();

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
