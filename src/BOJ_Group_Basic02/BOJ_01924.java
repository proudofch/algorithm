package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_01924 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		int days = 0;
		int key = 0; 
		String answer = "";
		
		if(month > 1) {
			for(int i=1; i<month; i++) {
				if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
					days += 31;
				} else if(i == 2) {
					days += 28;
				} else {
					days += 30;
				}
			}
			days += day;
			key = days % 7;
			
		} else { // 1월일 때
			key = day % 7;
		}
		
		switch (key) {
			case 0: answer = "SUN"; break;
			case 1: answer = "MON"; break;
			case 2: answer = "TUE"; break;
			case 3: answer = "WED"; break;
			case 4: answer = "THU"; break;
			case 5: answer = "FRI"; break;
			case 6: answer = "SAT"; break;
		}
		
		System.out.println(answer);
		
		br.close();
		
		/* 다른 사람 풀이
		 * {31,28,31,30,..} 이렇게 각 달의 날짜를 미리 배열로 만들고
		 * 입력받은 달 이전까지 for문을 돌려서 저 배열의 값을 더한 후
		 * {"MON","TUE",...} 요일 배열에서 %7 값을 찾아서 출력 */
		
	}
}
