public class 길이에 따른 연산 {
    public int solution(int[] num_list) {
        int answer = 0;
        int count = num_list.length;
        if( count <= 10){
            answer = 1; // 곱셈에 대해 1부터 시작합니다.
            for(int i = 0; i < count; i++){
                answer *= num_list[i];
            }
        }else if(count >= 11){
            answer = 0; // 덧셈에 대해 0부터 시작합니다
            for(int i = 0; i < count; i++){
                // 곱셈 연산을 수정했습니다.
                answer += num_list[i];
            }
        }
        return answer;
    }
}
/*
 * 문제 설명
정수가 담긴 리스트 num_list가 주어질 때, 
리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 
10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요. 
제한사항
2 ≤ num_list의 길이 ≤ 20
1 ≤ num_list의 원소 ≤ 9
num_list의 원소를 모두 곱했을 때 2,147,483,647를 넘는 입력은 주어지지 않습니다.

입출력 예
num_list	                                result
[3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	        51
[2, 3, 4, 5]	                                120
입출력 예 설명
입출력 예 #1

리스트의 길이가 13이므로 모든 원소의 합인 51을 return합니다.
입출력 예 #2

리스트의 길이가 4이므로 모든 원소의 곱인 120을 return합니다.
*/

 /*
  * 다른사람풀이1
 class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer *= num_list[i];
            }else{
                answer += num_list[i];
            }

        }

        return answer;
    }
}

다른사람문제풀이2
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        IntStream stream = IntStream.of(num_list);
        return num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b);
    }
}

  */