import java.util.*;
class 순서 바꾸기 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        
        for(int i = n; i <num_list.length; i++){
            answer[index++] = num_list[i];
        } 
        // num_list의 처음부터 인덱스 n-1 까지 이어붙이는 부분 
        for(int i = 0; i <n; i++){
            // 끝까지 진행된 index 변수에 계속해서 더해가면서 answer 배열에 이어붙인다
            
            answer[index++] = num_list[i];
        }
        return answer;
    }
    
}


/**
 * 문제설명
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
 *  n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.


 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이

입출력 예
num_list	n	    result
[2, 1, 6]	    1	    [1, 6, 2]
[5, 2, 1, 7, 5]	3	[7, 5, 5, 2, 1]
입출력 예 설명
입출력 예 #1

[2, 1, 6]에서 첫 번째 이후의 원소는 [1, 6]이고 첫 번째까지의 원소는 [2]입니다. 
두 리스트를 이어 붙이면 [1, 6, 2]가 됩니다.
입출력 예 #2

[5, 2, 1, 7, 5]에서 세 번째 이후의 원소는 [7, 5]이고 세 번째까지의 원소는 [5, 2, 1]입니다. 
두 리스트를 이어 붙이면 [7, 5, 5, 2, 1]가 됩니다.
 */

 
/**
 * 다른사람 문제풀이1
 * import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length) // 0부터 num_list.length-1까지의 정수 스트림 생성
        .map(i -> num_list[(i + n) % num_list.length]) // 배열의 각 요소를 (i + n) % num_list.length 인덱스에 매핑
        .toArray(); // 결과를 배열로 반환
    }
}
 * 다른사람 문제풀이2
 * class 순서_바꾸기 {
    public int[] solution(int[] num_list, int n) {
        // num_list의 인덱스 n부터 끝까지를 answer에 복사
        int[] part1 = Arrays.copyOfRange(num_list, n, num_list.length);
        
        // num_list의 처음부터 n-1까지를 answer에 복사
        int[] part2 = Arrays.copyOfRange(num_list, 0, n);
        
        // 두 배열을 합치기
        int[] answer = new int[part1.length + part2.length];
        System.arraycopy(part1, 0, answer, 0, part1.length);
        System.arraycopy(part2, 0, answer, part1.length, part2.length);
        
        return answer;
    }
}
 */
