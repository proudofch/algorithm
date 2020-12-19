package BOJ_Group_Basic01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17450 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float[] gaSeongBi = new float[3];
		
		StringTokenizer st;
		
		for(int i=0; i<gaSeongBi.length; i++) {

			st = new StringTokenizer(br.readLine());
			
			float price = Float.parseFloat(st.nextToken());
			float weight = Float.parseFloat(st.nextToken());
			float newPrice = price*10;
			
			if(price*10 >= 5000) {
				newPrice = (price*10)-500;
			}
			
			System.out.println(weight*10 + "/" + newPrice);
			
			gaSeongBi[i] = (weight*10) / newPrice;
		
		}
		
		for(float f : gaSeongBi) {
			System.out.println(f);
		}
		
		
		if(gaSeongBi[0] > gaSeongBi[1]) {
			if(gaSeongBi[0] > gaSeongBi[2]) {
				System.out.println("S");
			} else {
				System.out.println("U");
			}
		} else {
			System.out.println("N");
		}
		
		
		br.close();
		
	}
}
