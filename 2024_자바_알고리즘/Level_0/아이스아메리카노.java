public class 아이스아메리카노 { 
        public int[] solution(int money) {
            int[] answer = new int[2]; // 배열의 크기를 2로 지정하여 초기화
            double max = Math.ceil(money / 5500.0);
            int remain = money;
            for (int n = 0; n < max; n++) {
                if (remain >= 5500) {
                    remain -= 5500;
                    answer[0]++; // 배열의 첫 번째 요소에 1 증가
                }
            }
            answer[1] = remain; // 배열의 두 번째 요소에 남은 값 할당
    
            return answer;
        } 
    
}


/*
 * 문제설명 : 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
 *  남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < money ≤ 1,000,000
입출력 예
money	result
5,500	[1, 0]
15,000	[2, 4000]
입출력 예 설명
입출력 예 #1

5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
입출력 예 #2

15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.
 * 
 */

 /*
  * 다른사람 문제풀이
  
3
4
5
6
class Solution {
    public int[] solution(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}
  */