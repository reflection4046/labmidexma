package labparformance;

public class Student extends person {
	public int id;
	public double cgpa;
	
	public Student() {
		super("nahid",12);
	}
	
	

	public Student(int id, double cgpa, String name, int age) {
		super(name, age);
		this.id = id;
		this.cgpa = cgpa;
		
		
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

    public double getCgpa() {
		return cgpa;
	}

 	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", cgpa=" + cgpa + "]";
	}

    void show() {
    	super.showinfo();
		System.out.println("ID :"+id);
		System.out.println("CGPA :"+cgpa);
    }

}





