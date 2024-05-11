### Scanner 클래스의 특징
java.util 패키지에 포함되어 있어 java.util을 import를 해줘야 사용할 수 있다.

기본적인 데이터 타입을 모두 입력받을 수 있다.

토큰(꽁백, 개행, 탭)을 기준으로 데이터를 입력받는다.

Scanner 사용순서

```java
import java.util.Scanner; 
import java.util.*;

Scanner sc = new Scanner(System.in) // Scanner 객체 생성

```
Scanner 객체를 생성한다.

클래스명은 주로 sc로 많이 네이밍한다.

new는 새로운 객체를 heap 메모리에 할당하겠다는 의미이다.
System.in은 화면에서 입력을 받겠다는 의미이다.

System.in은 입력한 값을 Byte 단위로 읽어주는 자바의 표준 입력 스트림이다.

String str = sc.next(); // 입력받은 문자열을 str에 저장

Scanner객체를 사용하여 입력값을 받는다. 참고로 입력받을 데이터 타입에 의해 Scanner클래스의 메서드를 달리해야 한다. 데이터 타입 별 메서드는 아래 표를 참고한다.

Scanner클래스의 메서드
토큰(Token) : 공백 문자(Spacebar), 탭(Tab), 개행(Enter) 등으로 구분되는 요소

next() : String을 읽음, 토큰(Token)을 기준으로 읽음

nextLine(): String을 읽음, 개행(Enter)을 기준으로 읽음

nextInt(): int를 읽음

nextBoolean(): boolean을 읽음

nextByte() : byte를 읽음

nextShort() : short를 읽음

nextLong() : long을 읽음

nextFloat() : float을 읽음

nextDouble() : double을 읽음

close(): void, Scanner의 사용 종료

hasNext(): Boolean 현재 입력된 토큰이 있으면 true, 아니면 새로운 입력이 들어올때까지 무한정 기다려서

새로운 입력이 들어오면 그 때 true반환, ctrl + z키가 입력되면 입력끝이므로 false 반환

hasNextLine() : Boolean 다음에 읽을 값(Line 줄)이 있는지 확인

```java
import java.util.Scanner; // Scanner 클래스 호출
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        // 기본 타입
        byte a = sc.nextByte(); //byte입력
        sort b = sc.nextShort(); // short 입력
        inc c = sc.nextInt(); // int 입력
        long d = sc.nextLong(); // long 입력

        //실수타입
        float e = sc.nextFloat(); // float입력
        double f = sc.nextDouble(); // double 입력

        // 논리타입
        boolean g = sc.nextBoolean(); // boolean 입력

        // 문자열 타입
        String h = sc.next(); // String 형 입력 (토큰을 기준으로 한 단어를 읽음)
        String i = sc.nextLine(); // String형 입력(개행을 기준으로 한 줄을 읽음)

        // 출력문
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }

}


```

### 스트림(Stream)이란
#### 스트림을 가장 쉽게 이해하려면 수도꼭지를 생각하면 된다. 수도꼭지를 틀면 물이 나오고 수도꼭지를 잠금녀 물이 나오지 않는다. A라는 곳에서부터 B라는 곳까지 수도관이 있꼬 A에서 계속 물을 보낸다면 B에서 수도꼭지를 틀때마다 물이 나오게 될것이다. 여기서 스트림은 A수도관에서 B수도관으로 이동하는 물의 흐름이라고 할 수 있다.

프로그래밍에서는 다음과 같은것들을 스트림이라고 할 수 있다.
#### 파일 데이터(파일은 그 시작과 끝이 있는 데이터의 스트림이다.)
#### HTTP 응답 데이터(브라우저가 요청하고 서버가 응답하는 HTTP 응답데이터도 스트림이다)
#### 키보드 입력(사용자가 키보드로 입력하는 문자열은 스트림이다)

......
입력 장치                                                                                출력장치
키보드      ->      스트림(Strean)      ->     프로그램     ->   스트림(Strean)      ->     프린터
마우스               입력 스트림                                출력스트림                  모니터

이처럼 한 곳에서 다른 곳으로의 데이터 흐름을 스트림이라고 한다. 

그리고 스트림은 단방향이기 때문에 입력과 출력이 동시에 발생할 수 없다. 

그렇기 때문에 용도에 따라 입력스트림, 출력스트림이 나뉜다.

System 클래스 in 변수는 '표준 입력 스트림'이며

일반적으로 콘솔, 명령줄 인수 등을 통해 입력을 받을 수 있다.

키보드로 치거나 터미널 등에서 입력을 넣어주는 것들은

System.in을 통해 연결된다는 의미이다.

in이라는 변수는 InputStream의 변수로 결국 InputStream 타입의 새 변수를 선언하고 

그 변수에 system.in을 할당시킬 수도 있다는 뜻이다. 

이렇기 때문에 System.in 과 InputStream을 같이 묶어서 설명하게 된다.

