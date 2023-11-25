package Access_Modifier;
// Encapsulation Concept

class Account{
	public String name;
	
	/// default
	   String prn;
	   
//	   protected
	   protected String email;
	   
//	  private
	   private String password;

//	   To Access the Private method Used getter/setter method
	   
	   public String getPassword() {
		   return this.password;
	   }
	   
	   //setter to Set the Password
	   public void setPassword(String pass) {
		   this.password=pass;
	   }
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1=new Account();
		acc1.name="Shradha";
		acc1.email="ravikumar@gmail.com";
		System.out.println("Name:"+acc1.name);
		System.out.println("Email:"+acc1.email);
//		acc1.password="R117";  Not Access Without getter & setter
		// TO set the password
		acc1.setPassword("R117");
		// to get the Password
		System.out.println("Password:"+acc1.getPassword());
		

	}

}
