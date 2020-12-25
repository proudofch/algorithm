package BOJ_Level03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L04_15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(buffer.readLine());
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0; i<num; i++) {
			String cases = buffer.readLine();
			String[] numbers = cases.split(" ");
			String sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + "\n";
			writer.write(sum);
		}
		writer.flush();
		writer.close();
	}
}
