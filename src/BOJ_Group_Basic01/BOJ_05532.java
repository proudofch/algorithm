package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_05532 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int day = Integer.parseInt(br.readLine());
		int korean = Integer.parseInt(br.readLine());
		int math = Integer.parseInt(br.readLine());
		int maxKoreanPage = Integer.parseInt(br.readLine());
		int maxMathPage = Integer.parseInt(br.readLine());
		
		korean = (korean % maxKoreanPage != 0) ? korean / maxKoreanPage +1 : korean / maxKoreanPage;
		math = (math % maxMathPage != 0) ? math / maxMathPage +1 : math / maxMathPage;
		
		if(korean > math) {
			System.out.println(day-korean);
		} else {
			System.out.println(day-math);
		}
		
		br.close();
		
	}
}