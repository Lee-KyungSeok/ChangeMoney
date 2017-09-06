# 거스름돈 계산 문제

## __문제__
"Money"의 돈을 주고 "price"의 가격을 지불한 후의 거스름돈을 받았을 때
5000원, 1000원, 500원, 100원, 50원, 10원 의 개수 구하기


## __풀이 1__
그냥 계산

1. 거스름돈에서 각각을 계산

#### __소스 코드__
``` java
public void calc(int money, int price) {

  int change = money - price;
  //5000원~ 10월 각각을 a~f에 매칭
  int a, b, c, d, e, f;

  a = change/5000;
  b = (change-a*5000)/1000;
  c = (change-a*5000-b*1000)/500;
  d = (change-a*5000-b*1000-c*500)/100;
  e = (change-a*5000-b*1000-c*500-d*100)/50;
  f = (change-a*5000-b*1000-c*500-d*100-e*50)/10;

  System.out.println("5000원 : "+a+"\n"+"1000원 : "+b+"\n"+"500원 : "+c+"\n"+"100원 : "+d+"\n"+"50원 : "+e+"\n"+"10원 : "+f);
```

## __풀이 2__
배열과 for문을 이용

1. 배열을 지정
2. 거스름돈 계산
3. 각각의 값을 출력

#### __소스 코드__
``` java
public class CalcChange {

	int changeArray[] = {5000, 1000, 500, 100, 50, 10};

	public void calc(int pay, int buy) {

		int change = pay - buy;
		int number;
		int remain = change;
		print("거스름돈 : " , change);

		for(int money : changeArray) {
			number = remain/money;
			remain = remain%money;
			print(money+"",number);
		}
	}

	public void print(String flag, int count) {		
		System.out.printf("%s : %d\n",flag, count);		
	}
}
```
