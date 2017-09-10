package UMLPrac;

import java.util.ArrayList;

public class Course {
	
	public ArrayList<Transcript> list;
	private String subject;

	public Course(String subject){
		this.subject = subject;
		list = new ArrayList<>();
	}
	
	public void addTranscriptToList(Transcript transcript){
		list.add(transcript);
	}
	
	public String getSubject(){
		return subject;
	}
}
