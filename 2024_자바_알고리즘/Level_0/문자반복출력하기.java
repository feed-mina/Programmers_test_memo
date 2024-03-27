
import java.util.Arrays;
public class 문자반복출력하기 {
    
    public String solution(String my_string, int n) {
        String answer = "";
  String[] answerArr = {};
  String[] stringArr = my_string.split("");  
  
  for (int index = 0; index < my_string.length(); index++) {  
      for (int i = 1; i <= n; i++) { 
         
          answer += stringArr[index]; // 문자열을 반복하여 이어붙입니다.
      }
  }
  return answer;
}
}


/**
 * 문제설명 : 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
제한사항
2 ≤ my_string 길이 ≤ 5
2 ≤ n ≤ 10
"my_string"은 영어 대소문자로 이루어져 있습니다.

입출력 예
my_string	n	result
"hello"	3	"hhheeellllllooo"
입출력 예 설명
입출력 예 #1

"hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
 * 
 */

 /*

import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] answerArr = {};
        String[] stringArr = my_string.split(""); 
       //  stringArr = Arrays.toString(stringArr); 
       // Arrays.toString(stringArr)의 사용은 의도한 대로 작동하지 않습니다. 문자열 배열을 문자열로 변환하기 위해 반복문을 사용하거나 String.join() 메서드를 사용
        
        for(int index = 0; index < stringArr.length; index++){ // "for" 키워드 및 변수 초기화 추가
            for(int i = 1; i <= n; i++){ // "for" 키워드 및 변수 초기화 추가, "i"의 시작값을 1로 변경
               
                answer += stringArr[index].repeat(i); // 문자열을 반복하여 이어붙입니다.
            }
        }
        return answer;
    }
}

  */

  /*
   * 다른사람 문제풀이1
   * class Solution {
    public StringBuffer solution(String my_string, int n) {

        char[] arr = my_string.toCharArray();
        StringBuffer answer = new StringBuffer();
        // arr = [h,e,l,l,o]
        for(char k : arr){
            for(int i=0; i<n;i++){
                answer.append(k);
            }           
        }
        return answer;
    }
}
다른사람 문제풀이2
 
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
   */