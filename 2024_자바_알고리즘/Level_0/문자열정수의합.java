import java.util.Arrays;
public class 문자열정수의합 {
    public int solution(String num_str) {
        int answer = 0;

        String[] num_strarr = num_str.split(""); // 문자열을 문자열 배열로 분할
        int[] num_intarray = new int[num_strarr.length];
        for(int i = 0; i < num_strarr.length; i++) {
            num_intarray[i] = Integer.parseInt(num_strarr[i]); 
            answer += num_intarray[i];
        }
        return answer;
    }
}


/**
 *  문제설명: 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 
 * 각 자리수의 합을 return하도록 solution 함수를 완성해주세요. 
 * 제한사항 : 3 ≤ num_str ≤ 100

 * 입출력예 : 입출력 예
num_str	result
"123456789"	45
"1000000"	1
입출력 예 설명
입출력 예 #1

문자열 안의 모든 숫자를 더하면 45가 됩니다.
입출력 예 #2

문자열 안의 모든 숫자를 더하면 1이 됩니다.

 */

 
/**
 *
 * 다른사람풀이1
 * // 모르시는분들 계실까봐 ASCII 코드에서 '0'은 48의 값을 갖고 있어서 빼는겁니다


 * class Solution {
    public int solution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();
    }
}
다른사람풀이2
import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        return Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
 */