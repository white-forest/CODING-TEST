package com.ym.fundamental.array;

import java.util.Scanner;

class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        Reverse test = new Reverse();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("예제를 수행한 결과 입니다.");
            test.solution(a);

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int[] a) {
        for (int i = a.length-1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }

}
