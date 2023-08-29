package in.lakshmi;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IoStreamChanges {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     /*FileReader fr = new FileReader(new File("into.txt"));
      BufferedReader br = new BufferedReader(fr);
      String line = br.readLine();
      
      while(line!=null) {
    	  System.out.println(line);
    	  line = br.readLine();
      }
      br.close();*/
      
      String filename = "into.txt";
      
      try(Stream<String> stream = Files.lines(Paths.get(filename))){
    	  stream.forEach(s->System.out.println(s));
    	  
      }catch(Exception e){
    	  e.printStackTrace();
      }
      
      
	}

}
