package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*	프로그래머스
	연습문제 - 문자열 내 마음대로 정렬하기	*/

/*	둘 다 남의 코드. 아래는 시도 기록
	- Comparator 쓰는 게 낯설어서 포기했고
	- substring()으로 n번째 앞 문자를 제거하고 sort한 뒤 다시 앞 글자를 붙이려고 했으나 실패
	  (자른 문자열을 새 배열에 넣었더니 정렬 후 앞 문자를 다시 붙일 때 앞 문자가 정렬되지 않은 상태여서 엉뚱한 글자가 나옴)	*/

class Sort_Solution {
    
	/*	다른 사람 풀이 1	*/
	public String[] solution(String[] strings, int n) {
        
    	Arrays.sort(strings); // 일단 사전 순 정렬
		Arrays.sort(strings, new Comparator<String>() { // Comparator로 재정렬
			@Override
			public int compare(String o1, String o2) {
				char c1 = o1.charAt(n);
				System.out.println("c1="+c1);
				char c2 = o2.charAt(n);
				System.out.println("c2="+c2);
				return c1 - c2; // 여기서 음수,0=그대로 / 양수=자리바꿈
			}
		});
        
        return strings;
    }
	
}

public class Exercise_SortString {
	public static void main(String[] args) {

		/*	테스트 케이스	*/
//		String[] strings = {"sun", "bed", "car"}; // car, bed, sun
//		int n = 1;
		String[] strings = {"abce", "abcd", "cdx"}; // abcd, abce, cdx
		int n = 2;
		
		Sort_Solution s = new Sort_Solution();
		String[] ans = s.solution(strings, n);
		for(String a : ans) {
			System.out.println(a);
		}
		
		/*	다른 사람 풀이 2	*/
		ArrayList<String> array = new ArrayList<>();
		
		for(int i=0; i<strings.length; i++) {
			array.add(strings[i].charAt(n) + strings[i]); // n번째 글자를 접두어로 붙여서 정렬
		}
		
		Collections.sort(array); // 같은 값이면 여기서 사전 순으로 정렬
		
		for(int i=0; i<array.size(); i++) {
			array.set(i, array.get(i).substring(1)); // 정렬 후 접두어 떼기
		}
		
	}
}