package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_02455 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] offPeople = new int[4];
		int[] onPeople = new int[4];
		
		for(int i=0; i<4; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int getOff = Integer.parseInt(st.nextToken());
			int getOn = Integer.parseInt(st.nextToken());
			
			offPeople[i] = getOff;
			onPeople[i] = getOn;
		}
		
		int numberOfPeople = onPeople[0];
		int max = onPeople[0];
		
		for(int i=1; i<4; i++) {
			
			numberOfPeople -= offPeople[i];
			numberOfPeople += onPeople[i];
			
			if(numberOfPeople > max) {
				max = numberOfPeople;
			}
		}
		
		System.out.println(max);
		
		br.close();
		
	}
}
