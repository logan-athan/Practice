	class A{
		public A()
		{
			System.out.println("in ....A");
		}
		public A(int a)
		{
			System.out.println(a);
		}
	}
	class B extends A{
		public B()
		{
			System.out.println("in ....B");
		}
		public B(int a)
		{super( a);
			System.out.println(a);
		}
	}
	public class SuperR {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			B ob=new B(2);
			
		}

	}

