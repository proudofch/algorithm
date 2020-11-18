package BOJ_Level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L03_10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int[] array = new int[26]; // 알파벳 개수만큼 배열 생성
		
		for(int i=0; i<array.length; i++) {
			array[i] = -1; // -1로 다시 초기화
		}
		
		for(int i=0; i<word.length(); i++) {
			int index = (int)word.charAt(i)-97; // 알파벳별 인덱스
			// 아스키코드표에서 97이 a이기 때문에 a=0,b=1,... 이런 식으로 배열 방을 할당
			int x = word.indexOf(word.charAt(i)); // 단어 안의 각 알파벳의 위치
			array[index] = x; // 알파벳-숫자로 매칭된 방에 알파벳이 처음 등장한 index를 넣어준다.
		}
		
		for(int i : array) {
			System.out.print(i+" ");
		}
		
		/*  다른 풀이: 
			for문을 알파벳 개수만큼 돌면서 입력받은 String.indexOf(i+97)을 StringBuilder에 append한다.
			입력이 "baekjoon"일 때, 첫 번째 append값은 'a'의 index, 즉 1이다.
			i+97은 char로 자동 형변환되는 듯하다.
			그러니 이 풀이는 a~z를 순서대로 훑으면서 해당 알파벳이 존재하면 그 알파벳의 인덱스값을 append하는 것이다.  */
		
		br.close();
		
	}
}