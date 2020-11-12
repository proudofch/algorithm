package BOJ_Level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L02_02562 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[9];
		int max = Integer.MIN_VALUE;
		int index = -1;
		
		for(int i=0; i<array.length; i++) {
			
			array[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, array[i]);
			if(array[i] == max) {
				index = i+1;
			}
			
		}
		
		System.out.println(max+"\n"+index);
		
		br.close();
	}
}