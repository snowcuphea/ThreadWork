package sync;

public class Movetr extends Thread {

	SharedObj obj;

	public Movetr(SharedObj obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		for (int k = 1; k <= 20; k++) {
			synchronized (obj) { // 코드블럭만 lock을 적용한다.
				obj.acc1.withdraw(100);
				obj.acc2.deposit(100);
				System.out.println(k + "번째 100원 송금");
			}
		}
	}
}
