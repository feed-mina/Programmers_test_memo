public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
  
  for(int i = 0; i < array.length; i++){
    if(array[i] > height){
        answer ++;
    }    
  }
  
        return answer;
    }
}


/**
 * 문제설명
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 
 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
제한사항
1 ≤ array의 길이 ≤ 100
1 ≤ height ≤ 200
1 ≤ array의 원소 ≤ 200
입출력 예
array	                height	result
[149, 180, 192, 170]	167	        3
[180, 120, 140]	        190         0

입출력 예 설명
입출력 예 #1

149, 180, 192, 170 중 머쓱이보다 키가 큰 사람은 180, 192, 170으로 세 명입니다.
입출력 예 #2

180, 120, 140 중 190보다 큰 수는 없으므로 0명입니다.
 */

 /**
  * 
  array를 전부 돌아야 한다. array.length 를 받는다. 
  array길이를 전부 돌면서 array[i]가 height 보다 크면 count ++ 해준다. 
  없다면 result = 0 으로 나온다.
  


  */
/*
 * 다른사람이 쓴 풀이
 * class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i: array){
            answer += (i>height) ? 1 : 0;
        }
        return answer;
    }
}
 */


