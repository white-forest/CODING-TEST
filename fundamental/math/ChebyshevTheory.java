package com.ym.fundamental.math;

import java.util.Scanner;

class ChebyshevTheory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        ChebyshevTheory test = new ChebyshevTheory();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(n));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private static int solution(int n) {
        int cnt = 0;
        for (int i = n+1; i <= 2*n; i++) {
            if (isSOSU(i) == true) cnt++;
        }
        return cnt;
    }


    /**
     * N이 소수인지를 알기위해서는 2부터 N의 제곱근까지로 N을 나누어 봤을때 나누어 떨어지는 수가 없으면 N은 소수임을 의미하는 판별법이다.
     */
    private static boolean isSOSU(int n) {
        if (n == 1) return false;
        boolean sosu = true;
        int root = (int)Math.sqrt(n) + 1;
        for (int i = 2; i < root; i++) {
            if (n % i == 0) {
                sosu = false;
                break;
            }
        }
        return sosu;
    }
}
