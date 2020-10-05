package com.ym.fundamental.array;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        점수계산 test = new 점수계산();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(n, a));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private int solution(int n, int[] a) {
        int score = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) cnt = 0;
            else cnt++;
            score += cnt;
        }
        return score;
    }
}
