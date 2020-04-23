package sync;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		//1. 공유객체 만들기
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-2222-3333",5000,"현버ㅣㄴ");
		obj.acc2 = new Account("333-555-7777",1000,"김서연");
		
		//2. 쓰레드생성
		//(1)두계좌의 잔액을 더하는 쓰레드
		//	- sharedObj객체의 계좌잔액을 더해서 sysout 으로 출력하는 쓰레드
		//	- 5번 출력할 수 있도록
		//(2)acc1계좌에서 acc2계좌에 100만원씩 이체하는 작업을 ㅅ후ㅐㅇ하는 쓰레드
		//	- 20번 이체할 수 잇도록 sharedObj객체를 이용해서 작업 
		//	=>account에 deposit(입금), withdraw(출금) 메소드ㅡ 활용
		//(3) 동기화 하지않고 테스트
		//(4) 동기화 하고 테스트
		// public sysnchoronized 리턴타입 메소드명(){
		// 메소드 전체를동기화
		//코드브럭 동기화(부분)
		//scynchroinied(공유객체){
		//동기화시킬코드를 정의 
		Movetr t1 = new Movetr(obj);
		Howmany t2 = new Howmany(obj);
			
		//3. 생성한 쓰레드 start시키기
		t1.start();
		t2.start();
	}
}
