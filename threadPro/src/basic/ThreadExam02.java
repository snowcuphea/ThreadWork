package basic;

class DigitThread2 implements Runnable {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+"("+Thread.currentThread().getName()+") ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
class AlphaThread2 implements Runnable {
	
	public void run() {

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i+"("+Thread.currentThread().getName()+") ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}

public class ThreadExam02 {

	public static void main(String[] args) {
		System.out.println("***********프로그램 시작**********");
		DigitThread2 r1 = new DigitThread2();
		AlphaThread2 r2 = new AlphaThread2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		System.out.println("작업중....");
		for(int i=1;i<=10;i++) {
			System.out.println("main");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*********프로그램종료***********");

	}

}
