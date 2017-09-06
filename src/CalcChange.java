
//동사 동사 X -> Change로 하는게 나음
public class CalcChange {
	
	int changeArray[] = {5000, 1000, 500, 100, 50, 10};
	
	// 실행시킬 수 있는 코드의 최소단위 이는 이름에서 판단 가능
	
	//System.out.println? 계산과 관련 X 따라서 따로 만들면 좋음
	public void calc(int pay, int buy) {
		
		int change = pay - buy;
		int number;
		int remain = change;
		
		print("거스름돈 : " , change);
		
		for(int money : changeArray) {
			number = remain/money;
			remain = remain%money;
			print(money+"",number);
			//System.out.printf("%d : %d개\n",money, number); -> 아래에 따로 만듬
		}
		
	}
	
	//객체지향 트렌드~~!
	public void print(String flag, int count) {		
		System.out.printf("%s : %d\n",flag, count);		
	}

}


//객체? 의미 부여 및, 최소의 코드로...
