package sync;
//공유객체 - 모든 쓰레드가 공유해서 사용하는 객체
public class Toilet {
	/*
	 * synchronized 를 이용해서 부분코드에 lock을 적용
	 */
	public synchronized void open(String user_name) {
		System.out.println(user_name+"가 문을열고 들어옴");
		for(int i=1 ; i<100000000;i++) {
			if(i==10000) {
				System.out.println("끙~~~아~~~~"); 
			}
		}
		System.out.println(user_name+"가 종료후에 나감");
	}
}
