
public class ControlFlow {
	
	// 조건문
	// if , switch
	
	public void checkIf() {
		int a = 10;
		int b = 5;
		
		if(a>b) {
			// a 가 b보다 크면 실행되는 영역
			System.out.println("a가 b보다 큽니다");
			
		}else if(a==b) {
			// a와 b가 같으면 실행
			
		}else {
			// 그 외의 조건일 때 실행			
		}
	}
	
	public void checkSwitch() {
		int a = 5;
		switch(a) { //기준이 되는 조건값이 들어옴, // 더미를 쓸 때는 사용 불가
			case 5:
				System.out.println("a의 값이 5 입니다.");
				break;
				// break가 없으면 조건에 맞는 것부터 아래까지 모두 사용하게 됨
				// switch case break 를 세트로 습관화 할 것
			case 10: // 이런식으로 사용
				System.out.println("a의 값이 10 입니다.");
				break;		
		}
	}
	
	// 반복문
	// for , while

	public void checkFor() {
		int array[] = {1,2,3,4,5,6,7};
		// array[0] = 1
		// array[1] = 2 로 들어감
		
		//일반적인 for문
		// for(시작값  ; 종료값  ; 증감값)
		for(int i =0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}
		/*
		 * 결과는
		 * 1
		 * 2
		 * ... 로 출력됨
		 */
		
		// 현재 사용되는 "향상된 for문" (배열일 경우)
		for(int item : array) {
			System.out.println(item);
		}
		/*
		 * 동일한 결과 출력
		 */		
	}
	
	public void checkWhile() {
		int array[] = {1,2,3,4,5,6,7};
		
		//반복이 가능한 if문
		//while은 for와 다르게 조건만 들어감
		//while(조건신){}
		//*count 되는 값이 바깥에 있는 것이 좋다
		int count = 0; //시작값
		while( count<array.length ) { //종료값
			System.out.println(array[count]);
			count = count + 1; //증감값
			
		//*무한루프일 때는 위의 세개는 필요 없을 수도..
		//무한루프 : while(true){}
		}
	}
	
	public void checkDoWhile() {
		int array[] = {1,2,3,4,5,6,7};
		int count = 0;
		
		//무조건 실행블록을 한번 실행 그리고 while check!
		//꼭 한번 실행되어야 하면 do while 그 외에는 while
		//while 문의 조건에 상관없이 do 블록이 한번은 꼭 실행된다.
		do {
			System.out.println(array[count]);
			count = count + 1;
		} while( count<array.length );		
	}

}
