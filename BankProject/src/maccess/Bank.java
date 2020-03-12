package maccess;
import java.util.*;
import p1.PinCheck;
import p4.*;
public class Bank {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
		while(true)
		{
			System.out.println("Enter the pinNo");
			String pinNo=s.nextLine();
			if(pinNo.length()==4)
			{
				PinCheck pc=new PinCheck();
				boolean k=pc.verify(Integer.parseInt(pinNo));
				if(k)
				{
					System.out.println("--Choice--");
					System.out.println("1.WithDraw \n 2.Deposit \n 3.Payment");
					System.out.println("Enter the Choice");
					int choice=Integer.parseInt(s.nextLine());
					switch(choice)
					{
					case 1: { WithDraw wd=new WithDraw();
					          System.out.println("Enter the amount");
					          int a1=Integer.parseInt(s.nextLine());
					          if(a1>0 && a1%100==0)
					          {
					        	  wd.process(a1);
					          }
					          else
					          { System.out.println("Invalid amount");  
					          }
					          break xyz;
					        }
					case 2: { Deposit d1=new Deposit();
			          System.out.println("Enter the amount");
			          int a2=Integer.parseInt(s.nextLine());
			          if(a2>0 && a2%100==0)
			          {
			        	  d1.process(a2);
			          }
			          else
			          { System.out.println("Invalid amount");  
			          }
			          break xyz;
			        }
					case 3: { Payment p1=new Payment();
			          System.out.println("Enter the amount");
			          float a3=	Float.parseFloat(s.nextLine());
			          if(a3>0)
			          {
			        	  p1.process(a3);
			          }
			          else
			          { System.out.println("Invalid amount");  
			          }
			          break xyz;
			        }
			       default :{ System.out.println("Invalid Choice");
			                  break xyz;
				            }
			        
					}
				}
				else
				{
					System.out.println("pinNo do not exist");
					count++;
				}
					
		      }
			else
			{
				System.out.println("Invalid pinNo");
				count++;
			}
            
			if(count==3)
			{
				System.out.println("Sorry Transaction Blocked");
				break xyz;
			}
	}
	
	s.close();

}
}