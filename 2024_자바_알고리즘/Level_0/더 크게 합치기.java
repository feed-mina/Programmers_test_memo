public class 더 크게 합치기 {
    public int solution(int a, int b) {
        String astring = Integer.toString(a);
        String bstring = Integer.toString(b);
        int answerString;
        String abString = String.valueOf(astring) + String.valueOf(bstring);
        String baString = String.valueOf(bstring) + String.valueOf(astring);
        int abnum = Integer.parseInt(abString);
        int banum = Integer.parseInt(baString);
       
        if(abnum > banum){
            answerString = abnum; // a가 큰 경우
            return answerString; 
        }else if(abnum < banum){
            answerString = banum; // b가 큰 경우
            return answerString; 
        }else{
            answerString = abnum; // 같을 경우
            return answerString; 
        }  
    }
}


/**
 * 문제설명
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 
 * 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 
더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 * 제한사항
 * 1 ≤ a, b < 10,000
 * 
 * 입출력 예
a	b	result
9	91	991
89	8	898
 * 입출력 예 설명
입출력 예 #1

a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 
둘 중 더 큰 값은 991 이므로 991을 return 합니다.
입출력 예 #2

a ⊕ b = 898 이고, b ⊕ a = 889 입니다.
 둘 중 더 큰 값은 898 이므로 898을 return 합니다. 

 */

 
/**
 * 다른사람 문제풀이1
 * class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // Java는 문자열 + 숫자에서 숫자를 문자열로 처리가 가능하다.
        // 인트->스트링 변환하는 경우 String.valueOf() 같은거 안 쓰고 그냥 숫자+"" 많이 씀
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }
}

다른사람 문제풀이2
class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strSum1 = strA + strB;
        String strSum2 = strB + strA;
        return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));
    }
}
 * 
 */
