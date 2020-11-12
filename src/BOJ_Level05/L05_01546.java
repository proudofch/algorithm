package Backjoon_Level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class L05_01546 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		float[] array = new float[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<array.length; i++) {
			array[i] = Float.parseFloat(st.nextToken());
		}
		
		Arrays.sort(array);
		
		float max = array[array.length-1]; //최대값
		float sum = 0;
		
		for(int i=0; i<array.length; i++) {
			array[i] = array[i]/max*100;
			sum += array[i];
		}
		
		System.out.println(sum/array.length);
		
		br.close();
		
	}
}