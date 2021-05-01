package homework03;

public class UserManager {
	
	
	public void showInfos(User user) {
		System.out.println("Bilgiler...");
		System.out.println("Id : "+ user.getId());
		System.out.println("Name : "+ user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		
	}

	
}
