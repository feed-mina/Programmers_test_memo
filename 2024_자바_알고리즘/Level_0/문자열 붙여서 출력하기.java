import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String answer = a + b ;
        System.out.println(answer);
    }
}



/**
 * 문제설명
 * 두 개의 문자열 str1, str2가 공백으로 구분되어 
 * 입력으로 주어집니다. 입출력 예와 같이 str1과 str2을 
 * 이어서 출력하는 코드를 작성해 보세요.

 * 제한사항
 * 1 ≤ str1, str2의 길이 ≤ 10

 * 입출력 예
입력 #1

apple pen
출력 #1

applepen
입력 #2

Hello World!
출력 #2

HelloWorld!
 * 
 */

 
/**
 * 
 * 다른사람 문제풀이1
 * import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(br.readLine().replaceAll(" ", ""));
    }
}
 * 
 */