package com.ym.fundamental.iteration;

import java.util.Scanner;

class 약수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        약수 test = new 약수();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.print("answer: ");
            System.out.println(test.solution(n, k));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private  int solution(int n, int k) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) k--;
            if (k == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }

}
