import java.util.Scanner;

/**
 * 
 * @author Kyung
 * �Ž����� �̴��׽�Ʈ ����
 *
 */
public class ChangeMoney {
	
	public static void main(String args[]) {
		
		int money =10000;
		int price =3770;
		//ChangeMoney newClass = new ChangeMoney();
		//newClass.calc(money, price);
		//Ȥ�� static�� ����	
		
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
		
		System.out.println("5000�� : "+a+"\n"+"1000�� : "+b+"\n"+"500�� : "+c+"\n"+"100�� : "+d+"\n"+"50�� : "+e+"\n"+"10�� : "+f);
		
		/*
		 * �ٸ� ��� 
		 * int change = money - price;
		 * int temp;
		 * System.out.println(change/5000);
		 * temp = change % 5000;
		 * System.out.println(temp/1000);
		 * ... �ݺ�
		 */
		
		
	}

}
