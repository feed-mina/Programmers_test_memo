

import java.util.Arrays;
public class 원소들의곱과합 {
    class Solution {
        public int solution(int[] numList) {
            // 모든 원소의 곱을 계산합니다.
            int product = 1; // 곱셈의 초기값은 1입니다.
            for (int num : numList) {
                product *= num;
            }
    
            // 모든 원소의 합을 계산합니다.
            int sum = 0; // 합의 초기값은 0입니다.
            for (int num : numList) {
                sum += num;
            }
    
            // 합의 제곱을 계산합니다.
            int sumSquare = sum * sum;
    
            // 곱과 합의 제곱을 비교하여 조건에 맞는 값을 반환합니다.
            if (product < sumSquare) {
                return 1; // 모든 원소의 곱이 합의 제곱보다 작으면 1을 반환합니다.
            } else {
                return 0; // 그렇지 않으면 0을 반환합니다.
            }
        }
}

/**
 * 문제설명 : 정수가 담긴 리스트 num_list가 주어질 때, 
 * 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 
 * 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9

입출력 예
num_list	result
[3, 4, 5, 2, 1]	1
[5, 7, 8, 3]	0
입출력 예 설명
입출력 예 #1

모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.
입출력 예 #2

모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다.
 * 
 */

 /**
다른사람 문제풀이1
import java.util.Arrays;

class Solution {
    public int solution(int[] numList) {
        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
    }
}


다르사람 문제풀이2
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int temp = 1;
        int temp1 = 0;
        for(int i=0; i<num_list.length; i++){
            temp *= num_list[i];
            temp1 += num_list[i];
        }

        answer = temp1*temp1 > temp ? 1 : 0;
        return answer;
    }
}

  */