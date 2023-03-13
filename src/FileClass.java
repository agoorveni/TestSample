import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileClass {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Wiley\\Feb\\11.2\\details.txt");
		
boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		List<String> text = FileUtils.readLines(f);
		
		System.out.println(text);
		
		for (String itr : text) {
			System.out.println(itr);
		}
		
		//FileUtils.write(f, "Hi everyone", true);
		
//		
//		File[] lf = f.listFiles();
//		
//		for (int i = 0; i < lf.length; i++) {
//			System.out.println(lf[i]);
//			
//		}
//		
//		
//		
//		String[] lst = f.list();
//		for (int i = 0; i < lst.length; i++) {
//			System.out.println(lst[i]);
			
		}
//		
//		List<String> readLines = FileUtils.readLines(f);
//	
//	for (String itr : readLines) {
//		System.out.println(itr);
//	}
	
	
	}
	
	
	
	

