package packagePerson;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Student student = new Student("Alice", "123 Main St", "Computer Science", 2, 1500.0);
        System.out.println(student);

        Staff staff = new Staff("Bob", "456 Elm St", "High School", 3000.0);
        System.out.println(staff);
    }
}