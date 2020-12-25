package BOJ_Level07_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L05_01157 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		
		String word = br.readLine().toUpperCase();
		
		for(int i=0; i<word.length(); i++) {
			map.put(String.valueOf(word.charAt(i)), 
						map.getOrDefault(String.valueOf(word.charAt(i)),0) + 1);
						// getOrDefault: 키에 해당하는 값이 있다면 그 값을 돌려주고, 아니면 0 리턴
						// 처음엔 값이 없기 때문에 다 0+1=1이고 중복된 알파벳이 나오면 숫자가 올라간다.
		}
		
		int max = -1;
		
		for(String s : map.keySet()) { // key로 map을 확인하면서 가장 많이 나온 알파벳의 등장 횟수를 저장
			max = Math.max(max, map.get(s));
		}
		
		for(String s : map.keySet()) {
			if(map.get(s) == max) {
				list.add(s); // max값을 가진 알파벳을 list에 저장
			}
		}
		
		if(list.size() == 1) {
			System.out.println(list.get(0));
		} else { // list에 있는 알파벳이 여러 개일 경우
			System.out.println("?");
		}
		
		br.close();
		
	}
}
