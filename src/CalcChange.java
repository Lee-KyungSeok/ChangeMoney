
//���� ���� X -> Change�� �ϴ°� ����
public class CalcChange {
	
	int changeArray[] = {5000, 1000, 500, 100, 50, 10};
	
	// �����ų �� �ִ� �ڵ��� �ּҴ��� �̴� �̸����� �Ǵ� ����
	
	//System.out.println? ���� ���� X ���� ���� ����� ����
	public void calc(int pay, int buy) {
		
		int change = pay - buy;
		int number;
		int remain = change;
		
		print("�Ž����� : " , change);
		
		for(int money : changeArray) {
			number = remain/money;
			remain = remain%money;
			print(money+"",number);
			//System.out.printf("%d : %d��\n",money, number); -> �Ʒ��� ���� ����
		}
		
	}
	
	//��ü���� Ʈ����~~!
	public void print(String flag, int count) {		
		System.out.printf("%s : %d\n",flag, count);		
	}

}


//��ü? �ǹ� �ο� ��, �ּ��� �ڵ��...
