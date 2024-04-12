
- stack 컬렉션 
스택의 사전적 정의는 쌓다, 더미 로서 접시 스택처럼 접시를 쌓아 놓은것을 말한다. 즉 상자에 쌓아 
올리듯이 데이터를 쌓는 자료 구조라고 할 수 있다. 아래 그림과 같이 스택은
마지막에 저장한 데이터를 가장 먼저 꺼내게 되는 구조 특징이 있는데 이런 자료구조를
LIFO(Last In First Out)구조 라고 말한다. 함께 많이 사용되는 Queue(큐)의 경우 
먼저 추가된 데이터가 먼저 나오는 FIFO(First In First Out) 동작을 갖는것과 비교된다.

Stack 사용처
스택의 쓰임새의 대표적인 예로 총기류의 탄창을 들 수 있다. 마지막에 넣은 탄알이 
가장 먼저에 발사되어 꺼내어지며 결국에는 맨 처음에 넣은 탄환이 마지막에 발사되는걸
떠올리면 된다.

이 밖에도 스택은 수식 꼐산, 수식 괄호 검사, undo/redo, 웹 브라우저의 뒤로 /앞으로 등에
구현되기도 한다.  

자바는 java.util.Stack 클래스를 통해 Stack(스택) 동작을 제공하고 있다.
일반적으로 스택에 데이터를 추가하는 동작은 push라고 하며 
스택에서 데이터를 빼는 동작은 pop이라고 한다.

import java.util.stack;

boolean empty() : Stack이 비어있는지 알려준다.
Object peek() : Stack의 맨 위에 저장된 객체를 반환 , 
pop과 달리 Stack에서 객체를 꺼내지는 않는다. 
비어 있을 경우 EmptyStackException발생

Object pop () : stack의 맨 위에 저장된 객체를 꺼낸다.
비어있을 경우 EmptyStackException발생

Object push(Object item) : Stack에 객체(item)를 저장한다.

int search(Object o) : stack에서 주어진 객체(o)를 찾아서 그 위치를 반환
못찾을 경우 -1를 반환, 배열과 달리 위치는 0이 아닌 1부터 시작


Stack<Number> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.push(3);

System.out.println(stack); // [1, 2, 3]

System.out.println(stack.pop()); // 3

System.out.println(stack); // [1, 2]

System.out.println(stack.pop()); // 2
System.out.println(stack.pop()); // 1

System.out.println(stack); // []


Stack<Number> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.push(3);

// 마지막에 넣은 값만 확인하고 제거하지는 않는다
System.out.println(stack.peek()); // 3

System.out.println(stack); // [1, 2, 3]

Stack<Number> stack = new Stack<>();
stack.push(1);

// 스택이 비어있지 않다면 안전하게 요소를 제거
if(!stack.isEmpty() {
	stack.pop();
}
