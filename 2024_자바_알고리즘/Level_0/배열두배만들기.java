import java.util.*;
class Solution {
  public int[] solution(int[] numbers) {
    //     return (int) Arrays.stream(numbers * 2) 
    // Arrays.Stream() 메서드의 인자로 배열을 전달하는것이 아니라 배열의 요소들을 전달해야 한다. 또한 Arrays.stream() 의 반환타입은 Instream이므로 이를 다시 배열로 변환하여 사용해야 한다.
    // numbers * 2 와 같은 표현은 배열을 2배로 늘리는것. 
      return Arrays.stream(numbers)
                   .map(num -> num * 2) // map()을 사용하여 각 요소를 2배로 만든다.
                   .toArray(); // 스트림을 배열로 변환한다.
  }
}


/*
 * 문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
1 ≤ numbers의 길이 ≤ 1,000
입출력 예
numbers	result
[1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
[1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]


입출력 예 설명
입출력 예 #1

[1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
입출력 예 #2

[1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.
 */

 /*
  * 
  
  import java.util.*;
    public int[] solution(int[] numbers) {
    }

  */