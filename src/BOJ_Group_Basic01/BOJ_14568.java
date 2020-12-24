package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BOJ_14568 {
	public static void main(String[] args) throws IOException {
		
		// 3명이 N개를 나누는 경우의 수 세기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int candy = Integer.parseInt(br.readLine());
		// 사탕은 1~100개
		
		List<Integer> list;
		Set<List> set = new HashSet<List>();
		
		int a,b,c = 0;
		
		for(int i=2; i<=candy-3; i*=2) {
			list = new ArrayList<Integer>();
			a = i;
			b = candy-i;
			while(c < b+2) {
				c++;
				b -= 1;
			}
			if(a+b+c == candy) {
				list.add(a);
				list.add(b);
				list.add(c);
			}
			set.add(list);
		}
		
		int count = 0;
		for(List l : set) {
			if(!l.isEmpty()) {
				count++;
			}
			System.out.println(l);
		}
		System.out.println(count);
		
		br.close();
		
		
	}
}
