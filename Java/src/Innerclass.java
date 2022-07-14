
public class Innerclass {

	class Outer{
		public void outerdisplay()
		{
			System.out.println("hiii outer display");
		}
		 class Inner{
			int a=1,b=9;
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
			public void add() {
				System.out.println(a+b);
			}
			public void add(int a)
			{
				System.out.println(a+a);
			}
		}
	}
	public static void main(String[] args) {
		
		Innerclass ob=new Innerclass();
		Outer obj=ob.new Outer();
		Innerclass.Outer.Inner objj=obj.new Inner();
     
		obj.outerdisplay();
		objj.add(10);
	}

}
