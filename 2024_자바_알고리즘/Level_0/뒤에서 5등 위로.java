public class 뒤에서 5
등 위로
{
    
}

/**
 * 문제설명
 * 정수로 이루어진 리스트 num_list가 주어집니다.
 * num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 
 * 6 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 100
 * 
 * 입출력 예
 * num_list result
 * [12, 4, 15, 46, 38, 1, 14, 56, 32, 10] [15, 32, 38, 46, 56]
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 
 * [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]를 정렬하면 [1, 4, 10, 12, 14, 15, 32, 38,
 * 46, 56]이 되고,
 * 앞에서 부터 6번째 이후의 수들을 고르면 [15, 32, 38, 46, 56]가 됩니다.
import java.util.Arrays;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 입력 배열을 복사하여 정렬
        int[] sorted = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(sorted);

        // 상위 5개 원소만을 포함하는 배열 생성
        int[] upperFive = Arrays.copyOfRange(sorted, sorted.length - 5, sorted.length);

        // 원본 배열에서 상위 5개 원소를 제외한 배열 생성
        int[] answer = new int[num_list.length - 5];
        int answerIndex = 0;
        for (int num : num_list) {
            if (Arrays.binarySearch(upperFive, num) < 0) {
                answer[answerIndex++] = num;
            }
        }
        
        return answer;
    }
}


 */

/**
 * 다른사람 문제풀이1
 * import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return Arrays.stream(numList).sorted().skip(5).toArray();
    }
}

다른사람 문제풀이2
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for(int i = 5 ; i < num_list.length ; i++) {
            answer[i-5] = num_list[i];
        }
        return answer;
    }
}
 * 
 */
