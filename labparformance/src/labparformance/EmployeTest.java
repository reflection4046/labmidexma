package labparformance;

public class EmployeTest {

	public static void main(String[] args) {
		
     Address address = new Address("cumilla","bd");
		
		Employe e1 = new Employe(1,"Nahid", 2200,address);
		 
		System.out.println(e1);
	}

}
