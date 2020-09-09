package Programmers;

/* 	프로그래머스
	연습문제 - 수박수박수박수박수박수?	*/

public class Exercise_Subak {

	public String solution(int n) {
		
		String answer = "";
		
		for(int i=0; i<n; i++) {
			String temp = (i % 2 == 0) ? "수" : "박";
			answer += temp;
		}
		
		return answer;
		
	}
	
}