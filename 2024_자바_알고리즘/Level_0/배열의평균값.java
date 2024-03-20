public class 배열의평균값 {
    
}


/**
 * 문제설명 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 * 제한사항 : 
 * 0 ≤ numbers의 원소 ≤ 1,000
    1 ≤ numbers의 길이 ≤ 100
    정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

    numbers	                                    result
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	                5.5
[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0

입출력 예 설명
입출력 예 #1

numbers의 원소들의 평균 값은 5.5입니다.
입출력 예 #2

numbers의 원소들의 평균 값은 94.0입니다.
 */

 class Solution {
    public double solution(int[] numbers) {
        double answer = 0;  
        int sum = 0;
        for (int i= 0; i < numbers.length; i++){
            System.out.println(i);
           sum += numbers[i];
        }
      //  answer = sum /numbers.length; // 만약 이럴때 첫번째 케이스는 5.5가 아니라 5가 나온다. 따라서 
        answer =  (double)sum /numbers.length;
        return answer;
    }
}

/**
 *
 * 다른 사람이 푼 풀이 
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
        // .orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려줌
    }
}

 */