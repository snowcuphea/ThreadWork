package sync;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		//1. ������ü �����
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-2222-3333",5000,"�����Ӥ�");
		obj.acc2 = new Account("333-555-7777",1000,"�輭��");
		
		//2. ���������
		//(1)�ΰ����� �ܾ��� ���ϴ� ������
		//	- sharedObj��ü�� �����ܾ��� ���ؼ� sysout ���� ����ϴ� ������
		//	- 5�� ����� �� �ֵ���
		//(2)acc1���¿��� acc2���¿� 100������ ��ü�ϴ� �۾��� ���Ĥ����ϴ� ������
		//	- 20�� ��ü�� �� �յ��� sharedObj��ü�� �̿��ؼ� �۾� 
		//	=>account�� deposit(�Ա�), withdraw(���) �޼ҵ�� Ȱ��
		//(3) ����ȭ �����ʰ� �׽�Ʈ
		//(4) ����ȭ �ϰ� �׽�Ʈ
		// public sysnchoronized ����Ÿ�� �޼ҵ��(){
		// �޼ҵ� ��ü������ȭ
		//�ڵ�귰 ����ȭ(�κ�)
		//scynchroinied(������ü){
		//����ȭ��ų�ڵ带 ���� 
		Movetr t1 = new Movetr(obj);
		Howmany t2 = new Howmany(obj);
			
		//3. ������ ������ start��Ű��
		t1.start();
		t2.start();
	}
}
