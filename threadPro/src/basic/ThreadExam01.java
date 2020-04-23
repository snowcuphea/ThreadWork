package basic;

class DigitThread extends Thread {
	public DigitThread(String who) {
		super(who);
	}
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+"("+getName()+") ");
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
class AlphaThread extends Thread {
	public AlphaThread(String who) { 
		super(who);
	}
	public void run() {

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i+"("+getName()+") ");
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

public class ThreadExam01 {

	public static void main(String[] args) {
		System.out.println("***********프로그램 시작**********");
		DigitThread t1 = new DigitThread("t1");
		AlphaThread t2 = new AlphaThread("t2");
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
