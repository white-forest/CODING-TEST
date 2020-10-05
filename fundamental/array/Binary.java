package com.ym.fundamental.array;

import java.util.Scanner;

class Binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        Binary test = new Binary();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            test.solution(n);

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private void solution(int n) {
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        //System.out.print(n%2); 역순 출력
        solution(n/2);
        System.out.print(n%2);
    }
}
