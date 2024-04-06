public class n개간격의원소들 {
    public int[] solution(int[] num_list, int n) {
        // num_list에서 n 간격으로 요소를 선택하기 때문에 배열의 크기 조정
        int count = (num_list.length + n - 1) / n; // 올림 처리
        int[] answer = new int[count];

        // n 간격으로 요소를 선택
        for(int i = 0, j = 0; i < count; i++, j += n){
            answer[i] = num_list[j]; 
        }
        return answer;
    }
}


/** 
 * 문제 설명 정수 리스트 num_list와 정수 n이 주어질 때, 
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 
 * 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 
 * solution 함수를 완성해주세요.
 * 
 * 제한사항
5 ≤ num_list의 길이 ≤ 20
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ 4
입출력 예 설명
입출력 예 #1

[4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
입출력 예 #2

[4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.

*/


/*
 * 다른사람문제풀이1
 * class Solution {
    public int[] solution(int[] num_list, int n) {
        Double length = Math.ceil(num_list.length/(n*1.0));
        int[] answer = new int[length.intValue()];

        for(int idx=0; idx<length; idx++) {
            answer[idx] = num_list[idx*n];
        }

        return answer;
    }
}
 * 
 */
