package BOJ_Level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L04_03052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[] array = new int[10];
		boolean[] flag = new boolean[42]; // 42로 나눴을 때 나머지는 0~41로 나올 수 있다. 이를 각각 체크할 수 있게 배열 생성
		
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int index = Integer.parseInt(br.readLine()) % 42;
			flag[index] = true; // 등장한(?) 나머지에 해당하는 배열의 값을 true로 변경. 한 번 이후로는 true=true;인 셈
			
			/* 삽질의 흔적.. 조금만 변형돼도 헤매는구나; 그래도 flag 아이디어는 괜찮았네. */
			/*
			if(array[i] != array[i+1]) {
				count++;
				array[i] = -1;
				array[i+1] = -1;
			}
			
			if(array[i] == array[i+1]) {
				flag[i] = true;
				flag[i+1] = true;
			}
			*/
		}
		
		for(boolean b : flag) {
			if(b == true) {
				count++;
			}
		}
		
		System.out.println(count);
		
		br.close();
		
	}
}