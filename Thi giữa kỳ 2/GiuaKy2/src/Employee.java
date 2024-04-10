
public class Employee implements IEmployee {
	private String ID;
	private String FullName;
	private String Birthday;
	private String Phone;
	private String Email;
	private String Employee_type;
	private int Employee_count;

	public Employee(String iD, String fullName, String birthday, String phone, String email, String employee_type,
			int employee_count) {
		super();
		ID = iD;
		FullName = fullName;
		Birthday = birthday;
		Phone = phone;
		Email = email;
		Employee_type = employee_type;
		Employee_count = employee_count;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEmployee_type() {
		return Employee_type;
	}

	public void setEmployee_type(String employee_type) {
		Employee_type = employee_type;
	}

	public int getEmployee_count() {
		return Employee_count;
	}

	public void setEmployee_count(int employee_count) {
		Employee_count = employee_count;
	}

	@Override
	public void showInfo() {
		System.out.println("ID" + ID);
		System.out.println("FullName" + FullName);
		System.out.println("BirthDay" + Birthday);
		System.out.println("Phone" + Phone);
		System.out.println("Email" + Email);
		System.out.println("Employee_type" + Employee_type);
	}

	public static void add(Intern intern) {
		// TODO Auto-generated method stub
		Employee.add(intern);
	}

	public static void add(Fresher fresher) {
		// TODO Auto-generated method stub
		Employee.add(fresher);
	}

	public static void add(Experience experience) {
		// TODO Auto-generated method stub
		Employee.add(experience);

	}

}
