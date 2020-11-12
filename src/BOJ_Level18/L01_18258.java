package BOJ_Level18;

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
		//StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		//Queue<Integer> queue = new LinkedList<Integer>();
		Deque<Integer> deq = new LinkedList<Integer>();
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		//예전엔 7%에서 시간 초과났는데
		//push 안쪽으로 asking을 split하니 14%까지 늘긴 했따.
		//근데 계속 시간 초과여 시벌탱
		
		for(int i=1; i<=n; i++) {
			
			//String asking = st.nextToken();
			String asking = br.readLine();
			int answer = 0;
			
			if(asking.contains("push")) {
				//st = new StringTokenizer(br.readLine(), " ");
				deq.add(Integer.parseInt(asking.split(" ")[1]));
				continue;
			} else if(asking.contentEquals("pop")) {
				answer = (deq.isEmpty()) ? -1 : deq.poll();
			} else if(asking.contentEquals("size")) {
				answer = deq.size();
			} else if(asking.contentEquals("empty")) {
				answer = (deq.isEmpty()) ? 1 : 0;
			} else if(asking.contentEquals("front")) {
				answer = (deq.isEmpty()) ? -1 : deq.peekFirst();
			} else if(asking.contentEquals("back")) {
				answer = (deq.isEmpty()) ? -1 : deq.peekLast();
			} 
			
			sb.append(answer);
			System.out.println(sb.toString());

			if(sb.length() != 0) {
				sb.setLength(0);
			}
			
			//bw.write(answer+"\n");
			//bw.flush();
			
			/*
			switch (asking) {
			
				case "push" :
					st = new StringTokenizer(br.readLine(), " ");
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
			 */
		} //.for
		
		//bw.close();
		
		br.close();
		
		
	}
}
