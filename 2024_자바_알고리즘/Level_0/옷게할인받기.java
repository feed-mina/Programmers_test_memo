public class 옷가게할인받기 {
    /*
     *   if(price>1000000){
    price = price - 0.05 * price = 0.95 * price
  } else if(100000 < price < 300000){
    price = price - 0.1 * price = 0.9 price
  } else if(price > 500000){
    price = price - 0.2 * price
  } 가 안되는 이유 : 할인된 가격에 소수점 이하가 있는 경우에 소수점 이하가 버려지지 않기 때문이다. 
     */
    public double solution(int price) {
        
        // 각 할인 계산 후에 (int)를 사용하여 소수점 이하를 버린 정수값으로 변환합니다.
        //  이로 인해 결과값이 정수형으로 반환되므로, 할인된 가격에 소수점 이하가 있는 경우에는 
        // 소수점 이하가 버려지고 결과가 다를 수 있습니다.
            double answer = 0;
                if (10 <= price&& price < 100000){
                    answer = price;
                }
                else if (100000 <= price && price < 300000) {
                    answer =   (int)(price-(price*0.05));   
                } else if (300000 <= price && price < 500000) {
                    answer =   (int)(price-(price*0.1));    
                } else if (500000 <= price ) {
                    answer =(int)(price-(price*0.2));    
                }  
                return answer;
            }
}


/**
 * 문제 설명 : 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
제한사항
10 ≤ price ≤ 1,000,000
price는 10원 단위로(1의 자리가 0) 주어집니다.
소수점 이하를 버린 정수를 return합니다.
입출력 예
price	result
150,000	142,500
580,000	464,000
입출력 예 설명
입출력 예 #1

150,000원에서 5%를 할인한 142,500원을 return 합니다.
입출력 예 #2

580,000원에서 20%를 할인한 464,000원을 return 합니다.
 * 
 */

 /*
 다른 사람의 풀이1
class Solution {
    public int solution(int price) {
        int answer = 0;

        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}

다른사람의 풀이 2
class Solution {
    public int solution(int price) {
        return (int) (price >= 500_000 ? price - price * 0.2 : price >= 300_000 ? price - price * 0.1 : price >= 100_000 ? price - price * 0.05 : price);
    }
}
  *  
  */