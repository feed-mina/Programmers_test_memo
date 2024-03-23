public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++){
            int number  = num_list[i];
            if(number % 2 == 0 ){
                even++; 
            }else {
                odd++; 
            } 
        }
        answer[0] = even;
        answer[1] = odd; 
        
        return answer;
    }
}


/**
 * 문제설명 : 정수가 담긴 리스트 num_list가 주어질 때, 
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 
 * solution 함수를 완성해보세요.
제한사항
1 ≤ num_list의 길이 ≤ 100
0 ≤ num_list의 원소 ≤ 1,000
입출력 예
num_list	result
[1, 2, 3, 4, 5]	[2, 3]
[1, 3, 5, 7]	[0, 4]
입출력 예 설명
입출력 예 #1

[1, 2, 3, 4, 5]에는 짝수가 2, 4로 두 개, 홀수가 1, 3, 5로 세 개 있습니다.
입출력 예 #2

[1, 3, 5, 7]에는 짝수가 없고 홀수가 네 개 있습니다.
 * 
 */
/*
다른사람 문제풀이1
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}


다른사람 문제풀이2
import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
}

 */