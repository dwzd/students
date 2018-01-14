package AdminStudents;

//The information of students
public class Student {
	private String id;
	private String name;
	private String cellPhone;
	
	public Student() {
		
	}
	
	public Student(String id, String name, String cellPhone) {
		this.id = id;
		this.name = name;
		this.cellPhone = cellPhone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.id + ", " + this.name + ", " + this.cellPhone + ")";
	}
	
	

}
