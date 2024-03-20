import java.util.Stack;
public class 배열뒤집기 {
    
    public int[] solution(int[] num_list) {
        Stack<Integer> stack = new Stack<>();
        
        // 배열의 요소를 스택에 추가
        for (int i : num_list) {
            stack.push(i);
        }
        
        // 스택에서 꺼낸 값들을 배열에 저장
        int[] answer = new int[num_list.length];
        // 이 배열의 크기는 원래 배열 num_list의 길이와 동일하다. 
        // 이렇게 스택에서 꺼낸 값들을 저장할 공간을 마련한다.
        int index = 0;
        while (!stack.isEmpty()) {
            // 스택이 비어있을때까지 계속해서 값을 꺼내어 배열에 저장한다.
            answer[index++] = stack.pop();
            // stack.pop()은 스택에서 값을 꺼내고 해당 값을 반환, 이 값을 배열 'answer'에 저장 후
            // index를 1증가시킨다. 이렇게 하면 다음 값이 저장될 위치를 결정한다.
        }
        
        return answer;
    }
}
/**
 * 문제설명 : 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 * 제한사항
1 ≤ num_list의 길이 ≤ 1,000
0 ≤ num_list의 원소 ≤ 1,000
입출력 예
num_list	            result
[1, 2, 3, 4, 5]	        [5, 4, 3, 2, 1]
[1, 1, 1, 1, 1, 2]        [2, 1, 1, 1, 1, 1]
[1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
입출력 예 설명
입출력 예 #1

num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을
 return합니다.
입출력 예 #2

num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열
 [2, 1, 1, 1, 1, 1]을 return합니다.
입출력 예 #3

num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 
[5, 3, 1, 1, 1, 0, 1]을 return합니다.
 

num_list.pop()
num_list.length 만큼 for문을 돌아서 배열에 더한다.
 
 
다른사람이 푼 풀이1
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

다른사람이 푼 풀이2
import java.util.stream.LongStream;

class Solution {
    public int[] solution(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    }
}
*/