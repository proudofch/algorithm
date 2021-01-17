package BOJ_Group_Basic02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_02309 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> dwarfs = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			int height = Integer.parseInt(br.readLine());
			dwarfs.add(height);
			sum += height;
		}
		
		Collections.sort(dwarfs);
		
		Loop: for(int i = 0; i < dwarfs.size(); i++) {
			for(int j = i+1; j < dwarfs.size(); j++) {
				if(sum - (dwarfs.get(i) + dwarfs.get(j)) == 100) {
					// j > i의 순서로 삭제해야 함 (i를 먼저 삭제하면 j의 값이 바뀌면서 엉뚱한 게 삭제됨)
					dwarfs.remove(j);
					dwarfs.remove(i);
					break Loop;
				}
			}
		}
		
		for(int i : dwarfs) {
			System.out.println(i);
		}
		
		br.close();
		
	}
}
