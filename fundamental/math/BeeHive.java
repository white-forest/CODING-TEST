package com.ym.fundamental.math;

import java.util.Scanner;

public class BeeHive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        BeeHive test = new BeeHive();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(n));
            System.out.println(test.solution2(n));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private int solution(int n) {

        //같은 내용 코드
//        int s = 0;
//        int e = 1;
//        int cnt = 0;
//
//        for (int i = 0; ;i++) {
//            System.out.println("s:" + s + " e:" + e);
//            if (s < n && n <= e) break;
//            s = e;
//            e += 6*i;
//            cnt++;
//        }

        int s;
        int e = 1;
        int cnt = 1;

        if (n == 1) return n;

        for (int i = 1; ;i++) {
            cnt++;
            s = e;
            e += 6*i;
            System.out.println("s:" + s + " e:" + e);
            if (s < n && n <= e) break;
        }

        return cnt;
    }

    private int solution2(int n) {
        //https://www.acmicpc.net/source/9097682
        //  1 ~  1: 1
        //  2 ~  7: 2 (6개)
        //  8 ~ 19: 3 (12개)
        // 20 ~ 37: 4 (18개)
        // 38 ~ 61: 5 (24개)
        // a(n) = a(n-1) + 6(n-1)

        int a = 1;
        int cnt = 0;

        if (n == 1) return 1;

        while (a <= n) {
            a += 6*cnt;
            cnt++;
        }

        return cnt;
    }
}
