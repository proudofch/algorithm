package BOJ_Level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L11_10871 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		
		String[] secondInput = br.readLine().split(" ");
		
		if(n == secondInput.length) {
			for(int i=0; i<secondInput.length; i++) {
				if(Integer.parseInt(secondInput[i]) < x) {
					bw.write(secondInput[i]+" ");
				}
			}
		}
		
		bw.close();
		br.close();

	}
}
