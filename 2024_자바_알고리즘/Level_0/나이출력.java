 /**
  * 문제설명 : 머쓱이는 선생님이 몇년 도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질때 선생님의 출생연도를 return 하는 solution함수를 완성해주세요.
  * 제한사항 
  0 < age <= 120
  나이는 태어난 연도에 1살이며 매년 1월 1일마다 1살씩 증가한다. 
  * 입출력 예시
  age	result
    40	1983
    23	2000
  */

  class Solution {
    public int solution(int age) {
        int answer = 2022 - age + 1 ;
        return answer;
    }
}

/**
 * 다른사람 문제풀이 > 심화
import java.time.*;
class Solution {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age + 1;
    }
}
 */