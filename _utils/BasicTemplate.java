package com.ym._utils;

import java.util.Scanner;

class BasicTemplate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        BasicTemplate test = new BasicTemplate();

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
        ;
    }
}
