package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class BOJ_02920 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
		ArrayList<String> scale = new ArrayList<String>();
		
		for(int i=0; i<8; i++) {
			scale.add(String.valueOf(i+1));
		}
		
		int ascCount = 0;
		int descCount = 0;
		
		/* for문을 두 개 쓰지 않고 i+1과 8-i를 활용하는 방법이 있다.
		 * i+1은 떠올렸지만 8-i는 떠올리지 못함.

		 * 이 방법 말고 "1 2 3 4 5 6 7 8"과 직접 비교하는 방법이 있는데, 좋은 코드일까?
		 * 너무 단순해서 의심스럽다. 하핫 */ 
		
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(scale.get(i))) {
				ascCount++;
			}
		}
		
		Collections.reverse(scale);
		
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(scale.get(i))) {
				descCount++;
			}
		}

		if(ascCount == 8) {
			System.out.println("ascending");
		} else if(descCount == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		br.close();
		
	}
}
