package sync;

public class Howmany extends Thread {
	SharedObj obj;

	public Howmany(SharedObj obj) {
		super();
		this.obj = obj;
	}
	
	public void run() {
		for(int i=1; i<=5 ; i++) {
			synchronized (obj) {
				long remain = obj.acc1.getBalance()+obj.acc2.getBalance();
				System.out.println("acc1�ܾ�:"+obj.acc1.getBalance()+":::: acc2�ܾ�:"+
						obj.acc2.getBalance()+"::::�Ѿ�:"+remain);
			}
			
		}
	}
}
