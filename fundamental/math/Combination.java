package com.ym.fundamental.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String go;

        Combination test = new Combination();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println("예제를 수행한 결과 입니다.");
            System.out.println(test.solution(n, m));

            System.out.print("\n계속할까요?(y/n): ");
            go = sc.next();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private BigInteger solution(int n, int m) {
        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        for(int i=0; i<m; i++) {
            num1 = num1.multiply(new BigInteger(String.valueOf(n-i)));
            num2 = num2.multiply(new BigInteger(String.valueOf(i+1)));
        }

        return num1.divide(num2);
    }
}
