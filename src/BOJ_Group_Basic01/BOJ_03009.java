package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 시도
 * 1. 2차원 배열 > 열만 도는 법을 몰라서 실패
 * 2. Map > 중복된 키, 엉뚱한 답으로 실패
 * 3. ArrayList > count=1이 아닌 경우를 어떻게 출력할지 몰라서 실패
 * (인터넷 힌트 찬스: 좌표를 저장하고 index로 직접 접근하는 방법)
 * 4. 좌표를 int[2]에 각각 저장해서 index로 접근해서 풀기 (성공)
 * 5. 1 다시 시도 (성공)
 * 
 * 너무 어렵게 생각한 듯.. */

public class BOJ_03009 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] array = new int[3][2];
		
		for(int i=0; i<array.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int x;
		int y;

		if(array[0][0] == array[1][0]) {
			x = array[2][0];
		} else if(array[0][0] == array[2][0]) {
			x = array[1][0];
		} else {
			x = array[0][0];
		}
		
		if(array[0][1] == array[1][1]) {
			y = array[2][1];
		} else if(array[0][1] == array[2][1]) {
			y = array[1][1];
		} else {
			y = array[0][1];
		}
		
		System.out.println(x + " " + y);
		
		br.close();
		
		/* 2차원 배열 열별로 돌기 */
		/*
		for(int i=0; i<array[i].length; i++) {
			for(int j=0; j<array.length; j++) {
				// i<array.length; j<array[i].length;일 때 행과 열의 수가 같다면 array[j][i]로 출력
				// 행과 열의 수가 다르다면 array[j][i]로 출력하려 할 때 arrayIndexOutOfBoundsException이 발생하므로 위와 같이 i,j의 조건식 변경
			}
		}
		*/
		
	}
}
