package BOJ_Level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L07_11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=input; i++) {
			String[] cases = br.readLine().split(" ");
			int sum = Integer.parseInt(cases[0]) + Integer.parseInt(cases[1]); 
			bw.write("Case #"+i+": "+sum+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
