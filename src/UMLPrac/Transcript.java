package UMLPrac;

public class Transcript {
	
	private Student student;
	private Course course;
	private String grade;
	
	public Transcript(Student student, Course course){
		this.student = student;
		this.course = course;
		this.student.addTranscriptToList(this); //¿·¿¡ this¿Í ¹Ø¿¡ this°¡ °°Àº Transcript °´Ã¼¸¦ °¡¸®Å²´Ù.
		this.course.addTranscriptToList(this);
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
}
