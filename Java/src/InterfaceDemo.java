interface infa{
	void display();
}
class Cla implements infa{
	public void display() {
		System.out.println("hii display me in interface class");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      infa obj= () ->
			System.out.println("hiiiiiii display");
		
	obj.display();
	infa claobj=new Cla();
	claobj.display();
	}

}
