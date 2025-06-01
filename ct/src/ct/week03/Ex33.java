package ct.week03;

import java.util.PriorityQueue;

/*
 * PriorityQueue
 */
public class Ex33 {
	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.offer(3);
		que.offer(5);
		que.offer(2);
		que.offer(1);
		que.offer(8);
		que.offer(4);
		System.out.println(que.toString());
	} 
}
