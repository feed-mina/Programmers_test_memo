public class 배열의 원소만큼 추가하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = new int[sum];
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
/**
 * arr은 2차원 배열이고 answer은 1차원 배열이다. 
 * answer배열에는 arr배열의 요소를 순차적으로 저장한 결과가 담긴다.
 * 이중 반복문을 보면, 외부 반복문에서는 arr배열의 행을 순회하고 내부 반복문에서는 
 * 각행의 열을 순회한다. 내부 반복문에서는 현재 행의 값에 따라 해당 값을 몇 번 반복해서
 * 저장할지 결정한다.
 * 
 * 여기서 idx변수는 answer변수의 인덱스를 가리키며 초기값은 0이다. 
 * 내부반복문에서 answer[idx++]은 answer배열의 idx위치에 값을 저장한 후
 * idx 값을 1 증가시킨다. 이를 통해 요소를 수차적으로 저장할 수 있다.
 * 
 * 따라서 외부 반복문과 내부 반복문을 모두 실행하면서 arr배열의 요소를 
 * 순차적으로 탐색하고 각 요소의 값 만큼 해당 값을 answer배열에 저장하게 된다.
 * 
 * 2차원 배열이 주어졌을때 :
 * int[][] arr = {{1, 2, 3}, {4, 5}};
answer = {1, 2, 2, 3, 4, 4, 4, 4, 5}
이때 idx 변수는 answer 배열의 길이와 같거나 큰 값이 됩니다.  
 */
 
/**
 * 문제설명
 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
 * 양의 정수 배열 arr가 매개변수로 주어질 때, 
 * arr의 앞에서부터 차례대로 원소를 보면서 
 * 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 
 * 반복한 뒤의 배열 X를 return 하는 
 * solution 함수를 작성해 주세요.


 * 제한사항
 * 1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소 ≤ 100

입출력 예
arr	            result
[5, 1, 4]	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
[6, 6]	    [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
[1]	        [1]

입출력 예 설명
입출력 예 #1

예제 1번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.

a	X
[]
5	[5, 5, 5, 5, 5]
1	[5, 5, 5, 5, 5, 1]
4	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
따라서 [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]를 return 합니다.

입출력 예 #2

예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.

a	    X
[]
6	    [6, 6, 6, 6, 6, 6]
6	    [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
따라서 [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]를 return 합니다.

입출력 예 #3

예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.

a	X
[]
1	[1]
따라서 [1]을 return 합니다.
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int size = arr.length; 
        for(int i = 0; i<size; i++){
         int price = arr[i];
            
        }
        return answer;
    }
}

 */

 
/**
 * 다른사람 문제풀이1
 * class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];    
        }

        answer = new int[sum];

        int idx = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}

 * 다른사람 문제풀이2
 * import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] arr) {
        return Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
    }
}
 */
