package BOJ_Group_Basic02;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_11718 {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		
		/* BufferedReader 쓸 거라면 hasNextLine() 같은 함수가 없기 때문에 flag를 만들어주거나,
		 * br.readLine() 값을 변수에 담은 후 != null 확인 (근데 이거 안된다..?) */

		while(scanner.hasNextLine()) {
			String input = scanner.nextLine();
			sb.append(input).append("\n");
			if(input == null || input.equals("")) {
				break;
			}
		}
		
		System.out.println(sb.toString());
		scanner.close();
		
	}
}
