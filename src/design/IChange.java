package design;

// �������̽� : �ڵ尡 ���� ���踦 ���� ����


//�������̽��� �����ϴ� ���
// ���������� + interface + �̸�
public interface IChange {
	
	public void calc(int pay, int buy); // �Լ��̸��� ���Ǹ� �Ѵ�.
	//cf> public void calc(int pay, int buy){ //�ڵ� }
	//������ �����Ҷ� ���
	
	/*
	 * public void mave(); 
	 * public void print();
	 * public void jump();
	 * public void show();
	 * �̷��� ���� �޼ҵ� ���� �� ��.
	*/
	
	//�ǵ��� �������̽� �ϳ��� �ϳ��� �޼ҵ常 ���� ��
	
}

interface IChangeMove {
	public void move();
}


// �ٸ������̶�� �����ϰ�...

//�������̽� �����ϱ�
//class + �̸� + implements + �������̽��̸�
class ChangeImple implements IChange, IChangeMove{ //Imple�� �ٿ��� ��ӹ޾Ҵٰ� �̾߱��ϱ⵵ �Ѵ�.

	@Override
	public void calc(int pay, int buy) {
		// �������� �ڵ带 �ۼ�
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	} 
	
}
