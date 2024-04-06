import java.util.ArrayList;
import java.util.List; 
class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        if (end_num  <= start_num) {
          //  for (int i = end_num; i <= start_num; i++) {
               for (int i = start_num; i >= end_num; i--) {
                answer.add(i);
            }
        }  
        
        // 리스트를 배열로 변환
        int[] arrResult = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            arrResult[i] = answer.get(i);
        }
        
        return arrResult;
    }
}

/*
문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서
 end_num까지 1씩 감소하는 수들을 차례로 담은 
 리스트를 return하도록 solution 함수를 완성해주세요.
 * 제한사항
0 ≤ end_num ≤ start_num ≤ 50
입출력 예
start_num	end_num	        result
10	            3       [10, 9, 8, 7, 6, 5, 4, 3]
입출력 예 설명
입출력 예 #1

10부터 3까지 1씩 감소하는 수를 담은 리스트는 
[10, 9, 8, 7, 6, 5, 4, 3]입니다.
 */


 /*
다른사람문제풀이1
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
}
다른사람문제풀이2
import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(end, start).boxed().collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
}

  */