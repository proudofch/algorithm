package BOJ_Level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class L10_02439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				if(i < j) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}