
public class Intern extends Employee {
	private String Majors;
	private String Semmester;
	private String University_name;

	public Intern(String iD, String fullName, String birthday, String phone, String email, String employee_type,
			int employee_count, String majors, String semmester, String university_name) {
		super(iD, fullName, birthday, phone, email, employee_type, employee_count);

	}

	@Override
	public void showInfo() {
		System.out.println("Majors" + Majors);
		System.out.println("Semmester" + Semmester);
		System.out.println("University_name" + University_name);
	}

}
