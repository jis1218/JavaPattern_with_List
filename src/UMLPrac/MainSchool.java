package UMLPrac;

import java.util.ArrayList;

public class MainSchool {

	public static void main(String[] args) {
		
		//ArrayList�� ���� ��ü�� �־��� �� � ���� ������� Ȯ���غ�, add�� ����ŭ ��ü�� �����
//		JustPrac prac = new JustPrac();		
//		prac.add();
//		prac.print();
		
		//Student�� Course Ŭ�������� ���� �����ڸ� ���� �̸� ����
		Student s1 = new Student("Insup");
		Course se = new Course("Software Engineering");
		Course ma = new Course("Math");
		Course ko = new Course("Korean");		
		Student s2 = new Student("Jung");		
		
		/*Transcript Ŭ�������� Student�� Course�� ��ü�� ���� �޾� ���� ArrayList ��ü�� �����Ѵ�.
		 * ���� �����ڰ� ���ٸ� �̷������� ǥ���ؾ� �Ұ��̴�.
		 * 
		 * t1.s1.addTranscriptToList(this);
		 * t1.se.addTranscriptToList(this);
		 */		
		Transcript t1 = new Transcript(s1, se); //��ü�� �����ϴ� ���� �����ε� Student�� Course�� ArrayList�� �� Transcript ��ü�� ����ȴ�.
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
