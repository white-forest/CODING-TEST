package com.ym.fundamental.condition;

import java.util.Scanner;

class 윷놀이 {

    private String solution(int[][] a) {
        String answer = "";

        for(int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }

            if (sum == 0) answer += "D\n";
            if (sum == 1) answer += "C\n";
            if (sum == 2) answer += "B\n";
            if (sum == 3) answer += "A\n";
            if (sum == 4) answer += "E\n";
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        윷놀이 test = new 윷놀이();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int[][] a = new int[3][4];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.print("answer: ");
            System.out.println(test.solution(a));

            System.out.print("계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));

    }

}
