package p4;
import p3.Transaction;
public class Deposit implements Transaction 
{
	public void process(double amt)
	 {
			 System.out.println("Amt Withdrawn:"+amt);
			 b1.bal=b1.bal+amt;
			 b1.getBal();
			 System.out.println("Transaction Completed");
		
     }
}