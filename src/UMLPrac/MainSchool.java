package UMLPrac;

import java.util.ArrayList;

public class MainSchool {

	public static void main(String[] args) {
		
		//ArrayList에 같은 객체를 넣었을 때 어떤 일이 생기는지 확인해봄, add된 수만큼 객체가 저장됨
//		JustPrac prac = new JustPrac();		
//		prac.add();
//		prac.print();
		
		//Student와 Course 클래스에서 각각 생성자를 통해 이름 저장
		Student s1 = new Student("Insup");
		Course se = new Course("Software Engineering");
		Course ma = new Course("Math");
		Course ko = new Course("Korean");		
		Student s2 = new Student("Jung");		
		
		/*Transcript 클래스에는 Student와 Course의 객체를 각각 받아 같은 ArrayList 객체에 저장한다.
		 * 만약 생성자가 없다면 이런식으로 표현해야 할것이다.
		 * 
		 * t1.s1.addTranscriptToList(this);
		 * t1.se.addTranscriptToList(this);
		 */		
		Transcript t1 = new Transcript(s1, se); //객체를 생성하는 과정 만으로도 Student와 Course의 ArrayList에 이 Transcript 객체가 저장된다.
		t1.setGrade("A+");
		
		Transcript t2 = new Transcript(s1, ma);
		t2.setGrade("A");
		
		Transcript t3 = new Transcript(s2, ma);
		t3.setGrade("B");
		
		Transcript t4 = new Transcript(s1, ko);
		t4.setGrade("C");
		
		for(Transcript tr : s1.list){
			System.out.println(tr.getStudent().getName());
			System.out.println(tr.getCourse().getSubject());
			System.out.println(tr.getGrade());
		}
		
		ArrayList<Course> courselist;
		courselist = s1.getCoursesfromStd();
		
		for(Course course : courselist){
			System.out.println(course.getSubject());
		}
		
		
	}
}
