package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_03003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		/* 다른 풀이: 킹,퀸,룩,비숍,나이트,폰의 고정된 값을 배열에 넣어 순회하면서 차를 구할 수도 있다.
			이렇게 하면 코드 수정이 간결하겠다. */
		int[] array = new int[6];
		int[] chess = {1,1,2,2,2,8};
		for(int i=0; i<array.length; i++) {
			array[i] = chess[i] - Integer.parseInt(st.nextToken());
		}
		
		/* 나의 풀이 */
		int king = 1 - Integer.parseInt(st.nextToken());
		int queen = 1 - Integer.parseInt(st.nextToken());
		int rook = 2 - Integer.parseInt(st.nextToken());
		int bishop = 2 - Integer.parseInt(st.nextToken());
		int knight = 2 - Integer.parseInt(st.nextToken());
		int pawn = 8 - Integer.parseInt(st.nextToken());
		
		sb.append(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
		System.out.println(sb.toString());
		br.close();
		
	}
}
