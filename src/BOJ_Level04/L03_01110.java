package BOJ_Level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/* '오른쪽' 같은 말에 현혹되지 말고, 십의 자리와 일의 자리를 떠올리자.
	몫과 나머지를 활용하자.	*/


public class L03_01110 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int temp = input; //input은 비교값으로 남겨두고, 실제로는 복사값을 쓴다.
		int count = 0;
		
		while (true) {

			count++;
			int sum = temp/10 + temp%10;
			int newRight = sum%10;
			int newNum = (temp%10)*10 + newRight;
			
			if(newNum == input) {
				break;
			} else {
				temp = newNum;
			}
			
		}
		
		String answer = String.valueOf(count);
		
		bw.write(answer);
		br.close();
		bw.close();
	}
}
