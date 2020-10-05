package com.ym.fundamental.iteration;

import java.util.Scanner;

class 카운트다운 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        카운트다운 test = new 카운트다운();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.print("answer: ");
            test.solution(n);

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n) {
        while (true) {
            System.out.println(n);
            n--;
            if (n == 0) break;
        }
    }
}
