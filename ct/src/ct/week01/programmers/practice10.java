package ct.week01.programmers;

public class practice10 {
/*
 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

	제한사항
	1 ≤ my_string의 길이 ≤ 1,000
	입출력 예
	my_string	return
	"jaron"	"noraj"
	"bread"	"daerb"
 */
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        //1 정방향
	        for(int i = 0; i < my_string.length(); i++){
	            answer += my_string.charAt(my_string.length()-1 - i);
	        }
	        //2 역방향
	        //for(int i = my_string.length()-1; i >= 0; i--) {
	           // answer += my_string.charAt(i);
	        //}
	        return answer;
	    }
	}
}
