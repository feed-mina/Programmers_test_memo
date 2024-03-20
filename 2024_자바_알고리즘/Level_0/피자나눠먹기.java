public class 피자나눠먹기 { 
    public int solution(int slice, int n) {
        // 피자 판 수 계산
        int pizzas = n / slice;
        
        // 나머지가 있는 경우 한 판을 더 주문
        if (n % slice != 0) {
            pizzas++;
        }
        
        return pizzas; 
    }
}

/**
 * 문제설명 : 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

제한사항
2 ≤ slice ≤ 10
1 ≤ n ≤ 100

입출력 예
slice	n	result
7	    10	    2
4	    12	    3

입출력 예 설명
입출력 예 #1

10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
입출력 예 #2

12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.

 * 
 */


 /**
  *
  사람이 있다. 피자가 있다. 조각이 있다. 
  전체 조각은 피자 판수 * 조각 수 이다. slice * answer
  전체 조각은 사람 수보다 커야 한다. n
  그리고 나머지는 조각 수 보다 작아야 한다. 
  나머지는 전체조각 - 사람 수 이다. slice * answer - n 그리고
나머지는 0보다 크다.
  0 < slice * answer - n < slice
  이 때 피자 판 수를 구해야 한다. 
answer값을 한개씩 키워서 0보다 큰 값을 구해야 하고
answer 값이 한개씩 커지다가 나머지가 slice보다 작아야 한다. 

다른 사람이 푼 문제풀이1
class Solution {
    public int solution(int slice, int n) {
        int count=1;
        int temp=slice;
        while(true){
            if(temp>=n){
                return count;
            }
            temp+=slice;
            ++count;
        }
    }
}    
다른사람이 푼 문제풀이2 
class Solution {
    public int solution(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
*/
