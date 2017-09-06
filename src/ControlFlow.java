
public class ControlFlow {
	
	// ���ǹ�
	// if , switch
	
	public void checkIf() {
		int a = 10;
		int b = 5;
		
		if(a>b) {
			// a �� b���� ũ�� ����Ǵ� ����
			System.out.println("a�� b���� Ů�ϴ�");
			
		}else if(a==b) {
			// a�� b�� ������ ����
			
		}else {
			// �� ���� ������ �� ����			
		}
	}
	
	public void checkSwitch() {
		int a = 5;
		switch(a) { //������ �Ǵ� ���ǰ��� ����, // ���̸� �� ���� ��� �Ұ�
			case 5:
				System.out.println("a�� ���� 5 �Դϴ�.");
				break;
				// break�� ������ ���ǿ� �´� �ͺ��� �Ʒ����� ��� ����ϰ� ��
				// switch case break �� ��Ʈ�� ����ȭ �� ��
			case 10: // �̷������� ���
				System.out.println("a�� ���� 10 �Դϴ�.");
				break;		
		}
	}
	
	// �ݺ���
	// for , while

	public void checkFor() {
		int array[] = {1,2,3,4,5,6,7};
		// array[0] = 1
		// array[1] = 2 �� ��
		
		//�Ϲ����� for��
		// for(���۰�  ; ���ᰪ  ; ������)
		for(int i =0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}
		/*
		 * �����
		 * 1
		 * 2
		 * ... �� ��µ�
		 */
		
		// ���� ���Ǵ� "���� for��" (�迭�� ���)
		for(int item : array) {
			System.out.println(item);
		}
		/*
		 * ������ ��� ���
		 */		
	}
	
	public void checkWhile() {
		int array[] = {1,2,3,4,5,6,7};
		
		//�ݺ��� ������ if��
		//while�� for�� �ٸ��� ���Ǹ� ��
		//while(���ǽ�){}
		//*count �Ǵ� ���� �ٱ��� �ִ� ���� ����
		int count = 0; //���۰�
		while( count<array.length ) { //���ᰪ
			System.out.println(array[count]);
			count = count + 1; //������
			
		//*���ѷ����� ���� ���� ������ �ʿ� ���� ����..
		//���ѷ��� : while(true){}
		}
	}
	
	public void checkDoWhile() {
		int array[] = {1,2,3,4,5,6,7};
		int count = 0;
		
		//������ �������� �ѹ� ���� �׸��� while check!
		//�� �ѹ� ����Ǿ�� �ϸ� do while �� �ܿ��� while
		//while ���� ���ǿ� ������� do ����� �ѹ��� �� ����ȴ�.
		do {
			System.out.println(array[count]);
			count = count + 1;
		} while( count<array.length );		
	}

}
