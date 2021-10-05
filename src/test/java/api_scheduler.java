import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class api_scheduler extends BaseClass {
	
	@Test
	public void schedule() throws FileNotFoundException, InterruptedException
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter url :");
		String url=sc.next();
		System.out.println();
		
		System.out.println("Enter method :");
		String method=sc.next();
		
		
		System.out.println();

		
		System.out.println("Enter time lap(Minutes) :");
		int time=sc.nextInt();
		
		
		for(int i=0;i>-1;i++)
		{
			Thread.sleep(time*60000);
			response=BaseClass.request(method, url);
			System.out.println();
				
			System.out.println(i+" Iteration response--------->");
			

			System.out.println(response.asString());
			continue;

		}
		
		
	}

}
