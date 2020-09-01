package Programmers_KitForHighScore;

/* 	프로그래머스
	코딩테스트 고득점 Kit
	완전탐색 - 모의고사  */

/*  2020.8.31. 알고리즘 공부 2일차

	<나의 틀린 접근법>
		1. 
		  */

public class BruteForce01 {

	//대충 30분은 씀... 1시간 30분 더 쓰기
	public int[] solution(int[] answers) {
		
		int[] answer = {};
		
		//int n = 1;
		int i;
		int check = 0;
		
			for(i=0; i<answers.length; i++) {
				if(answers[i] == i+1) {
					check += 1;
					if(i > 5) {
						i = 1;
					}
				}
			}			
		
		return answer; //여기는 문제를 맞춘 사람을 리턴하는 값이 담겨야 함

		/*
		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
			> 
		
		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		
		-1 +1 +1 -1 +2 -2 +3 // 
		
		
		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		 3 - 1 - 2 - 4 - 5
		  -2 +1 +2 +1, -2 +1 +2 +1
		
		*/
		
		
		
		
		
	}
}
