
abstract class Writer
{
	public void write(){
		System.out.println("you can write....");
	}
	public abstract void done();
}
class Pen extends Writer
{
	public void done(){
		System.out.println("you can write with pen....");
	}
}
class Pencil extends Writer
{
	public void done(){
		System.out.println("you can write with pencil....");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Writer obj1=new Pen();
     Writer obj2=new Pencil();
     obj1.write();
     obj2.write();
     obj1.done();
     obj2.done();
	}

}
