package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*	답은 제대로 나오나 시간 초과로 해결 못함.
	시간 복잡도 공부는 기본을 다진 후 다시 하자.
	(for문이 너무 많아서 시간 초과 나는 게 맞음)	*/

public class BOJ_11650 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int numberOfDots = Integer.parseInt(br.readLine());
		
		int[][] array = new int[numberOfDots][2];
		
		for(int i=0; i<array.length; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			array[i][0] = x;
			array[i][1] = y;
			
		}
		
		int tempX;
		int tempY;
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i][0] > array[j][0]) {
					
					tempX = array[i][0];
					tempY = array[i][1];
					
					array[i][0] = array[j][0];
					array[i][1] = array[j][1];
					
					array[j][0] = tempX;
					array[j][1] = tempY;
					
				} else if(array[i][0] == array[j][0]) { //x좌표 값이 똑같다면 y좌표 값 비교
					
					if(array[i][1] > array[j][1]) {
						
						// 결국 첫 번째 if문과 똑같은데... 어떻게 줄이지
						tempX = array[i][0];
						tempY = array[i][1];
						
						array[i][0] = array[j][0];
						array[i][1] = array[j][1];
						
						array[j][0] = tempX;
						array[j][1] = tempY;
						
					}
				}
			}
			sb.append(array[i][0] + " " + array[i][1] + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
