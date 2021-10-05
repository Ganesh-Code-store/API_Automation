import java.io.File;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class image_processing extends BaseClass {
	
	@Test
	public void image() throws FileNotFoundException {
		File file=(File) BaseClass.request("GET", "https://reqres.in/img/faces/8-image.jpg");
		
		File newfile=new File("E:\\"+file);
		System.out.println(file);
		
		}

}
