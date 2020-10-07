package com.ym.basic1.hash;

import java.util.*;

/**
 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 *
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * genres[i]는 고유번호가 i인 노래의 장르입니다.
 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
 * 장르 종류는 100개 미만입니다.
 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
 * 모든 장르는 재생된 횟수가 다릅니다.
 * 입출력 예
 * genres	plays	return
 * [classic, pop, classic, classic, pop]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
 * 입출력 예 설명
 * classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.
 *
 * 고유 번호 3: 800회 재생
 * 고유 번호 0: 500회 재생
 * 고유 번호 2: 150회 재생
 * pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.
 *
 * 고유 번호 4: 2,500회 재생
 * 고유 번호 1: 600회 재생
 * 따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
 *
 * ※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.
 */
class 베스트앨범 {

    public static void main(String[] args){

        베스트앨범 test = new 베스트앨범();

        String[] genres1 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays1 = {500, 600, 150, 800, 2500};
        int[] result1 = test.solution(genres1, plays1);
        System.out.println(Arrays.toString(result1));

        String[] genres2 = {"classic", "classic", "classic", "classic", "pop"};
        int[] plays2 = {500, 150, 800, 800, 2500};
        int[] result2 = test.solution(genres2, plays2);
        System.out.println(Arrays.toString(result2));

    }

    private static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++)
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);

        List<String> keySetList = new ArrayList<String>(map.keySet());

        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        List<Integer> answerList = new ArrayList<>();

        for (String key : keySetList) {
            int max1 = Integer.MIN_VALUE;
            int maxIndex1 = -1;
            for (int i = 0; i < plays.length; i++) {
                if (max1 < plays[i] && key.equals(genres[i])) {
                    max1 = plays[i];
                    maxIndex1 = i;
                }
            }

            int max2 = Integer.MIN_VALUE;
            int maxIndex2 = -1;
            for (int i = 0; i < plays.length; i++) {
                if (max2 < plays[i] && key.equals(genres[i]) && i != maxIndex1) {
                    max2 = plays[i];
                    maxIndex2 = i;
                }
            }

            answerList.add(maxIndex1);
            if (maxIndex2 != -1) answerList.add(maxIndex2);
        }

        int[] answer = new int[answerList.size()];
        int idx = 0;
        for (Integer each : answerList) {
            answer[idx++] = each;
        }
        return answer;
    }
}
