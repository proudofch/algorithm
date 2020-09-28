package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*	프로그래머스
	해시 - 전화번호 목록	*/

public class Hash_PhoneBook {
	public static void main(String[] args) {
		
		//String[] phone_book = {"119", "97674223", "1195524421"}; //false
		//String[] phone_book = {"123", "456" , "789"}; //true
		//String[] phone_book = {"12", "123", "1235", "567", "88"}; //false
		String[] phone_book = {"987987", "87"}; //true 
		
		Arrays.sort(phone_book); //접두어 확인을 위해 오름차순 정렬
		boolean answer = true;
		
		Map<Integer, String> map = new HashMap<>(); //해시 카테고리에 있어서.. 일단 사용
		
		for(int i=0; i<phone_book.length; i++) {
			map.put(i, phone_book[i]); //key는 인덱스, value는 배열값으로 넣었다.
		}
		
		Loop : for(int i=0; i<map.size(); i++) {
			for(int j=i+1; j<map.size(); j++) {
				//if(map.get(j).contains(map.get(i))) { //contains()로 통과했지만(프로그래머스 틀린듯)
				if(map.get(j).startsWith(map.get(i))) { //'접두사'면 startsWith()가 맞다.
					answer = false;
					break Loop; //하나라도 발견되면 다른 건 검사할 필요 없으므로 바깥 for문을 벗어나게 만든다.
				}
			}
		}
		
		//위의 해시는 제 역할이 없으므로, 해시 없이 이렇게 풀어도 될 듯하다(오름차순 정렬은 해야 함).
		Loop2 : for(int i=0; i<phone_book.length; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[j].startsWith(phone_book[i])) { //뒤 인덱스(j)는 앞 인덱스(i)로 시작되는가?
					answer = false;
					break Loop2;
				}
			}
		}
		
		System.out.println(answer);
		
	}
}
