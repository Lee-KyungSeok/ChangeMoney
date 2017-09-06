import java.util.Scanner;

/**
 * 
 * @author Kyung
 * 거스름돈 미니테스트 문제
 *
 */
public class ChangeMoney {
	
	public static void main(String args[]) {
		
		int money =10000;
		int price =3770;
		//ChangeMoney newClass = new ChangeMoney();
		//newClass.calc(money, price);
		//혹은 static을 넣음	
		
		CalcChange newChange = new CalcChange();
		newChange.calc(money, price);
	}
	
	public void calc(int money, int price) {
		
		int change = money - price;
		
		int a, b, c, d, e, f;
		
		a = change/5000;
		b = (change-a*5000)/1000;
		c = (change-a*5000-b*1000)/500;
		d = (change-a*5000-b*1000-c*500)/100;
		e = (change-a*5000-b*1000-c*500-d*100)/50;
		f = (change-a*5000-b*1000-c*500-d*100-e*50)/10;
		
		System.out.println("5000원 : "+a+"\n"+"1000원 : "+b+"\n"+"500원 : "+c+"\n"+"100원 : "+d+"\n"+"50원 : "+e+"\n"+"10원 : "+f);
		
		/*
		 * 다른 방법 
		 * int change = money - price;
		 * int temp;
		 * System.out.println(change/5000);
		 * temp = change % 5000;
		 * System.out.println(temp/1000);
		 * ... 반복
		 */
		
		
	}

}
