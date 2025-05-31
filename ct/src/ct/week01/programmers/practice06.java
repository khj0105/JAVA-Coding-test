package ct.week01.programmers;

public class practice06 {
/*
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

	제한사항
	0 < n ≤ 1000
	
	입출력 예
	n	result
	10	30
	4	6
 */
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        //1
	        for(int i = 1; i <= n; i++) {
	            if(1 % 2 == 0) answer += i;
	        }
	        
	        //2            
	        for(int i = 0; i <= n; i += 2){
	            answer += i;
	        }
	            
	        return answer;
	    }
	}
}
