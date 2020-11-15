package BOJ_Level06;

class Test {
	
	long sum(int[] a) { 
		long sum = 0;
		for(long l : a) {
			sum += l;
		}
		return sum;
	}
	
}

public class L01_15596 {
	public static void main(String[] args) {
		
		Test test = new Test();
		int[] a = {1,2,3,4};
		System.out.println(test.sum(a));
		
	}
}
