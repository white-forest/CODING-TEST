package com.ym.fundamental.array;

import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        최댓값 test = new 최댓값();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int[] a = new int[9];

            for (int i = 0; i < 9; i++) {
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
        int idx = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                idx = i+1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
