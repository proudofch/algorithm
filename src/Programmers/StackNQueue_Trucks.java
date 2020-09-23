package Programmers;

import java.util.LinkedList;
import java.util.Queue;

/*	프로그래머스
	스택/큐 - 다리를 지나는 트럭	*/

/*	<배운 점>
	1. 반복문을 사용할 때 break로 인해 제대로 적용되지 못하고 사라지는 값이 있진 않은지 확인할 것
	2. 경우의 수를 생각하자.	*/

/*	문제 풀이 핵심
	-> 세 가지 경우의 수 (큐가 비었을 때, 큐에 원소가 있지만 무게가 차지 않을 때, 큐에 원소가 있지만 무게가 꽉 찼을 때)
	// 큐가 비었다 -> 뭔가를 올린다.
	// 큐에 뭐를 올렸다 -> 무게가 꽉 찼는가? -> YES -> 하나를 내보낸다 -> 큐가 비면 그 다음 걸 올린다 
	//                            -> NO -> 하나 더 올린다(무게는 확인해야함)  
*/

public class StackNQueue_Trucks {
	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		// return: 8
				
		Queue<Integer> bridge = new LinkedList<Integer>();
		
		int sum = 0;
		int time = 0;
		
		for(int i : truck_weights) {

			while(true) {
				
				if(bridge.isEmpty()) { //큐가 비었다면
					
					bridge.add(i); //큐에 트럭을 올린다
					sum += i; //무게를 책정한다
					time++;
					break;
					
				} else if(bridge.size() != bridge_length) { //큐가 비진 않았으나 자리가 남았을 때
					
					time++;	
					
					if(sum + i <= weight) { //무게 제한에 안 걸려서 올릴 수 있으면
						bridge.add(i);
						sum += i;
						break;
					} else { //무게 제한에 걸려서 올릴 수 없다면
						bridge.add(0); //큐는 채우나 무게에 지장을 주지 않는 0 삽입 
					}
					
				} else { //큐가 꽉 찼을 때
					sum -= bridge.poll(); //poll()되면서 poll()된 값을 sum에서 뺀다.
				}
				
			} // /.while
			
		} // /.for
		
		System.out.println(time+bridge_length);
		
	}
}
