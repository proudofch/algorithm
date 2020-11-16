package BOJ_Level06;

class SelfNumber {
	
	// 재귀함수로 만들 수도 있다. -> 썬 코드
	/* 
		private static int[] d(int n, int[] array) {
	        int temp = n;
	        int[] arr = array;
	        int sum = n;
	
	        if(n >= 10000) return arr;
	
	        while(temp > 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }
	
	        if(sum <= 10000) arr[sum] = 1;
	
	        return d(sum, arr);
    	}
	*/
	
	void showSelfNumber() {

		boolean[] flag = new boolean[10001];
		
		for(int i=0; i<flag.length; i++) {
			int sum = i;
			String temp = String.valueOf(i);
			for(int j=0; j<temp.length(); j++) {
				sum += Integer.parseInt(temp.substring(j, j+1));
			}
			if(0 <= sum && sum <= 10000) {
				flag[sum] = true; //무한 수열로 만들어지는 숫자의 방을 true로 변경
			}
		}
		
		for(int i=1; i<flag.length; i++) {
			if(flag[i] == false) { //false는 무한 수열에 포함되지 않은 수, 즉 생성자가 없는 숫자이다.
				System.out.println(i);
			}
		}
	}
	
} // /.class SelfNumber


public class L02_04673 {
	public static void main(String[] args) {
		
		SelfNumber s = new SelfNumber();
		s.showSelfNumber();
		
	}
}