package Mehmet_Hoca_Ile_Java_Proje;

public class InstructorManager extends UserManager {
	
	@Override
	public void showInfos(User user) {
		// TODO Auto-generated method stub
		super.showInfos(user);
		System.out.println("Ucreti : " );
		System.out.println("Egitmen eklendi");
	}
}
