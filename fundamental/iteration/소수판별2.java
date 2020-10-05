package com.ym.fundamental.iteration;

import java.util.Scanner;

class 소수판별2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        소수판별2 test = new 소수판별2();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            test.solution(n, m);

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n, int m) {
        for (int i = n; i <= m; i++) { //n<=m
            if (isSOSU(i)) System.out.print(i + " ");
        }
    }

    private boolean isSOSU(int n) {
        if (n == 1) return false;
        boolean sosu = true;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                sosu = false;
                break;
            }
        }
        return sosu;
    }

}
