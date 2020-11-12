package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_01550 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 입력받은 수를 쪼개서 배열에 추가 */
		String[] array = br.readLine().split("");
		
		double answer = 0;
		double temp = 1;
		
		for(int i=0; i<array.length; i++) {
			
			/* 16진수의 알파벳을 숫자로 치환 */
			if(array[i].equals("A")) {
				array[i] = "10";
			} else if(array[i].equals("B")) {
				array[i] = "11";
			} else if(array[i].equals("C")) {
				array[i] = "12";
			} else if(array[i].equals("D")) {
				array[i] = "13";
			} else if(array[i].equals("E")) {
				array[i] = "14";
			} else if(array[i].equals("F")) {
				array[i] = "15";
			}
			
			/* String 배열을 int로 변환 */
			int num = Integer.parseInt(array[i]);
			
			/* Math.pow(): 거듭제곱 구하는 함수.
			 * 예) Math.pow(16,3) 16의 세제곱
			 * 배열 첫 번째 값은 배열 전체 길이-1 제곱이다. */
			answer += num * (Math.pow(16, array.length-temp));
			temp++;
			
		}
		
		/* Math.pow의 리턴값은 double이나, 출력은 int로 해야하므로 casting */
		System.out.println((int)answer);
		br.close();
	}
}
