package odevCalisma3;

public class StudentManager {
	
	public void login (Student student) {
		System.out.println(student.id + " nolu ��renci");
		System.out.println("Ad� : "+student.studentFirstName);
		System.out.println("Soyad� : "+student.studentLastName);
	}

}
