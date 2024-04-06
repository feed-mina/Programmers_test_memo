### int 와 doublie 의 차이

#### int : 정수형 데이터를 나타낸다. 예를 들어 1, 2, -3 등이 int 형식의 데이터이다.
#### double : 부동 소수점 숫자를 나타낸다. 부동 소수점 숫자는 소수점 이하의 숫자를 포함할 수 있다. 
#### public doublue solution(int price) 는 double 형식의 값을 반환한다. 할인된 가격이 부동 소수점으로 반화된다.
#### public int solution (int price)는 할인된 가격이 정수 형식으로 반환된다 소수점 이하는 버려진다. 따라서 public doblue solution(int price)을 사용하면 소수점 이하의 할인된 가격을 정확하게 얻을 수 있다. 하지만 public int solution(int price)를 사용하면 할이된 가격이 정수형으로 반환되므로 소수점 이하의 값을 손실 될 수 있다. 

#### int parseInt(String s) : String -> int 문자열을 int형으로 반환한다.

```java 
String str = "135";
int num = Integer.parseInt(str);
			
```
#### int parseInt(String s, int radix) : radix 부분에 몇 진수를 01진수로 바꿀것인지 쓰면 된다. 
```java 
		String str1 = "1000";
        int num1 = Integer.parseint(str1, 2); // num 1 = 8
        int num2 = Integer.toBinaryString(str1); // 2진수는 toBinaryString 사용해도 된다.
```
#### Integer.min(int a, int b) 입력 받은 2개 정수 중 더 작은 값을 리턴

```java 
			int i1 = 9;
            int i2 = 14;
            int a = Integer.min(i1, i2);
            System.out.println(a); // 9
```
####

```java 
			
```
####

```java 
			
```
####

```java 
			
```
####

```java 
			
```
#### Math.random()
해당 함수는 0.0이상 1.0미만의 난수를 반환한다
#### Math.pow(n,m)
해당 함수는 n의 m제곱근 값을 반환한다
#### Math.sqrt(n)
해당 함수는 n의 루트값을 반환한다
#### Math.abs(n)
해당 함수는 n의 부호(+,-)를 제외한 값을 반환한다. ex) Math.abs(-10) (dobule) 10
#### Math.celi(n)
해당 함수는 n이 소수점일 경우 값을 올림 하여 반환한다.
ex) Math.celi(3.54) => (double) 4.0
#### Math.round(n)
해당 함수는 n의 소수점일 경우 값을 반올림하여 반환한다. 
ex) Math.round(3.54) => (double) 4.0
#### Math.floor(n) 
n의 소수점일 경우 값을 내림하여 반환한다. 
Math.floor(3.54) (double) 3.0
#### Math.max(n,m)
n과 m을 비교하여 최대값을 반환 , Math.max(1,10) (int) 10
#### Math.substractExact(n, m) 
n에서 m을 뺀 값을 반환한다 . Math.substractExact(1, 10) (int) -9
#### Math.floorDiv(n, m) 
n과 m을 나눈 값을 반환, Math.floorDiv(25, 5) (int) 5
#### Integer.toString(n,m)
n의 10진수의 값을 m진법으로 반환 Integer.toString(10,2) (String) 1010
#### Integer.parseInt(n)
문자열을 숫자로 변환해주며 부호(+,-)를 포함해서 반환 
ex) Integer.parseInt("-1234") (int) -1234
#### Integer.parseInt(n,m)
n의 n진법의 값을 m의 진법에 따라 10진수로 반환 
ex) Integer.toString("1010",2) (String) 10 


 