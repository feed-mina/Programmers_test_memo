import java.util.Arrays;

public class 공백으로 구분하기 1 {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
 
    }
}


/**
 * 문제설명
단어가 <공백 한 개>로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는
 solution 함수를 작성해 주세요.


 * 제한사항
 * my_string은 영소문자와 공백으로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
my_string의 맨 앞과 맨 뒤에 글자는 공백이 아닙니다.

입출력 예
my_string	result
"i love you"	["i", "love", "you"]
"programmers"	["programmers"]
입출력 예 설명
입출력 예 #1

예제 1번의 my_string은 "i love you"로 공백 한 칸으로 나누어진 단어들은 앞에서부터
 순서대로 "i", "love", "you" 이므로 ["i", "love", "you"]를 return 합니다.
입출력 예 #2

예제 2번의 my_string은 "programmers"로 단어가 하나만 있습니다. 따라서 ["programmers"]를 return 합니다.
 */

 
/**
 * 다른사람 문제풀이1

 *import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList();

        String a = "";

        for(int i=0; i<=my_string.length();i++){
                if(my_string.charAt(i) == ' '){
                    answer.add(a);
                    a = "";
                }else if(i == my_string.length()-1){
                    a += Character.toString(my_string.charAt(my_string.length()-1));
                    answer.add(a); 
                    break;
                }else{
                    a += Character.toString(my_string.charAt(i));    
                }
          }




        return answer;
    }
}
 
 * 
 */
