
public class Experience extends Employee {
	private int ExpInYear;
	private String ProSkill;

	public Experience(String iD, String fullName, String birthday, String phone, String email, String employee_type,
			int employee_count, int expInYear, String proSkill) {
		super(iD, fullName, birthday, phone, email, employee_type, employee_count);
		this.ExpInYear = expInYear;
		this.ProSkill = proSkill;
	}

	@Override
	public void showInfo() {
		System.out.println("ExpInYear" + ExpInYear);
		System.out.println("ProSkill" + ProSkill);
	}

}
