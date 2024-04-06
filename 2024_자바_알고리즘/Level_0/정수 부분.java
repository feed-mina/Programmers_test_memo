class Solution {
    public int solution(double flo) { 
          //    int answer = Math.floor(flo);
      
        // Math.floor()의 결과는 double 타입이다. 명시적으로 int 타입으로 변환 필요하다
        // 형변환을 하기 위해 double 결과를 int로 변환이 필요하다.
        int answer = (int) Math.floor(flo);
        return answer;
    }
}


 /*
  * 문제 설명
실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
제한사항
0 ≤ flo ≤ 100
입출력 예
flo	    result
1.42	    1
69.32	69
입출력 예 설명
입출력 예 #1

1.42의 정수 부분은 1입니다.
입출력 예 #2

69.32의 정수 부분은 69입니다.
  */
/*
 * 다른사람문제풀이1
 * class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}
 * 
 */
