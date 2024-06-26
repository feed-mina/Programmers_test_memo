public class 문자열 바꿔서 찾기 {
    public int solution(String myString, String pat) {
         
        StringBuilder answer = new StringBuilder(myString);   
        char[] afterChar = myString.toCharArray();
        for (int i = 0; i < afterChar.length; i++) {
            if(answer.charAt(i) == 'A'){  
                        answer.replace(i, i+1, "B");  
            }else if(answer.charAt(i) == 'B'){
                answer.replace(i,i+1,"A");
            }
        }
        if(String.valueOf(answer).contains(pat)){
              return  1;
        }else {
            return 0;
        }
          
}
}


/**
 * 문제설명
 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
 * myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 
 * pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 * 
 * 
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100
1 ≤ pat의 길이 ≤ 10
myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.

입출력 예
myString	pat	    result
"ABBAA"	    "AABB"	    1
"ABAB"	    "ABAB"	    0
입출력 예 설명
입출력 예 #1

"ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다. 
여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.
입출력 예 #2

"ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다. 
여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.
 public int solution(String myString, String pat) {
    for(int i = 0; i < myString.length; i++){
        if(myString[i] == 'A'){
          return  myString[i] == 'B'
        }else if(myString[i] == 'B'){
          return  myString[i] == 'A'
        }
    } 
    }
 */

 
/**
 * 다른사람 문제풀이1
 * class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}
 *
 * 다른사람 문제풀이2
 *  import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        return myString.contains(Stream.of(pat.split("")).map(str -> "A".equals(str)?"B":"A").collect(Collectors.joining()))?1:0;
    }
}

 */
