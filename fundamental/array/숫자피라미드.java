package com.ym.fundamental.array;

import java.util.Scanner;

class 숫자피라미드 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        숫자피라미드 test = new 숫자피라미드();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int s = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            test.solution(n, s);

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n, int s) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) System.out.print(" ");

            int[] a = new int[2*i-1];
            for (int k = 0; k < 2*i-1; k++) {
                a[k] = s;
                s = (s >= 9)? 1 : s+1;
            }

            int id = (i%2 == 0)? 0 : a.length-1;
            int add = (i%2 == 0)? 1 : -1;
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[id]);
                id += add;
            }
            System.out.println();
        }
    }
}
