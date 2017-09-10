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
	
	//Student ��ü�� 
	public ArrayList<Course> getCoursesfromStd(){
		ArrayList<Course> courses = new ArrayList<>(); //Course ��ü�� ���� ArrayList�� �����
		Iterator<Transcript> itor = list.iterator(); //Student ��ü�� ArrayList�� ����� Transcript ��ü�� Iterator�� �Ѱ���
		
		while(itor.hasNext()){
			Transcript tr = itor.next(); //itor�� �ִ� Transcript ��ü�� �Ǵٸ� Transcript ������ �����
			courses.add(tr.getCourse());
		}
		
		for(Transcript tr : list){
			
			courses.add(tr.getCourse());
			
		}
		
		return courses;
	}
}
