package edu.kh.th.ex.model.thread;

public class ThreadEx4 implements Runnable{
	private int count;
	
	public ThreadEx4(int count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		try {
			for(int i=1; i<=count; i++) {
				Thread.sleep(1000);
//				sleep()���� �����尡 �Ͻ����� �Ǿ��ִ� ���� interrupt() �޼ҵ忡 ���� �����϶�� ����� �����ϸ� sleep()�� InterruptedException�� �߻���Ų��.
				System.out.println(Thread.currentThread().getName() + " : " + i + "��");
			}
			System.out.println(Thread.currentThread().getName() + " ������ ����");
		}catch(InterruptedException e) {
//			e.printStackTrace();
			Thread.currentThread().interrupt();
			System.out.println("@@"+Thread.currentThread().isInterrupted());
		}
		
	}

}
