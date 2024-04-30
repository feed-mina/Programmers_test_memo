import java.util.Arrays;

public class 공백으로 구분하기 2 {
    public String[] solution(String my_string) {
        // my_string.split(" "); -> ["i","","","","love","","you"]
        // 공백 하나하나 마다 기준으로 나눠지기 때문에 이와같이 나온다.
      //정규 표현식을 사용해 공백 한 칸 제거
        //String[] arStr = "eoeo eoeo".split("\\s");

        //정규 표현식을 사용해 가변적인 공백을 제거
        // String[] arStr = "aeoeo      eoeo".split("\\s+"); 
        return my_string.trim().split("\\s+");
 
    }
}


/**
 * 문제설명
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을
 *  return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * my_string은 영소문자와 공백으로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
my_string에는 단어가 하나 이상 존재합니다.

입출력 예
my_string	result
" i    love  you"	["i", "love", "you"]
"    programmers  "	["programmers"]
입출력 예 설명
입출력 예 #1

예제 1번의 my_string은 " i    love  you"로 공백을 기준으로 단어를 나누면 
"i", "love", "you" 3개의 단어가 있습니다.
 따라서 ["i", "love", "you"]를 return 합니다.
입출력 예 #2

예제 2번의 my_string은 "    programmers  "로 단어는 "programmers" 하나만 있습니다.
 따라서 ["programmers"]를 return 합니다.
 */

 
/**
 * 다른사람 문제풀이1

 * class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("[ ]+");
    }
}

 * 다른사람 문제풀이2
 import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[n] = st.nextToken();
        return result;
    }
}
 * 
 */
