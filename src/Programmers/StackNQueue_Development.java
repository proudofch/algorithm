package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 	프로그래머스
	스택/큐 - 기능개발  */

/*	논리는 얼추 세웠는데 코드 구현을 못한다. 답답...
 	그래서 오늘도 남의 코드 ㅎㅎ;;
 	
 	얼추 세웠던 논리: 
 		1. for문을 돌면서 i값이 i+1보다 크다면 count++; 하려 했으나 그 다음 값 설정 못함
 		2. temp라는 임시 배열을 만들어 그 안에 세트로 묶이는 값을 넣고 배열의 크기를 리턴하려고 했음
 			(i와 i+1을 비교해 i가 크면 temp에 저장). 하지만 while문 작성 실패	*/

public class StackNQueue_Development {
	public static void main(String[] args) {

		//int[] progresses = {93, 30, 55};
		//int[] speeds = {1, 30, 5};
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		Queue<Integer> queue = new LinkedList<Integer>();

		// 구현에 며칠이 걸리는 지 구한다(이것만 내가 짠 코드..)
		for(int i=0; i<progresses.length; i++) {
			int day = ((100 - progresses[i]) % speeds[i] == 0) ? 
					(100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i] + 1;
			queue.add(day);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		int prevFunc = queue.poll(); //큐에 첫 번째로 들어간 값을 꺼낸다(큐에선 삭제됨). 읽어오기X
		int numOfFuncs = 1; //prevFunc을 하나 꺼냈으므로 기본값은 1
		
		while(!queue.isEmpty()) { //큐에 남은 값이 없을 때까지
			int curFunc = queue.poll(); //큐에서 값을 하나 더 꺼낸다.
			if(prevFunc >= curFunc) { //curFunc이 작다 = 개발 다 하고 배포 기다리는 기능 -> prevFunc이 제일 오래 걸린다.
				numOfFuncs++; //prevFunc과 같이 배포되므로 개수를 센다.
			} else { //prevFunc < curFunc이라면 개발이 오래 걸리는 기능이 나타났다는 뜻
				list.add(numOfFuncs); //이전까지 센 기능 개수를 list에 넣는다.
				numOfFuncs = 1; //첫 번째 세트(?)가 끝났으므로, 값 초기화
				prevFunc = curFunc; //curFunc은 새로이 등장한 개발 오래 걸리는 기능이므로 prevFunc에 넣어 기준 삼는다.
			}
		}
		
		list.add(numOfFuncs); //큐에 더 값이 없을 때 반복문을 탈출하면
							  //마지막 값을 확인하면서 만들어진 numOfFuncs가 list에 추가되지 않으므로, 여기서 넣어준다.

		//ArrayList의 값을 Array로 옮겨 담는다. 끝~!
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for(int i : answer) {
			System.out.println("answer: "+i);
		}
		
	}
}
