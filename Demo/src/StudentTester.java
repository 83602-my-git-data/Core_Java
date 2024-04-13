import java.util.Arrays;

public class StudentTester {

	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		
		student[0] = new Student(2, "Prashant");
		student[1] = new Student(1, "Rahul");
		student[2] = new Student(3, "Pratik");
		student[3] = new Student(5, "Onkar");
		student[4] = new Student(3, "Vrushab");
		
		System.out.println("Arrays ::");
		
		for(Student s : student)
			System.out.println(s);
		
		Arrays.sort(student);
		
		System.out.println("sorting Arrays ::");
		
		for(Student s : student)
			System.out.println(s);

	}

}
