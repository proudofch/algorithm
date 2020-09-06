package Programmers;

/* 	프로그래머스
	연습문제 - 가운데 글자 가져오기  */

public class Exercise_MiddleLetter {
	public static String solution(String s) {
		
		String answer = "";
		
		if(s.length()%2 != 0) {
			answer = s.substring(s.length()/2, s.length()/2+1);
		} else {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		}
	    
		return answer;
	}
}
