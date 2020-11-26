package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10768 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int month = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());
		
		if(month == 1) {
			System.out.println("Before");
			
		} else if(month == 2) {
			
			if(1 <= day && day <= 17) {
				System.out.println("Before");
			} else if(day == 18) {
				System.out.println("Special");
			} else if(19 <= day && day <= 31) {
				System.out.println("After");
			}
			
		} else if(3 <= month && month <= 12) {
			System.out.println("After");
		}
		
		br.close();
		
	}
}
