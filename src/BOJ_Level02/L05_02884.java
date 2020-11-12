package Backjoon_Level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L05_02884 {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(reader);
		String[] time = buffer.readLine().split(" ");
		
		int h = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		
		if(0 <= h && h <= 23 && 0 <= m && m <= 59) {
			
			if(m >= 45) {
				m = m-45;
			}
			else if(m < 45) {
				m = 60 + m - 45;
				if(h == 0) {
					h = 23;
				} else {
					h--;
				}
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println("Wrong input");
		}
	}
}
