package labparformance;

public class Employe {
	int id;
	String name;
	double salary;
	Address address;// Employe has a address
	
	public Employe(int id, String name,double salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}


}
