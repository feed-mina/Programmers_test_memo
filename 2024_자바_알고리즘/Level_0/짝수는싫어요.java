import java.util.*;
public class 짝수는싫어요 {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
          if(i%2 != 0) {
              answer.add(i);
          } 
        }

        return answer;
    }
}

/**
 * 문제설명 : 정수 n이 매개변수로 주어질 때, 
 * n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
1 ≤ n ≤ 100
  
입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]


입출력 예 설명
입출력 #1

10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
입출력 #1

15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다. * 
 */

 /*
다른사람 문제풀이1
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}


다른사람 문제풀이2
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
  */