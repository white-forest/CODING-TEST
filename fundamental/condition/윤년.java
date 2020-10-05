package com.ym.fundamental.condition;
import java.util.Scanner;

class 윤년 {

    private String solution(int n) {
        String answer;


        answer = ((n%4==0 && n%100!=0) || n%400==0)? "YES" : "NO";

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        윤년 test = new 윤년();

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
