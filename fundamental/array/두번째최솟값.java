package com.ym.fundamental.array;

import java.util.Arrays;
import java.util.Scanner;

class 두번째최솟값 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        두번째최솟값 test = new 두번째최솟값();

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
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < 9; i++)
            if(min1 > a[i])
                min1 = a[i];

        int idx = -1;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < 9; i++) {
            if ((min2 > a[i]) && (min1 < a[i])) {
                min2 = a[i];
                idx = i + 1;
            }
        }

        System.out.println(min2);
        System.out.println(idx);
    }

}
