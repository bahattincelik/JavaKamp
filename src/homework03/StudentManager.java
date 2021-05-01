package homework03;

public class StudentManager extends UserManager{

	@Override
	public void showInfos(User user) {
		System.out.println("Bilgiler...");
		System.out.println("Id : "+ user.getId());
		System.out.println("Name : "+ user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		System.out.println("Email : " + );
	}

}
