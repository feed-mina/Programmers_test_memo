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

 