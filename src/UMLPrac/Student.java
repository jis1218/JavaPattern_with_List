package UMLPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	
	public ArrayList<Transcript> list;
	private String name;
	
	public Student(String name){
		this.name = name;
		list = new ArrayList<>();
	}
	
	public void addTranscriptToList(Transcript transcript){
		list.add(transcript);
	}

	public String getName() {
		return name;
	}
	
	//Student 객체의 
	public ArrayList<Course> getCoursesfromStd(){
		ArrayList<Course> courses = new ArrayList<>(); //Course 객체를 담을 ArrayList를 만들고
		Iterator<Transcript> itor = list.iterator(); //Student 객체의 ArrayList에 저장된 Transcript 객체를 Iterator에 넘겨줌
		
		while(itor.hasNext()){
			Transcript tr = itor.next(); //itor에 있는 Transcript 객체를 또다른 Transcript 변수에 담아줌
			courses.add(tr.getCourse());
		}
		
		for(Transcript tr : list){
			
			courses.add(tr.getCourse());
			
		}
		
		return courses;
	}
}
