public class 배열의 길이에 따라 다른 연산하기 {
    
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        return answer;
    }
}


/**
 * 문제설명
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
 * 
 * 제한사항
 1 ≤ arr의 길이 ≤ 1,000
1 ≤ arr의 원소 ≤ 1,000
1 ≤ n ≤ 1,000

입출력 예
arr	                    n       result
[49, 12, 100, 276, 33]	27	[76, 12, 127, 276, 60]
[444, 555, 666, 777]	100	[444, 655, 666, 877]
입출력 예 설명
입출력 예 #1

예제 1번의 arr의 길이는 5로 홀수입니다. 따라서 arr의 짝수 인덱스 0, 2, 4에 주어진 n 값인 27을 더하면 
[76, 12, 127, 276, 60]이 됩니다. 따라서 [76, 12, 127, 276, 60]를 return 합니다.
입출력 예 #1

예제 2번의 arr의 길이는 4로 짝수입니다. 따라서 arr의 홀수 인덱스 1, 3에 주어진 n 값인 100을 더하면 
[444, 655, 666, 877]이 됩니다. 따라서 [444, 655, 666, 877]를 return 합니다.
class Solution {
    public int[] solution(int[] arr, int n) {
        int size = arr.length;
        int[] answer = new int[size]; // 정답 배열을 입력 배열과 같은 크기로 초기화
        
        for (int i = 0; i < size; i++) {
           if(size % 2 == 1){
                if (i % 2 == 0) {
                answer[i] = arr[i] + n; // 짝수 길이일 때 각 요소에 n을 더하여 정답 배열에 저장
            } else {
                answer[i] = arr[i]; // 홀수 길이일 때 각 요소에 n을 빼서 정답 배열에 저장
            }
           }else{
               if (i % 2 == 0) {
                answer[i] = arr[i] ; // 짝수 길이일 때 각 요소에 n을 더하여 정답 배열에 저장
            } else {
                answer[i] = arr[i]+ n; // 홀수 길이일 때 각 요소에 n을 빼서 정답 배열에 저장
            } 
           }
        }
        
        return answer; // 반복문 완료 후 정답 배열 반환
    }
}

 
 */

 
/**
 * 다른사람 문제풀이1
 * class Solution {
    public int[] solution(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }
}
 * 
 * 다른사람 문제풀이2
 * import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0)).toArray();
    }
}

 */
