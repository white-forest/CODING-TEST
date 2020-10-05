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

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private int solution(int n) {

    }
}
