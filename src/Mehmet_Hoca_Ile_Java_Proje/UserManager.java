package Mehmet_Hoca_Ile_Java_Proje;

public class UserManager {
	public void showInfos(Student user) {
		System.out.println("Bilgiler...");
		System.out.println("Id : "+ user.getId());
		System.out.println("Name : "+ user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		
	}
}
