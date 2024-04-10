
public class Fresher extends Employee {
	private String Graduation_date;
	private String Graduation_rank;
	private String Education;

	public Fresher(String iD, String fullName, String birthday, String phone, String email, String employee_type,
			int employee_count, String graduation_date, String graduation_rank, String education) {
		super(iD, fullName, birthday, phone, email, employee_type, employee_count);
		this.Graduation_date = graduation_date;
		this.Graduation_rank = graduation_rank;
		this.Education = education;

	}

	@Override
	public void showInfo() {
		System.out.println("Graduation_date" + Graduation_date);
		System.out.println("Graduation_rank" + Graduation_rank);
		System.out.println("Education" + Education);
	}

}
