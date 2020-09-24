package Backjoon_Level18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class L01_18258 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		//Queue<Integer> queue = new LinkedList<Integer>();
		Deque<Integer> deq = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			String asking = st.nextToken();
			//int answer = 0;
			
			switch (asking) {
			
				case "push" :
					deq.add(Integer.parseInt(st.nextToken()));
					continue;
					
				case "pop" :
					//answer = (deq.isEmpty()) ? -1 : deq.poll();
					bw.write(deq.isEmpty() ? "-1"+"\n" : deq.poll()+"\n");
					break;
					
				case "size" :
					//answer = deq.size();
					bw.write(deq.size()+"\n");
					break;
					
				case "empty" :
					//answer = (deq.isEmpty()) ? 1 : 0;
					bw.write(deq.isEmpty() ? "1"+"\n" : "0"+"\n");
					break;
					
				case "front" :
					//answer = (deq.isEmpty()) ? -1 : deq.peekFirst();
					bw.write(deq.isEmpty() ? "-1"+"\n" : deq.peekFirst()+"\n");
					break;
					
				case "back" :
					//answer = (deq.isEmpty()) ? -1 : deq.peekLast();
					bw.write(deq.isEmpty() ? "-1"+"\n" : deq.peekLast()+"\n");
					break;

				default:
					break;
			}
			//bw.write(answer+"\n");
			bw.flush();
		}
		
		bw.close();
		br.close();
		
		
	}
}
