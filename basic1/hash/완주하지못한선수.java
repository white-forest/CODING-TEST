package com.ym.basic1.hash;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 입출력 예
 * participant	completion	return
 * [leo, kiki, eden]	[eden, kiki]	leo
 * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
 * [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
 * 입출력 예 설명
 * 예제 #1
 * leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 *
 * 예제 #2
 * vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 *
 * 예제 #3
 * mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
class 완주하지못한선수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String go;

        완주하지못한선수 test = new 완주하지못한선수();

        do {
            System.out.println("\n예제를 입력해 주세요~!");

            String[] participant = br.readLine().split(" ");
            String[] completion = br.readLine().split(" ");

            System.out.println("예제를 수행한 결과 입니다.");
            bw.write(test.solution(participant, completion));
            bw.flush();

            System.out.print("\n계속할까요?(y/n): ");
            go = br.readLine();
            go.toLowerCase();
        } while(go.equals("y"));
    }

    private static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (; i < completion.length; i++) {
            if (participant[i].equals(completion[i]) == false) {
                break;
            }
        }

        return participant[i];
    }

    private static String solution2(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) map.put(p, map.getOrDefault(p,0) + 1);
        for (String p : completion) map.put(p, map.get(p) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
            }
        }

        return answer;
    }

}
