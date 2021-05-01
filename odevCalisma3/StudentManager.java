package odevCalisma3;

public class StudentManager {
	
	public void login (Student student) {
		System.out.println(student.id + " nolu öğrenci");
		System.out.println("Adı : "+student.studentFirstName);
		System.out.println("Soyadı : "+student.studentLastName);
	}

}
