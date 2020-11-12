package Backjoon_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_05543 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[5];
		
		for(int i=0; i<5; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int[] burger = Arrays.copyOfRange(array, 0, 3);
		int[] drink = Arrays.copyOfRange(array, 3, 5);
		Arrays.sort(burger);
		Arrays.sort(drink);
		
		System.out.println(burger[0]+drink[0]-50);
		
		br.close();
	}
}