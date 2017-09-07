package UMLPrac;

import java.util.ArrayList;

public class MainSchool {

	public static void main(String[] args) {
		
		Student s1 = new Student("Insup");
		Course se = new Course("Software Engineering");
		
		Transcript t1 = new Transcript(s1, se);
		t1.setGrade("A+");
		
		
		
		for(Transcript tr : s1.list){
			System.out.println(tr.getStudent().getName());
			System.out.println(tr.getCourse().getSubject());
			System.out.println(tr.getGrade());
		}

	}
	
//	public ArrayList<Course> getList(){
//		ArrayList<Course> list = new ArrayList<>();
//		Iterator<Transcript> iter = 
//	}
	
	

}
