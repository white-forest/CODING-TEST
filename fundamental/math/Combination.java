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
        System.out.println(n + "C" + m);
        for(int i=0; i<m; i++) {
            System.out.println("n-i:" + (n-i) + " i+1:" + (i+1));
            num1 = num1.multiply(new BigInteger(String.valueOf(n-i)));
            num2 = num2.multiply(new BigInteger(String.valueOf(i+1)));
            System.out.println("num1:" + num1 + " num2:" + num2);
        }

        return num1.divide(num2);
    }

    /**
     * <Python>
     * fact = [[0 for i in range(101)] for j in range(101)]
     * fact[0][0] = fact[1][0] = fact[1][1] = 1
     * for i in range(2, 101):
     *     for j in range(0, i+1):
     *         if i == j or j == 0:
     *             fact[i][j] = 1
     *         elif fact[i][j] == 0:
     *             fact[i][j] = fact[i-1][j-1] + fact[i-1][j]
     *
     * N, K = map(int, input().split())
     * print(fact[N][K])
     * </Python>
     */

    /**
     * <C++>
     * #include <stdio.h>
     * #include <limits.h>
     *
     * __int128 c[101][101];
     *
     * __int128 ncr(int n, int r) {
     * 	if(r==0 || r==n) return 1;
     * 	if(c[n][r]!=0) return c[n][r];
     * 	return c[n][r] = ncr(n-1, r) + ncr(n-1, r-1);
     * }
     *
     * int main()
     * {
     * 	int n,m;
     * 	scanf("%d %d",&n,&m);
     * 	__int128 a = ncr(n,m);
     * 	long long d = 1000000000000000000;
     * 	if(a > d)
     * 		printf("%lld%lld\n",(long long)(a/d), (long long)(a%d));
     * 	else
     * 		printf("%lld\n",(long long)a);
     * 	return 0;
     * }
     * </C++>
     */


}
