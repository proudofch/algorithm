package Programmers;

import java.util.Arrays;

/* 	프로그래머스
	코딩테스트 고득점 Kit
	해시 - 완주하지 못한 선수  */

/*  2020.8.28. 알고리즘 공부 1일차
    2시간 동안 고민해보고 답 안 나오면 구글링하기로 결정(했으나 오늘은 일찍 구글링해서 반성..)
    
	<나의 틀린 접근법>
		1. for문을 돌리면서 HashMap key로 index를 주려고 하니 이후 정렬 문제가 발생
		2. 그래서 key, value로 모두 파라미터로 받은 배열값을 주려 했으나..? 이후 노답 (좀더 생각했다면 value로 숫자를 줄 수 있었을까?)
		3. 구글링하여 아래 답을 대충 찾았으나 equals 대신 비교연산자 써서 오류 발생  */
	
public class Hash_Unfinished {

	public String solution(String[] participant, String[] completion) {

		Arrays.sort(participant); //기절... 우와....
		Arrays.sort(completion);
		
		int i;
		
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[i];
		
		//최상위에 올라와있던 다른 사람의 풀이
		/*
			String answer = "";
			
	        HashMap<String, Integer> hm = new HashMap<>();
	        
	        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        													//키에 해당하는 값이 있으면 돌려주고, 아니면 기본값 0 리턴
	        												 eden, 1
	        												 lion, 1
	        												 lion, 2 //이런 식으로 동명이인 처리
	        												 
	        for(String player : completion) hm.put(player, hm.get(player) - 1);
	        												eden, 0
	        												lion, 1
	        													
	        for(String key : hm.keySet()) {
	            if (hm.get(key) != 0){ //value=0이 아니라면 완주하지 못한 선수
	                answer = key;
	            }
	        }
	        
	        return answer;
		*/
		
	}

}
