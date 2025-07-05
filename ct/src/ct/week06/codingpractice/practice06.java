package ct.week06.codingpractice;
/*
 * 문자열 내림차순으로 배치하기

문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.

입출력 예
s	return
"Zbcdefg"	"gfedcbZ"
 */
import java.util.*;
public class practice06 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        String[] str = s.split("");
	        //1
	        Arrays.sort(str); // 오름차순
	        for(int i = str.length-1; i >= 0; i--) {
	            answer+= str[i];
	        }
	        
	        //2
	        // Arrays.sort(arr, Collections.reverseOrder());
	        // answer = String.join("", arr);
	        return answer;
	    }
	}
}
