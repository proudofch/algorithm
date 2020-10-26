package Programmers;

import java.util.ArrayList;
import java.util.List;


/*	프로그래머스
	월간 코드 챌린지 시즌 1 - 3진법 뒤집기	*/

/*	진법 변환
		10진법 수를 x진법으로 -> x로 나눈 몫과 나머지로 조합
		x진법 수를 10진법으로 -> x^n을 곱해서 모든 자리수 더하기(n=0부터 n++)	*/

class Base3 {
	
	public int solution(int n) {
        
		List<Integer> array = new ArrayList<Integer>();
		
		while(n != 0) {
			array.add(n%3);
			n /= 3;
		}

		double answer = 0;
        int temp = 1;
        
        for(int i=0; i<array.size(); i++) {
        	answer += array.get(i) * Math.pow(3, array.size()-temp); // 예) Math.pow(16,3) -> 16의 세제곱
        	temp++;
        }
        
        return (int)answer;
    }
	
}


public class Monthly_S1_Base3 {
	public static void main(String[] args) {

		/*	테스트케이스
		int n = 45;  // result = 7
		int n = 125; // result = 229
		int n = 3;   // result = 1 ??
		int n = 2;   // result = 2 ??
		int n = 1;   // result = 1	*/
		
		Base3 b3 = new Base3();
		System.out.println(b3.solution(3));
		
	}
	
	
	/*	참고	*/

	/*	썬의 3진법 만드는 재귀함수	*/
	private static String rTernary(int n) {
		if(n > 0 && n < 3) {
			return Integer.toString(n);
		}
		return Integer.toString(n % 3) + rTernary(n / 3);
		// 리턴값의 앞,뒤항을 바꾸면 오름차순<->내림차순
	}
	
	// Integer.toString(n, 3); // n을 3진법으로 바꾼다.(..)
	// int k = temp.charAt(i) - '0'; // 0을 빼면 해당 char의 숫자값을 알 수 있다. int casting도 가능
	
}