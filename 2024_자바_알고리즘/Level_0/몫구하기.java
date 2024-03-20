/*
 *  문제설명 : 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
* 제한사항 : 
0 < num1 ≤ 100
0 < num2 ≤ 100
* 입출력 예시
입출력 예
num1	num2	result
10	5	2
7	2	3
 * 
 */

 /*
  * class Solution {
    public int solution(int num1, int num2) {
        int answer = Math.floor(num1 / num2); 
        return answer;
    }
}
** 오류 발생 incompatible types: possible lossy conversion from double to int
        int answer = Math.floor(num1 / num2);
  */

 class Solution {
    public int solution(int num1, int num2) {
     double result = num1 / num2;
    // int answer = (int) (result * 1000);
// double answer = result * 1000;

        return answer;
    }
}

// Math.floor() 함수의 반환값은 double 이다. 따라서 Dobule 값을 int 로 변환하는 것은 정보 손실이 발생할 수 있다. 
// 나눈 결과가 먼저 double 형태로 저장되고 그 후에 Math.floor() 함수를 사용하여 소수점 이하를 버린뒤 int로 변환한다. 