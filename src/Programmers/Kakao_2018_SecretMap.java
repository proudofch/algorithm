package Programmers;

/* 	프로그래머스
	2018 KAKAO BLIND RECRUITMENT - 비밀 지도  */

/* 	남의 코드...
	시도) Integer.toBinaryString을 arr1과 arr2에 각각 적용하려 했으나, 다시 split해서 비교해야 해서 포기..	*/

public class Kakao_2018_SecretMap {
	public static void main(String[] args) {

		/* 테스트 케이스 */
		/*
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		*/
		// ["#####","# # #", "### #", "#  ##", "#####"]
		
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		// ["######", "###  #", "##  ##", " #### ", " #####", "### # "]

		String[] answer = new String[n];
		
		for(int i=0; i<n; i++) {
			
			String a = Integer.toBinaryString(arr1[i] | arr2[i]);
			// arr1[i]와 arr2[i]의 각 요소를 이진수로 바꾼 후(Integer.toBinaryString), 비트 연산한다.
			// 두 비트 중 하나라도 1이면 1을 반환하고, 모두 0일 때만 0을 반환한다.
			// 즉, 벽(1)이 하나라도 끼어 있으면 벽으로 판단
			
			a = String.format("%" + n + "s", a);
			// %숫자s -> 숫자만큼 좌측에 공백을 채운다. 숫자가 음수일 경우 우측에 채운다.
			// 한 변의 길이(n)를 충족하지 못한 비트 연산 결과가 나올 경우, 공백을 채워 자리수를 n으로 맞춰준다.
			// 공백 = 0. 어차피 아래에서 0은 공백으로 치환되기에, 두 번 작업할 필요 없이 미리 공백을 채우는 것이다.
			a = a.replaceAll("1", "#");
			a = a.replaceAll("0", " ");
			
            answer[i] = a;
		}	
		
		for(String s : answer) {
			System.out.println(s);
		}
		
	}
}