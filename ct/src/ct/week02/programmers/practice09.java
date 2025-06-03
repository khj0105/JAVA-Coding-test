package ct.week02.programmers;

public class practice09 {
	/*
	 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

	제한사항
	1 ≤ balls ≤ 30
	1 ≤ share ≤ 30
	구슬을 고르는 순서는 고려하지 않습니다.
	share ≤ balls
	
	입출력 예
	balls	share	result
	3	2	3
	5	3	10
	 */
	class Solution {
	    public int solution(int balls, int share) {
	        //int answer = 0;
	        //return (int) a;
	        int answer = 0;
	        double a = 1;
	        int k = 1;
	        for(int i = share + 1; i <= balls; i++) {
	            a *= i;
	            a /= k++;
	        } 
	        
	        // a /= (balls - share);        
	        
	        if(share >= balls) return 1;
	        return (int) Math.round(fac(balls) / (fac(balls-share) * fac(share)));
	    }
	    
	    // 재귀 함수
	    public double  fac(int n){
	        if(n == 1) return 1;
	        return n * fac(n - 1);
	    }
	}
}
