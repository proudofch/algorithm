package Programmers;

import java.util.ArrayList;
import java.util.List;

/* 	프로그래머스
	연습문제 - 소수 찾기  */

/*	배운점: 
		1. 효율을 따졌을 때 정적 배열과 동적 배열의 차이는 크지 않다.
		2. 효율성을 위해서는 불필요한 반복 부분을 찾아 개선해야 한다.	*/

public class Exercise_PrimeNumber {

	public static int solution(int n) {
		
		/*	소수는 1과 자기 자신으로밖에 나뉘지 않는다.
			즉, 1과 자기 자신으로 나눌 때만 나머지가 0이므로
			나머지 0의 개수가 두 개인 경우만 걸렀다.
		
			테스트 케이스는 통과했지만 효율성 탈락	*/
		/*
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) { //1부터 입력한 수 까지를 돌면서
			int check = 0;
			for(int j=1; j<=i; j++) { //1부터 입력받은 수까지로 나눠보면서
				if(i % j == 0) { //나머지가 0인 경우를 체크
					check += 1;
				}
			}
			if(check == 2) { //소수는 1과 자기 자신으로만 나뉘므로, 나머지가 0인 경우는 두 번 뿐이다.
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
			primeList.add(true); //0과 1을 제외한 나머지 인덱스 방에 일단 다 true를 넣는다
		}
		
		for(int i=2; (i*i)<=n; i++) { //제곱근보다 작은 수까지만 도는 이유: 제곱근을 넘어서면 대칭됨 
			if(primeList.get(i)) {
				for(int j=i*i; j<=n; j+=i) { //j+=i로 j의 배수 처리
					//"i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다."
					//primeList.set(j, false); //set: 특정 인덱스값을 대체하는 함수
					primeList.remove(j);
				}
			}
		}
		
		int size = 0;
		
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
		int[] number = new int[n+1]; //인덱스를 고려하여 입력값+1한 정적 배열 만들기
		
		for(int i=2; i<=n; i++) { //각 인덱스에 인덱스와 같은 수를 넣는다 (0,1은 소수가 아니기 때문에 i=2부터 시작)
			number[i] = i;
		}
		
		for(int i=2; i<=n; i++) { //만들어진 배열을 돌면서
			if(number[i] == 0) { //방 안의 값이 0이면 넘어가고
				continue;
			}
			for(int j=2*i; j<=n; j+=i) { //j+=i로 배수 제거. j=2*i인 건 i는 판별이 끝났기 때문인 듯?
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
	
}