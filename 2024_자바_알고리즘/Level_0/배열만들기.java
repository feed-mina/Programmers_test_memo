
import java.util.ArrayList;
import java.util.List;

public class 배열만들기 {
    public static int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();

        for(int i = k; i<=n; i+= k){
            answer.add(i);
        }
        // 리스트를 배열로 변환
        int[] arrResult = new int[answer.size()];
        for(int i=0; i < answer.size(); i++){
            arrResult[i] = answer.get(i);
        }
            return arrResult;
    }
}


/*
 * 문제 설명
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 
k의 배수를 오름차순으로 저장한 배열을 return 하는
 solution 함수를 완성해 주세요.
 *제한사항
1 ≤ n ≤ 1,000,000
1 ≤ k ≤ min(1,000, n)
 *  입출력 예
n	k	result
10	3	[3, 6, 9]
15	5	[5, 10, 15]
입출력 예 설명
입출력 예 #1

1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.
입출력 예 #2

1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다.
 */
/*
 * 1부터 n까지의 숫자 중에서 k의 배수를 찾습니다.
 각 배수를 배열에 저장합니다.
 배열을 반환합니다.
 주어진 조건에 따라 정수 n과 k를 처리하고, k의 배수를 저장한 후 반환한다. 처음부터 n까지 반복하면서 k의 배수인 순서를 찾아 리스트에 저장하고 이후에 리스트를 배열로 변환하여 반환한다.
 */
 /* 

문제풀이방법1
class Solution {
    public int[] solution(int n, int k) {
        int count = n / k;


        int[] answer = new int[count];

        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
}

  */