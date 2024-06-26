
Arrays.stream()은 배열을 스트림으로 변환하는 Java 유틸리티 매서드다.

Java8에서 추가 되었으며 스트림을 사용하여 배열의 요소를 처리할 수 있게 한다.

스트림은 데이터의 연속적인 흐름을 나타내며 데이터 소스에서 데이터를 읽어오거나 처리할때

스트림은 배열, 컬렉션, 파일 등 다양한 데이터 소스에서 생성할 수 있다.

stream(T[] array) : 지정된 배열을 스트림으로 변환한다.

stream(T[] array, int startInclusive, int endExclusive) : 지정된 배열의 일부분을 스트림으로 변환한다. 

startInclusive 는 시작 인덱스를 endExclusive 는 끝 인덱스를 나타낸다.

이 범위는 시작 인덱스부터 (끝 인덱스 -1) 까지의
요소를 스트림으로 만든다.


예를 들어 int[] numbers = {1,2,3,4,5} 라는 배열이 있다고 할때
int[] numbers = {1,2,3,4,5};

// 배열을 스트림으로 변환하여 스트림을 출력한다.

Arrays.stream(numbers).forEach(System.out::println);

위 코드는 numbers를 스트림으로 변환하고 각 요소를 출력한다. 


Arrays.stream()을 사용하여 배열을 스트림으로 변환하면 다양한 스트림 연산을 사용하여 데이터를 처리할 수 있다.

예를 들어 map(), filter(), reduce() 등의 메서드를 사용하여 데이터를 변환하거나 필터링 할 수 있다.


** Arrays.stream() VS 반복문 
Arrays.stream() 은 함수형 프로그래밍 스타일을 따르므로 코드가 간결하고 읽기 쉽다, 

병렬처리를 통한 성능향상이 가능

단점 : 작은 배열에 대해서는 반복문 보다 속도가 느릴 수 있다.

반복문 : 작은 크기에 대해서는 더 빠른 속도를 보일 수 있다.
단점 : 병렬 처리를 구현하기가 어렵다. 

#### 배열 자르기


```java 
import java.util.Arrays;
 public class ArraySplit {
        public static void main(String[] args) {
        // 1. 원본 배열
            int[] arr = {0, 1, 2, 3, 4, 5};
         // 2. 배열을 자를 index
        int position = 3;
        // 3. 배열 자르기
        int[] arr1 = Arrays.copyOfRange(arr, 0, position);
        int[] arr2 = Arrays.copyOfRange(arr, position, arr.length);
        // 4. 자른 배열 출력
        System.out.println(Arrays.toString(arr1));  // [0, 1, 2]
        System.out.println(Arrays.toString(arr2));  // [3, 4, 5]  
           }} 
 ``` 

#### 오름차순 정렬 Arrays.sort(arr)
```java 
			int[] arr = {6,3,2,1,5};
            String[] arr2 = {"h","e","a","c"};
            Arrays.sort(arr);
            Arrays.sort(arr2);
``` 
#### 내림차순 정렬
```java 
    // String
			 Arrays.sort(arr2, Collections.reserveOrder());
    // int
            Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(arr3, Collections.reserveOrder());
 ``` 
#### 정렬을 시작하는 위치와 끝 위치를 지정하고 싶을때
```java 
  
Arrays.sort(arr, 1, 3);
Arrays.sort(arr, 1, 3, Collections.reseveOrder());
 ``` 