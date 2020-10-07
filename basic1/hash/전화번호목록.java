package com.ym.basic1.hash;

import java.io.*;
import java.util.Arrays;

/**
 * 문제 설명
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 * 입출력 예제
 * phone_book	return
 * [119, 97674223, 1195524421]	false
 * [123,456,789]	true
 * [12,123,1235,567,88]	false
 * 입출력 예 설명
 * 입출력 예 #1
 * 앞에서 설명한 예와 같습니다.
 *
 * 입출력 예 #2
 * 한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.
 *
 * 입출력 예 #3
 * 첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
 *
 * 알림
 *
 * 2019년 5월 13일, 테스트 케이스가 변경되었습니다. 이로 인해 이전에 통과하던 코드가 더 이상 통과하지 않을 수 있습니다.
 */
class 전화번호목록 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String go;

        전화번호목록 test = new 전화번호목록();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            String[] phoneBook = br.readLine().split(", ");

            System.out.println("예제를 수행한 결과 입니다.");
            String answer = (test.solution(phoneBook))? "true" : "false";
            bw.write(answer);
            bw.flush();
            bw.write(Arrays.toString(phoneBook));
            bw.flush();

            System.out.print("\n계속할까요?(y/n): ");
            go = br.readLine();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private static boolean solution(String[] phone_book) {
        /**
         * Comparator<String> lengthComparator = new Comparator<String>(){
         *           public int compare(String str1, String str2){
         *             return str1.length() - str2.length();
         *           }
         *         };
         *
         * Arrays.sort(phone_book, lengthComparator); 로 비교 가능
         */

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length-1; i++) {
            //접두사 확인이기 때문에 contains 쓰면 안된다.
//            if (phone_book[i+1].contains(phone_book[i])) {
//                return false;
//            }

            if (phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}
