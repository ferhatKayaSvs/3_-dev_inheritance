package odevCalisma3;

public class Main {

	public static void main(String[] args) {
       User user = new User();
       user.id=1453;
		
       Student student=new Student();
       student.id=2146;
       student.studentFirstName="Ferhat";
       student.studentLastName="KAYA";
       
       Instructor instructor = new Instructor();
       instructor.id=user.id;
       instructor.instructorFirstName="Emre";
       
       UserManager userManager = new UserManager();
       userManager.login(user);
       
       InstructorManager instructorManager = new InstructorManager();
       instructorManager.login(instructor);
       
       StudentManager studentManager = new StudentManager();
       studentManager.login(student);
       

	}

}
