package Practice;

public class Student implements Comparable<Student> {

	
     String name;
      int rollno,mark;
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student(String name, int rollno, int mark) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", mark=" + mark + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return rollno>o.rollno?1:-1;
	}
	
	
	
	
	
}
