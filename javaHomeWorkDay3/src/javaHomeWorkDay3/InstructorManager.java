package javaHomeWorkDay3;

public class InstructorManager extends UserManager{

public void add(Instrustor instrustor) {
		
	System.out.println("Id : "+instrustor.getId()+" E�itmen No :"+instrustor.getInstructorNo()+" Ad� : "+instrustor.getFirstName()+" "+instrustor.getLastName()+" Mail Adresi : "+instrustor.getEmail());
		
	}
	
	public void addMultiple(Instrustor[] instrustors) {
		
		for (Instrustor instrustor : instrustors) {
			
			add(instrustor);
		}
	}
	
	public void getAll(Instrustor[] instrustors) {
		

		for (Instrustor instrustor : instrustors) {
			
			System.out.println("Id : "+instrustor.getId()+" E�itmen No :"+instrustor.getInstructorNo()+" Ad� : "+instrustor.getFirstName()+" "+instrustor.getLastName()+" Mail Adresi : "+instrustor.getEmail());
		}
		
	}
}
