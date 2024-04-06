class Solution {
    public String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }
}



/**
 * 문제설명: 알파벳으로 이루어진 문자열 myString이 주어집니다.
 *  모든 알파벳을 대문자로 변환하여 return 하는 
 * solution 함수를 완성해 주세요.
제한사항
1 ≤ myString의 길이 ≤ 100,000
myString은 알파벳으로 이루어진 문자열입니다.
입출력 예
myString	result
"aBcDeFg"	"ABCDEFG"
"AAA"	"AAA"
 * 
 */
/**
 * 다른사람 문제풀이 
 * class Solution {
    public String solution(String myString) {
        String answer = "";

        for(int i=0; i<myString.length(); i++){
            char str = myString.charAt(i);
            answer += Character.toUpperCase(str);
        }

        return answer;
    }
}
 * 
 */
