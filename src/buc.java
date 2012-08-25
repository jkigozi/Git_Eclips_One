import java.io.*;


public class buc {

	
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String nam = br.readLine();
		
		System.out.println("Welcome "+nam);
		 

	}

}
