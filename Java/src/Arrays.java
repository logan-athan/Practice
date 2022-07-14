import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int in = scan.nextInt();
	        double d=scan.nextDouble();
	       String s=scan.nextLine();
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + in);
     int a[]= {1,2,3,4,5};
    
     for(int i:a)
     {
    	 
    	 //System.out.print(" "+i);
     }
     System.out.println();
     int aa[][]= {
    		 {1,2,3,4,5},
    		 {6,7,8,9,10},
    		 {11,12,13,14,15}};
     
     for(int x[]:aa) {
    	 for(int y:x)
    	 {
    		 System.out.print(" "+y);
    	 }
    	 System.out.println();
     }
     }
	}


