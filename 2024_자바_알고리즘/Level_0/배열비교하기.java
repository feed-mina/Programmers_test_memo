public class 배열비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = 0; // 배열 arr1의 합을 저장할 변수
        int b = 0; // 배열 arr2의 합을 저장할 변수
        
        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr2.length > arr1.length){
            answer = -1;
        } else if(arr1.length == arr2.length){
            // 배열의 길이가 같다면 배열의 합을 기준으로 배열의 더 큰 합을 구한다.
            for(int i = 0; i < arr1.length; i++){
                a += arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                b += arr2[i];
            }
            if(a > b){
                answer = 1;
            } else if(b > a){
                answer = -1;
            } else if (a == b){
                answer = 0;
            }
        }
        return answer;
    }
    
}



/**
 * 문제설명 : 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.

두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1,
 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
제한사항
1 ≤ arr1의 길이 ≤ 100
1 ≤ arr2의 길이 ≤ 100
1 ≤ arr1의 원소 ≤ 100
1 ≤ arr2의 원소 ≤ 100
문제에서 정의한 배열의 대소관계가 일반적인 프로그래밍 언어에서 정의된 배열의 대소관계와 다를 수 있는 점에 유의해주세요. 
 * 입출력 예
 arr1	                arr2	        result
[49, 13]	        [70, 11, 2]	            -1
[100, 17, 84, 1]	[55, 12, 65, 36]	    1
[1, 2, 3, 4, 5]	    [3, 3, 3, 3, 3]	        0
 * 
 * 입출력 예 설명
입출력 예 #1

예제 1번에서는 arr1의 길이는 2이고 arr2의 길이는 3으로 arr2의 길이가 더 깁니다.
 따라서 arr2가 arr1보다 크므로 -1을 return 합니다.
입출력 예 #2

예제 2번에서는 arr1의 길이과 arr2의 길이가 4로 같습니다.
 arr1의 모든 원소의 합은 100 + 17 + 84 + 1 = 202이고 arr2의 모든 원소의 합은 55 + 12 + 65 + 36 = 168으로
  arr1의 모든 원소의 합이 더 큽니다. 따라서 arr1이 arr2보다 크므로 1을 return 합니다.
입출력 예 #3

예제 3번에서는 arr1의 길이와 arr2의 길이가 5로 같고 
각 배열의 모든 원소의 합 또한 15로 같습니다. 
따라서 arr1과 arr2가 같으므로 0을 return 합니다.

 * 
 */
 
  
 /**
  다른 사람 문제풀이1
  import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            // IntStream.of(arr1).sum()은 arr1 배열의 모든 요소의 합을 구한다.
            // Instream.of(arr2).sum()은 arr2 배열의 모든 요소의 합을 구한다. 
            // 이 두 합을 비교하여 결과를 다시 answer에 저장한다
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }
}

다른사람 문제풀이2
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // 만약 arr1의 길이가 arr2의길이보다 짧다면 -1을 반환
        if (arr1.length < arr2.length) return -1;
        // 만약 arr1의 길이가 arr2의 길이보다 길다면 1을 반환
        else if (arr1.length > arr2.length) return 1;
        // 두 배열의 길이가 같을 경우 각 배열의 요소들의 합을 걔산하여 비교한다. 
        int arr1Sum = 0, arr2Sum = 0;
        for (int i = 0;i < arr1.length;i++) {
            // arr1Sum 변수에 arr1의 모든 요소의 합을 저장
            arr1Sum += arr1[i];
            // arr2Sum 변수에 arr2의 모든 요소의 합을 저장
            arr2Sum += arr2[i];
        }
        // 두 합의 비교하여 결과를 반환 arr1Sum과 arr2Sum이 같다면 0을 반환, arr1Sum이 arr2Sum 보다 크다면 1을 반환
        // 그렇지 않으면 -1을 반환
        return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
    }
}

  */