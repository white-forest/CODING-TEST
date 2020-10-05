package com.ym.fundamental.condition;

import java.util.Scanner;

class 최댓값 {

    private int solution(int a, int b, int c) {
        int answer = Integer.MIN_VALUE;

        answer = (a < b)? a : b;
        answer = (answer < c)? answer : c;

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        최댓값 test = new 최댓값();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("answer: " + test.solution(a[0], a[1], a[2]));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));

    }
}
