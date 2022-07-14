

class Abc
{
	 int i=10;
	public void show1( )
	{   
		
		System.out.println(i);
	}
}
class Abcd extends Abc
{
	 int i=11;
		public  final void show1( )
		{   
			
			System.out.println(""+i);
		}
		public   void show( )
		{   
			
			System.out.println(i);
		}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Abc inn=new Abcd();
  
   inn.show1();
   
	}

}
