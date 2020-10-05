package com.ym.fundamental.array;

import java.util.Scanner;

class CardGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        CardGame test = new CardGame();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int[] a = new int[10];
            int[] b = new int[10];

            for (int i = 0; i < a.length; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < b.length; i++)
                b[i] = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(a, b));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private String solution(int[] a, int[] b) {
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < a.length; i++) {
            aScore = (a[i] > b[i])? aScore+1 : aScore;
            bScore = (b[i] > a[i])? bScore+1 : bScore;
        }
        if (aScore > bScore) return "A";
        else if (bScore > aScore) return "B";
        return "D";
    }

}
