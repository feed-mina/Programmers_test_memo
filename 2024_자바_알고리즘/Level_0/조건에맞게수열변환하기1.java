// 정수 배열을 받아와서 각 원소에 대해 주어진 조건에 따라 연산을 수행 
  // 배열을 순회하면서 각 원소를 검사하고 조건에 맞게 연산을 수행
  // 새로운 배열에 결과를 저장하고 이를 반환한다.
public class 조건에맞게수열변환하기1 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for( int i = 0; i< arr.length; i++){
            //50이하이고 홀수이면 x2
            if(arr[i] < 50 && arr[i] % 2 != 0){
              answer[i] = arr[i] *2;
            }
            else if( 50 <= arr[i]  && arr[i] % 2 == 0){
                answer[i] = arr[i]/2;
            }else{
                answer[i] = arr[i];
            }
            
        }
        return answer;
    }
    
}
/**
 * 문제풀이1:정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 
 * 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
 *  그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
 * 
 * 
제한사항
1 ≤ arr의 길이 ≤ 1,000,000
1 ≤ arr의 원소의 값 ≤ 100
입출력 예
arr	                        result
[1, 2, 3, 100, 99, 98]	[2, 2, 6, 50, 99, 49]
출력 예 설명
입출력 예 #1

1, 3은 50 미만의 홀수 이므로 2를 곱하고, 100, 98은 50 이상의 짝수이므로 2로 나눕니다.
나머지 값들은 변경 조건에 해당하지 않으므로 바꾸지 않습니다.
따라서 [2, 2, 6, 50, 99, 49]를 return 합니다.
 */

 /*
  * 
다른사람문제풀이1
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(operand -> operand >= 50 && operand % 2 == 0 ? operand / 2 : operand < 50 && operand % 2 == 1 ? operand * 2 : operand).toArray();
    }
}
  */