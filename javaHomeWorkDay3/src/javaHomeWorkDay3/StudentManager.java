package javaHomeWorkDay3;

public class StudentManager extends UserManager {

	
	public void add(Student student) {
		
		System.out.println("Id : "+student.getId()+" E�itmen No :"+student.getStudentNo()+" Ad� : "+student.getFirstName()+" "+student.getLastName()+"  Mail Adresi :"+student.getEmail());
		
	}
	
	public void addMultiple(Student[] students) {
		
		System.out.println("Eklenen �grenci Listesi");
		for (Student student : students) {
			
			add(student);
		}
	}
	
	public void getAll(Student[] students) {
		
		for (Student student : students) {
			
			System.out.println("Id : "+student.getId()+" E�itmen No :"+student.getStudentNo()+" Ad� : "+student.getFirstName()+" "+student.getLastName()+"  Mail Adresi :"+student.getEmail());
		}
		
	}
	
}
