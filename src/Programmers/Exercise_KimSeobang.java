package Programmers;

/* 	프로그래머스
	연습문제 - 서울에서 김서방 찾기  */

/*	메모) 답을 찾으면 break로 반복문을 멈추자.	*/

public class Exercise_KimSeobang {
	
	public String solution(String[] seoul) {
		
		String answer = "";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 "+i+"에 있다";
				break;
			}
		}
		
		return answer;
	}
	
}
