package BOJ_Group_Basic01;

import java.util.Scanner;

public class BOJ_15894 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*	문제를 잘 읽자...
			1 <= n <= 10^9이기 때문에, 10^9를 테스트 케이스로 넣으면 오버플로우가 발생하여 잘못된 값이 나온다.
			int의 범위: -2^31부터 2^31-1. 대충 +-21억
			10^9 대입 -> 40억 -> 오버플로우 발생	*/
		
		long n = scanner.nextLong();
		System.out.println(4*n);
		
		/*	왜 4*n인가?
			아랫변 길이 = 1*n
			윗변 길이 = 1*n (층이 나뉘어 있지만 일자로 붙이면 결국 아랫변과 똑같다)
			왼쪽 변+오른쪽 변 = 한 층에 두 개씩, 즉 2*n	*/
		
		scanner.close();
		
	}
}
