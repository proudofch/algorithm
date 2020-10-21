package Backjoon_Level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L05_02741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(reader.readLine());
		
		for(int i=1; i<=input; i++) {
			writer.write(i+"\n");
		}
		
		writer.flush();
		writer.close();
		reader.close();
		
	}
}
