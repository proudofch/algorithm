package Programmers;

/* 	프로그래머스
	연습문제 - 두 정수 사이의 합  */

/*	a랑 b는 그냥 비교하면 되는데 왜 굳이 빼기를 하려고 했을까..?
 	내가 풀었지만 이유를 모르겠다(..)	*/

public class Exercise_SumBtwIntegers {

	public long solution(int a, int b) {
		
		long answer = 0;
		
		if(a - b < 0) { //a 작은 수, b 큰 수
			for(int i=a; i<=b; i++) {
				answer += i;
			}
		} else if(a - b > 0) { //a 큰 수, b 작은 수
			for(int i=b; i<=a; i++) {
				answer += i;
			}
		} else { //a == b
			return a;
		}
		
		return answer;
	}
	
}
