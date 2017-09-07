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
	
//	public ArrayList<Course> getCourses(){
//		ArrayList<Course> courses = new ArrayList<>();
//		Iterator<Transcript> itor = list.iterator();
//	}
}
