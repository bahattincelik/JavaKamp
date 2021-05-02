package homework03;

public interface UserManager {

	User user = new User();
	
	public default void showInfos(){
		System.out.println(user.getId());
		System.out.println(user.getFirstName()+" "+user.getLastName());
	};
	
	

			
}
