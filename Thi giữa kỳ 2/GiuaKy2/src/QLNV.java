import java.util.Scanner;

public class QLNV {
	private static final String employee_type = null;
	private static int employee_count;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLNV system = new QLNV();

       
        System.out.println("Nhập thông tin cho nhân viên:");
        System.out.print("ID: ");
        String ID = scanner.nextLine();
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Birthday: ");
        String birthDay = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Employee Type (Experience/Fresher/Intern): ");
        String employeeType = scanner.nextLine();

        if ("Experience".equalsIgnoreCase(employeeType)) {
            System.out.print("ExpInYear: ");
            int expInYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("ProSkill: ");
            String proSkill = scanner.nextLine();
            Experience experience = new Experience(ID, fullName, birthDay, phone, email, proSkill, expInYear, expInYear, proSkill);
            system.addEmployee(experience);
        } else if ("Fresher".equalsIgnoreCase(employeeType)) {
            System.out.print("Graduation Date: ");
            String graduationDate = scanner.nextLine();
            System.out.print("Graduation Rank: ");
            String graduationRank = scanner.nextLine();
            System.out.print("Education: ");
            String education = scanner.nextLine();
            Fresher fresher = new Fresher(ID, fullName, birthDay, phone, email,employee_type,employee_count, graduationDate, graduationRank, education);
            system.addEmployee(fresher);
        } else if ("Intern".equalsIgnoreCase(employeeType)) {
            System.out.print("Majors: ");
            String majors = scanner.nextLine();
            System.out.print("Semester: ");
            String semester = scanner.nextLine();
            System.out.print("University Name: ");
            String universityName = scanner.nextLine();
            Intern intern = new Intern(ID, fullName, birthDay, phone, email,employee_type, employee_count,majors, semester, universityName);
            system.addEmployee(intern);
        } else {
            System.out.println("Invalid employee type.");
        }

        
        System.out.println("Thông tin nhân viên mới:");
        system.showAllEmployees();

        scanner.close();
    }

	private void showAllEmployees() {
		
		
	}

	private void addEmployee(Intern intern) {
		 Employee.add(intern);
		
	}

	private void addEmployee(Fresher fresher) {
		
		 Employee.add(fresher);
	}

	private void addEmployee(Experience experience) {
		 Employee.add(experience);
		
	}
}