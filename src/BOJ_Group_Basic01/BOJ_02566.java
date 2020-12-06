package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_02566 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] matrix = new int[9][9];
		int max = -1;
		
		// 2차원 배열에 넣지 않고 matrix[i][j]값을 확인하면서 max일 때 i와 j를 저장해도 됨
		// if(matrix[i][j] > max) max,i,j 저장 (Math.max 사용X)
		for(int i=0; i<matrix.length; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = Integer.parseInt(temp[j]);
				max = Math.max(max, matrix[i][j]);
			}
		}
		
		int row = 0;
		int column = 0;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] == max) {
					column = i+1;
					row = j+1;
				}
			}
		}
		
		sb.append(max + "\n" + column + " "+ row);
		System.out.println(sb.toString());
		
		br.close();
		
	}
}