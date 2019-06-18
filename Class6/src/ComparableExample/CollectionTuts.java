package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTuts {
		
	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,72));
		studs.add(new Student(2,63));
		studs.add(new Student(3,46));
		studs.add(new Student(4,89));
		studs.add(new Student(5,89));
		
		Collections.sort(studs);
		
		for(Student s: studs) {
			System.out.println(s);
		}
	}
	
	
}

class Student implements Comparable<Student>{
	int rollNo;
	int marks;
	
	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
	}
	
	
	
}
