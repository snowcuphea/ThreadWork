package basic;
/*
 * 쓰레드종료하는 방법 리스트
 * 1. 임의의 변수를 선언해서 종료하는 방법
 * 	  --------
 * 		flag변수
 * 		- 변수에 저장된 값에 따라서 처리할 수 있도록 구현(실행 or 종료 - boolean)
 * 		- 변수값을 체크(오래걸리는 작업이 있는 경우, 중간에 이 값을 체크해서 쓰레드를 종료할 수 있다.)
 * 
 * 2. 인터럽트를 발생시키고 현재 상태를 확인하고 작업하는 방법
 * 	  => isInterrupted()메소드를 이용해서 현재 쓰레드의 상태가 인터럽트 상태인지 파악
 * 		 인터럽트상태이면 true를 리턴
 * 
 * 
 */

class StopThread02 extends Thread {
	public void run() {
		try {
			while (Thread.currentThread().isInterrupted()) {// 현재 상태가 인터럽트인지 아닌지 확인
				System.out.println("현재 쓰레드 상태 : 실행중~~~");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("현재쓰레드상태 : 종료~~~");
		}
	}
}

public class StopThreadTest02 {

	public static void main(String[] args) {
		System.out.println("main쓰레드 시작");
		Thread t1 = new Thread(new StopThread02());
		t1.start();
		System.out.println("쓰레드의 이름:"+t1.getName());
		System.out.println("인터럽트 상태:"+t1.isInterrupted());
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//인터럽트 발생시키기
		t1.interrupt(); //interrupt() 메소드를 사용하면 인터럽트를 발생시킬 수 있다.
		System.out.println("인터럽트 상태:"+t1.isInterrupted());
		System.out.println("main쓰레드 종료");
	}
}
