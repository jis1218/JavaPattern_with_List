package UMLPrac;

public class Transcript {
	
	private Student student;
	private Course course;
	private String grade;
	
	public Transcript(Student student, Course course){
		this.student = student;
		this.course = course;
		this.student.addTranscriptToList(this); //옆에 this와 밑에 this가 같은 Transcript 객체를 가리킨다.
		this.course.addTranscriptToList(this); //굳이 course.addTrans...(this)할 필요 없이 위에 함수만 돌려도 결과는 나온다. 왜냐면 이미 한 객체에 Student와 Course 정보가 다 들어가 있기 때문이다.
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
