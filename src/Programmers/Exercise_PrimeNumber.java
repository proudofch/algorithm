package Programmers;

import java.util.ArrayList;
import java.util.List;

/* 	프로그래머스
	연습문제 - 소수 찾기  */

public class Exercise_PrimeNumber {

	public static int solution(int n) {
		
		/*	소수는 1과 자기 자신으로밖에 나뉘지 않는다.
			즉, 1과 자기 자신으로 나눌 때만 나머지가 0이므로
			나머지 0의 개수가 두 개인 경우만 걸렀다.
		
			테스트 케이스는 통과했지만 효율성 탈락	*/
		/*
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			int check = 0; //나머지 0 누적 변수
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					check += 1;
				}
			}
			if(check == 2) {
				list.add(i);
			}
		}
		
		answer = list.size();
		return answer;
		*/
		
		
		/*	에라토스테네스의 체 적용(1차) 
		 		-> 또 시간 초과 ^^;	*/
		
		/*
		int answer = 0;
		
		List<Boolean> primeList = new ArrayList<Boolean>(n+1); //방 개수 설정 (ex.5 입력하면 6개. 인덱스때문)
		
		primeList.add(false); //0번째 방 (0 소수 아님)
		primeList.add(false); //1번째 방 (1 소수 아님)
		
		for(int i=2; i<=n; i++) {
			primeList.add(true); //0과 1을 제외한 나머지 인덱스 방에 일단 다 true를 때려넣는다
		}
		
		int size = 0;

		for(int i=2; (i*i)<=n; i++) { 
			if(primeList.get(i)) { //false가 나오면 if문을 타지 않는다. false=소수가 아님
				for(int j=i*i; j<=n; j+=i) { //j+=i로 j의 배수 처리
					primeList.set(j, false); //set: 특정 인덱스값을 대체하는 함수
				}
			}
		}
		
		for(int i=0; i<primeList.size(); i++) {
			if(primeList.get(i) == true) {
				System.out.println("소수: "+i);
				size++;
			}
		}
		
		answer = size;
		return answer;
		*/
		
		
		/*	에라토스테네스의 체 적용(2차)	*/
		
		int answer = 0; //소수 개수를 담을 변수
		int[] number = new int[n+1]; //인덱스를 고려하여 입력값+1한 후 정적 배열 만들기
		
		for(int i=2; i<=n; i++) { //각 인덱스에 인덱스와 같은 수를 넣는다 (0,1은 소수가 아니기 때문에 i=2부터 시작)
			number[i] = i;
		}
		
		for(int i=2; i<=n; i++) { //만들어진 배열을 돌면서
			if(number[i] == 0) {
				continue;
			}
			for(int j=2*i; j<=n; j+=i) {
				number[j] = 0;
			}
		}
		
		for(int i=0; i<number.length; i++) {
			if(number[i]!=0) {
				answer++;
			}
		}
		
		return answer;
	}

	
	
	
	public static void main(String[] args) {
		System.out.println(solution(30000));
	}
	
}