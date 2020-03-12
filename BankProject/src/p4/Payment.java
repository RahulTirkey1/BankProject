package p4;
import p3.Transaction;
public class Payment implements Transaction
{
	 public void process(double amt)
	 {
		     if(amt<=b1.bal)
		     {
			    System.out.println("Amt paid:"+amt);
			    b1.bal=b1.bal-amt;
			    b1.getBal();
			    System.out.println("Transaction Completed");
		     }
		     else
		     {
		    	 System.out.println("Insufficient Fund");
		     }
	 }
}
