public class my_string {
    
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder(rny_string);
        char[] charArray = rny_string.toCharArray();
        
        for(int i = 0; i<answer.length(); i++){
                    if(answer.charAt(i) == 'm'){ // 현재 문자가 'm'인 경우
                        answer.replace(i, i + 1, "rn"); // "m"을 "rn"으로 대체
                    }
        }
           
                return  answer.toString();
            }
}


/*
 * 문제설명  'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다 
 * 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
1 ≤ rny_string의 길이 ≤ 100
rny_string은 영소문자로만 이루어져 있습니다.
입출력 예
rny_string	        result
"masterpiece"	"rnasterpiece"
"programmers"	"prograrnrners"
"jerry"	            "jerry"
"burn"	            "burn"

 
 */

 /*
  * 다른사람 문제풀이1
class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
} 
  * 다른사람 문제풀이2 
class Solution {
    public String solution(String rny_string) {
        // m -> rn

        String answer = "";

        for(int i = 0; i < rny_string.length(); i ++){
            char current = rny_string.charAt(i);

            if(current == 'm'){
                answer += "rn";
            }
            else{
                answer += current;
            }

        }

        return answer;
    }
}


  */