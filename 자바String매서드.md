* String 클래스 메소드 
charAt(int index) : 특정 위치의 문자를 리턴 
equals(Object anObject) : 두 문자열을 비교
getBytes() : byte[] 로 리턴
getBytes(Charset charset) : 문자열 내에서 주어진 문자열의 위치를 리턴

length() : 총 문자의 수를 리턴
replace(CharSequence target, CharSequence replacement) : 
target 부분을 replacement로 대체한 새로운 문자열을 리턴 
```java
String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";	
//replace([기존문자],[바꿀문자])
a= a.replace("대한", "민국");	
System.out.println(a);

//결과값 : 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세
```
String replace(CharSequnce target, CharSequence replacement)

Replace 함수는 자신이 바꾸고싶은 문자로 문자열을 치환시켜주는 기능을 합니다.

```java
String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";	
//replaceAll([정규식],[바꿀문자])
a= a.replaceAll("대한", "민국");
System.out.println(a);

//결과값 : 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세
```
ReplaceAll 함수는 자신이 바꾸고싶은 문자로 문자열을 전부 치환시켜주는 기능을 합니다. 

Replace는 첫 번째 값으로 바꿀 문자열을 입력받는 대신 첫 번째 인자 값으로 정규식이 들어갑니다. 
그래서 Replace는 특수문자로도 치환이 되는데 반하여 ReplaceAll은 특수문자로 치환이 어렵습니다.





indexOf : 문자열 찾기 
indexOf( ) 메소드는 if문의 조건식에서 특정 문자열이 포함되어 있는지
 여부에 따라 실행 코드를 달리할 때 자주 사용됩니다. 
 -1 값을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻입니다.

split() : 문자열을 잘라서 배열로 반환하는 메서드, 파라미터로 자를때 기준이 되는 문자열을 입력받는다.
```java
String str = "Hello Java";
String[] arr = arr.split("");
System.out.println(Arrays.toString(arr));

// 출력 결과 : [H, e, l, l, o,  , J, a, v, a]
```

substring(int beginIndex) : beginIdex 위치에서 끝까지 
잘라낸 새로운 문자열을 리턴

substring(int beginIndex, int endIndex) : beginIndex위치에서 endIndex전까지 
잘라낸 새로운 문자열을 리턴

toLowerCase() 알파벳 소문자로 변환한 새로운 문자열 리턴
toUpperCase() 알파벳 대문자로 변환한 새로운 문자열 리턴
trim() 앞뒤 공백을 제거한 새로운 문자열을 리턴
valueOf(int i) 
valueOf(dobule d) - 기본 타입 값을 문자열로 리턴

StringBuilder

StringBuilder는 Java에서 문자열을 다루는 클래스 중 하나입니다. 
문자열을 변경할 때 유용하게 사용됩니다. StringBuilder는 가변적이며,
 내부적으로 가변 크기의 문자열을 저장하고 변경할 수 있는 메서드를 제공합니다. 

이 클래스는 문자열을 더하거나 변경할 때 String 클래스보다 효율적입니다. 
이유는 String 클래스는 불변(immutable)이기 때문에 문자열을 변경할 때마다 
새로운 문자열 객체를 생성하는 반면, StringBuilder는 내부의 문자열을 
직접 변경하기 때문에 메모리를 더 효율적으로 사용할 수 있습니다.

StringBuilder의 기능은 다음과 같습니다:
- 문자열에 새로운 문자열을 추가하는 `append()` 메서드
- 문자열을 뒤집는 `reverse()` 메서드
- 특정 위치에 있는 문자를 변경하는 `setCharAt()` 메서드 등

이러한 특성으로 인해 문자열을 동적으로 변경해야 하는 상황에서 
StringBuilder를 사용하는 것이 유용합니다.

contains는 매개변수로 CharSequence를 받는데 String이 CharSequence를 구현한 클래스이기 때문에 문자열을 변수로 사용해도 된다.


```java
String s="aaaaa";
System.out.println("a : " + s.contains("a"));
System.out.println("b : " + s.contains("b"));
System.out.println("aaaaaaaaaaaaaa : "+ s.contains("aaaaaaaaaaaaaa")); 

a : true
b: false
aaaaaaaaaaaaaa : flase

```
