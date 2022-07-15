import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDem0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("enter number 1");
			int i=Integer.parseInt(br.readLine());
			System.out.println("enter number 2");
			int j=Integer.parseInt(br.readLine());
			int result=i/j;
			System.out.println("Result is "+ result);
			throw new loguException("User defined exception");
		
		} 
		catch (loguException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
		finally {
			System.err.println("bye");
		}
		
		
	}

}
