package ct.week02.programmers;

public class practice03 {
	/*
	 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

	제한사항
	0 ≤ numbers의 원소 ≤ 1,000
	1 ≤ numbers의 길이 ≤ 100
	정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
	
	입출력 예
	numbers	result
	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	5.5
	[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
	 */
	class Solution {
	    public double solution(int[] numbers) {
	        double answer = 0;
	        
	        double sum = 0;
	        
	        for(int n : numbers){
	            sum += n; // sum = sum + n;
	        }
	        
	        return sum / numbers.length;
	    }
	}
}
