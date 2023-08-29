package in.lakshmi;
import java.io.*;

public class demo  {
	public static void main(String[] args) throws IOException {
		FileWriter  fw = new FileWriter("java.txt");
		fw.write("Hi, good evening");
 
		fw.write("\n");  // it represents new line

		fw.write("How are you?");
		fw.write("\n"); 
        fw.write("ahnsbsdf sdjshjdsjd ajdsjdhs dsdjshd");
        fw.write("\n"); 
        fw.write("sjdsjhf sdhsdjs sdbsd"); 
		fw.flush ( );

		fw.close( ) ;
		
		

			FileReader fr = new FileReader ("java.txt");
			int  i = fr.read ( );

			while ( i != -1 ){
				System.out.print( (char) i );
				i = fr.read ( );	// read next character and re-initialize i var
			}
			fr.close ( );
			
			
			FileReader fr1 = new FileReader("abc.txt");

			BufferedReader br = new BufferedReader(fr1);

			String line = br.readLine ( ); // reading first line data

			while ( line != null ) {
				System.out.println( line );		
				line = br.readLine ( ) ; // reading next line and re-initialzing line variable
			}
			
			PrintWriter pw = new PrintWriter(System.out);
			pw.print("hi");
			pw.println("hello");
			pw.flush();
			pw.close();
	}
	
	
}
