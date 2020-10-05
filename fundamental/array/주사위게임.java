package com.ym.fundamental.array;

import java.util.Scanner;

class 주사위게임 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        주사위게임 test = new 주사위게임();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int[][] a = new int[n][3];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(n, a));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private int solution(int n, int[][] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a1 = a[i][0];
            int a2 = a[i][1];
            int a3 = a[i][2];
            int score = 0;

            if (a1 == a2 && a1 == a3) score = 10000 + a1*1000;
            else if (a1 == a2) score = 1000 + a1*100;
            else if (a2 == a3) score = 1000 + a2*100;
            else if (a1 == a3) score = 1000 + a3*100;
            else score = getMax(a1, a2, a3)*100;

            max = (max < score)? score : max;
        }

        return max;
    }

    private int getMax(int a,int b,int c) {
        int max = (a < b)? b : a;
        max = (max < c)? c : max;
        return max;
    }
}
