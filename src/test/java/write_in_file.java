import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class write_in_file {
	
	String res="Ganesh";
	@Test
	public void write() throws FileNotFoundException
	{
		PrintWriter out = new PrintWriter("F:\\RestAssured\\src\\main\\resources\\responses.txt");
        out.println(res);
       
        out.close();
	}

}
