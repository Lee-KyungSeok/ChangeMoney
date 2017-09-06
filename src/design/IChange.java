package design;

// 인터페이스 : 코드가 없는 설계를 위한 파일


//인터페이스를 설계하는 방법
// 접근제한자 + interface + 이름
public interface IChange {
	
	public void calc(int pay, int buy); // 함수이름을 정의만 한다.
	//cf> public void calc(int pay, int buy){ //코드 }
	//구현을 강제할때 사용
	
	/*
	 * public void mave(); 
	 * public void print();
	 * public void jump();
	 * public void show();
	 * 이렇게 많은 메소드 넣지 말 것.
	*/
	
	//되도록 인터페이스 하나에 하나의 메소드만 넣을 것
	
}

interface IChangeMove {
	public void move();
}


// 다른파일이라고 생각하고...

//인터페이스 구현하기
//class + 이름 + implements + 인터페이스이름
class ChangeImple implements IChange, IChangeMove{ //Imple을 붙여서 상속받았다고 이야기하기도 한다.

	@Override
	public void calc(int pay, int buy) {
		// 구현단의 코드를 작성
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	} 
	
}
