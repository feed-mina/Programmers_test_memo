public class 특정문자제거하기 { 
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
           if (!letter.equals(String.valueOf(charArray[i]))) {
                answer.append(charArray[i]); // 해당 문자가 letter와 다른 경우에만 추가
            } 
        }
        
        return answer.toString();
    }
}

/*
 * 문제 설명
문자열 my_string과 문자 letter이 매개변수로 주어집니다.
 my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
letter은 길이가 1인 영문자입니다.
my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
대문자와 소문자를 구분합니다.
입출력 예
my_string	letter	result
"abcdef"	"f"	"abcde"
"BCBdbe"	"B"	"Cdbe"

입출력 예 설명
입출력 예 #1

"abcdef" 에서 "f"를 제거한 "abcde"를 return합니다.
입출력 예 #2

"BCBdbe" 에서 "B"를 모두 제거한 "Cdbe"를 return합니다.
 */


 /*
 setCharAt() 특정 위치에 있는 문자를 변경
 my_string의 알파벳을 배열로 split, 변환다음 
  setCharAt()  사용하여 지워준다.
 letter 이 my_string[i] 와 똑같다면

 다른사람 문제풀이
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
  */