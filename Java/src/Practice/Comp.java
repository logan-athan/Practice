package Practice;

import java.util.ArrayList;
import java.util.Collections;

 class studd implements Comparable<studd> {
	String name;
	int mark,rollno;
	public studd(String name, int mark, int rollno) {
		super();
		this.name = name;
		this.mark = mark;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "studd [name=" + name + ", mark=" + mark + ", rollno=" + rollno + "]";
	}
	@Override
	public int compareTo(studd o) {
		// TODO Auto-generated method stub
		return mark<o.mark?1:-1;
	}
	
	
}
public class Comp {

	public static void main(String[] args) {
		
	
		ArrayList<studd> al=new ArrayList<>();
		al.add(new studd("logu",101,101));
		al.add(new studd("loga",102,101));
		al.add(new studd("logii",103,101));

		ArrayList<Student> stu=new ArrayList<>();
		stu.add(new Student("logu",101,101));
		stu.add(new Student("loga",102,101));
		stu.add(new Student("logii",103,101));
		
		ArrayList<Integer> all=new ArrayList<>();
		all.add(1);
		Collections.sort(al);
		
        for(studd each:al) {
			
			System.out.println(each.toString());
		}
Collections.sort(stu);
		
        for(Student each:stu) {
			
			System.out.println(each.toString());
		}
}
}