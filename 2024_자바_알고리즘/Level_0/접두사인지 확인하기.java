class 접두사인지 확인하기
{
    public int solution(String my_string, String is_prefix) {
        int answer; // answer 초기화
        // 접두사로 지정하여 추출
        // "ban"을 접두사로 지정하여 추출 
        int prefixLength = Math.min(my_string.length(), is_prefix.length());
        String prefix = my_string.substring(0, prefixLength);

        if (prefix.equals(is_prefix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

}

/**
 * 문제설명
 * 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
 * 문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을
 * return 하는 solution 함수를 작성해 주세요.
 * 
 * 
 * 
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 100
 * 1 ≤ is_prefix의 길이 ≤ 100
 * my_string과 is_prefix는 영소문자로만 이루어져 있습니다.
 * 입출력 예
 * my_string is_prefix result
 * "banana" "ban" 1
 * "banana" "nan" 0
 * "banana" "abcd" 0
 * "banana" "bananan" 0
 * 입출력 예 설명
 * 입출력 예 #1
 * 
 * 예제 1번에서 is_prefix가 my_string의 접두사이기 때문에 1을 return 합니다.
 * 입출력 예 #2
 * 
 * 예제 2번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
 * 입출력 예 #3
 * 
 * 예제 3번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
 * 입출력 예 #4
 * 
 * 예제 4번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
 */

/**
 * 다른사람 문제풀이1
 * class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;
    }
}
 * 
 * 다른사람 문제풀이2
  
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int a = my_string.indexOf(is_prefix);
        System.out.print(a);

        return a==0? 1 : 0;
    }
}

* 다른사람 문제풀이3
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int k=1;
        String[] arr=new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            arr[i]=my_string.substring(0,k);
            k++;
        }
        for(int i=0;i<my_string.length();i++){
            if(arr[i].equals(is_prefix)){
                answer=1;
            }
        }
        return answer;
    }
}
 */
