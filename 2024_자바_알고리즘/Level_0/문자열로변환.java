public class 문자열로변환 {
  
    public String solution(int n) {
        String answer = String.valueOf(n);
        return answer;
    }
}


/*
 * 문제설명 : 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
제한사항
1 ≤ n ≤ 10000
입출력 예
n	    result
123	    "123"
2573	"2573"
 * 입출력 예 설명
입출력 예 #1

123을 문자열로 변환한 "123"을 return합니다.
입출력 예 #2

2573을 문자열로 변환한 "2573"을 return합니다.
 */


 /*
  *다른사람문제풀이1
   class Solution {
    public String solution(int n) {
        String answer = ""+n;
        return answer;
    }
}



  */