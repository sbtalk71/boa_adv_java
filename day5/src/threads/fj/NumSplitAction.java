package threads.fj;

import java.util.concurrent.RecursiveAction;

public class NumSplitAction extends RecursiveAction{

	private static final long serialVersionUID = 1L;

	private float num;
	
	public NumSplitAction(float num) {
		this.num = num;
	}

	@Override
	protected void compute() {
		
		if(num>10) {
			//System.out.println(Thread.currentThread().getName());
			NumSplitAction t1=new NumSplitAction(num/2f);
			NumSplitAction t2=new NumSplitAction(num/2f);
			t1.fork();
			t2.fork();
			
			t1.join();
			t2.join();
		}else {
			System.out.println("Split Data : "+num);
		}
	}

}
