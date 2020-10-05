package Programmers;

import java.util.Arrays;
import java.util.Comparator;


/*	프로그래머스
	정렬 - 가장 큰 수	*/


/*	숫자로 접근하면 정렬하기 어렵다!

	내 접근법: 주어진 수와 같은 자리수의 1 또는 10 또는 100 또는 1000을 만들고
	주어진 수를 위 수로 나눠서 몫을 비교하여 정렬했다.
	(예: 34를 String으로 바꿔 length()-1만큼을 0의 개수로 설정.
	그러면 두 자리수는 10, 세 자리수는 100으로 나눠진다.
	이 수를 새로운 배열의 같은 인덱스에 넣었다.)
	
	하지만, 몫이 같을 경우(예: 3,30,34) 
	자리수를 하나 내려 1 또는 10 또는 100으로 나누어 나머지를 비교해보려고 했으나.. 매우 복잡!
	
	그래서 답안을 찾았더니, 문자열로 보라고 한다.	*/


public class Sort_theLargestNumber {
	public static void main(String[] args) {
		
		
		/*	테스트 케이스	*/
		//int[] numbers = {6, 10, 2};
		//return "6210"
		int[] numbers = {3, 30, 34, 5, 9};
		//return "9534330"
		
		String[] num = new String[numbers.length]; //주어진 배열을 문자열로 보기 위해 String 배열 만들기
		
		for(int i=0; i<numbers.length; i++) {
			num[i] = String.valueOf(numbers[i]); //String.valueOf()로 숫자를 문자열로 바꿔준다.
//			num[i] = Integer.toString(numbers[i]); // 이것도 된다.
		}
		
		Arrays.sort(num, new Comparator<String>() { //Comparator 인터페이스 구현

			@Override
			public int compare(String o1, String o2) { //인터페이스에서 반드시 재정의해야 하는 함수 compare()
				return (o2+o1).compareTo(o1+o2); //return값을 이렇게 주면 내림차순 정렬한다.  
				//return (o1+o2).compareTo(o1+o2); //오름차순
				
				/*	값을 넣어보자	*/
				
				//3, 30, 34, 5, 9
				//o1 = 3, o2 = 30
				//303.compareTo(330); > 음수 리턴 > 그대로
				
				//o1 = 30, o2 = 34
				//3430.compareTo(3034); > 양수 리턴 > 바뀜
				
				// 3, 34, 30, 5, 9 (바뀜)
				//o1 = 30, o2 = 5
				//530.compareTo(305);
				
				// 3, 34, 5, 30, 9 (바뀜)
				//o1 = 30, o2 = 9
				//930.compareTo(309)
				
				//////////// 한 턴 종료 ////////////
				
				// 3, 34, 5, 9, 30 (바뀜)
				//o1 = 3, o2 = 34
				//343.compareTo(334)
				
				// 34, 3, 5, 9, 30 (바뀜)
				//o1 = 3, o2 = 5
				//53.compareTo(35)
				
				// 34, 5, 3, 9, 30 (바뀜)
				//o1 = 3, o2 = 9
				//93.compareTo(39)
				
				// 34, 5, 9, 3, 30 (바뀜)
				//o1 = 3, o2 = 30
				//303.compareTo(330) 

				//////////// 한 턴 종료 ////////////
				
				// 5, 9, 34, 3, 30 (다음 턴 종료 후)
				// 9, 5, 34, 3, 30 (최종)
				
				/*	결론: 내부적으로 버블 정렬을 하는 듯하다. 결합했을 때 작은 수를 뒤로 밀고 확정하는 식.	*/
				
			}
			
			//A.compareTo(B)
			//A를 기준삼아 B와 비교하는데,
			//A==B면 0, A<B면 음의 정수, A>B면 양의 정수를 리턴
			
			//compare() 메소드에선 음수 또는 0이면 객체의 자리가 그대로 유지되고, 양수인 경우 두 객체의 자리가 바뀐다.
			
		});
		
		String answer = "";
		
		if(num[0].equals("0")) { //정렬 후 num[0]=가장 큰 수. 그럼 그 다음 수는 당연히 0보다 작음. 결국 0이란 뜻
            answer += "0"; //0000과 같은 답을 방지하기 위해 0만 넣어준다.
            
        } else {
			for(String s : num) { //for문이 else문 밖에 있으면 000과 같은 답이 if문을 타고 또 for문을 타서 틀림.
	        	answer += s;
	        }
        }
		
		System.out.println(answer);
		
		
		
		/* 삽질의 흔적
		
		int temp;
		
		int[] arr = new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			
			String one = "1"; //1, 10, 100, 1000 중 어떤 수로 나눌 수 있을까?..를 찾기 위한 시작값 1
			String a = numbers[i] + ""; //int는 길이를 셀 수 없기 때문에 문자열로 만든다
			
			for(int k=0; k<a.length()-1; k++) {
				one += "0";
			}
			
			arr[i] = Integer.parseInt(one);
			//System.out.println("arr이당: "+arr[i]);
			//int newNum = numbers[i] / arr[i]; //앞자리수
			//System.out.println("앞자리수: "+newNum); //앞자리수가 나왔음
			//arr.add(newNum);
		}
		
		//arr이 다 만들어지지 않은 상태에서 안쪽으로 for문을 돌리니까 arithmeticException / by zero 남... 
		
		int temp2;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {

				if(numbers[i]/arr[i] < numbers[j]/arr[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				
				} else if(numbers[i]/arr[i] == numbers[j]/arr[j]) {
					
					if(numbers[i]%arr[i] < numbers[j]%arr[j]) {
						temp2 = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp2;
					}
				
				}
				
			}
		}
		
		//내림차순 정렬 코드 (박제)
		/*
			if(numbers[i] < numbers[j]) {
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		 */
		
	}
}
