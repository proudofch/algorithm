package BOJ_Level03_For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L01_02739 {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(reader);
		String input = buffer.readLine();
		
		int dan = Integer.parseInt(input);
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
	}
}
