package ct.week01.programmers;

public class practice11 {
/*
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

	제한사항
	my_string은 소문자와 공백으로 이루어져 있습니다.
	1 ≤ my_string의 길이 ≤ 1,000
	입출력 예
	my_string	result
	"bus"	"bs"
	"nice to meet you"	"nc t mt y"
 */
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        
	        for(int i = 0; i < my_string.length(); i++) {
	            if(my_string.charAt(i) != 'a' &&
	              my_string.charAt(i) != 'e' &&
	               my_string.charAt(i) != 'i' &&
	               my_string.charAt(i) != 'o' &&
	               my_string.charAt(i) != 'u' ){
	                answer += my_string.charAt(i);
	            }
	        }
	        
	        //2
	        //answer = my_string.replaceAll("[aeiou]", "")
	        return answer;
	    }
	}
}
