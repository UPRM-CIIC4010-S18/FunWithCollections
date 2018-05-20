
public class Student implements Comparable<Student> {
	
	private String id;
	private String firstName;
	private String lastName;
	private double gpa;

	public Student(String id, String firstName, String lastName, double gpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public double getGpa() {
		return gpa;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			return this.getId().equals(s.getId());
		}
		return false;
	}
	
	public int compareTo (Student s) {
		return this.getId().compareTo(s.getId());
	}

	public String toString() {
		return ( "Student{" +
				this.id + "," +
				this.firstName + "," +
				this.lastName + "," +
				this.gpa + "}");
	}
}
