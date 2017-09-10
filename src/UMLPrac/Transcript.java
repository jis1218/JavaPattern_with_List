package UMLPrac;

public class Transcript {
	
	private Student student;
	private Course course;
	private String grade;
	
	public Transcript(Student student, Course course){
		this.student = student;
		this.course = course;
		this.student.addTranscriptToList(this); //���� this�� �ؿ� this�� ���� Transcript ��ü�� ����Ų��.
		this.course.addTranscriptToList(this); //���� course.addTrans...(this)�� �ʿ� ���� ���� �Լ��� ������ ����� ���´�. �ֳĸ� �̹� �� ��ü�� Student�� Course ������ �� �� �ֱ� �����̴�.
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
