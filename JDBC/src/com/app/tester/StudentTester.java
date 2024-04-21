package com.app.tester;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.dao.StudentDao;
import com.app.entity.Mobile;
import com.app.entity.Student;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Mobile> mb = new ArrayList<>();

		mb.add(new Mobile("Note 3 N9000", "Samsung", 47900));
		mb.add(new Mobile("Xperia Z1", "Sony", 41599));
		mb.add(new Mobile("G2", "LG", 40490));
		mb.add(new Mobile("Lumia 1020", "Nokia", 49999));
		mb.add(new Mobile("Xperia C", "Sony", 20460));
		mb.add(new Mobile("Desire 500", "HTC", 21490));
		mb.add(new Mobile("Trend S7392", "Samsung", 8490));
		mb.add(new Mobile("Xperia M", "Sony", 12499));
		mb.add(new Mobile("Xperia C", "Sony", 21679));
		
		try(StudentDao std = new StudentDao();
		Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter the name , marks , mobile no ");
//			std.insertStudent(new Student(sc.next(), sc.nextDouble(),sc.nextLine()));
			
			std.allStudent().forEach(System.out::println);
//			std.deleteStudentById(8);
//			System.out.println(std.studentById(1));
	//		System.out.println("*************************Mobile*************************************");
//			mb.forEach(System.out::println);
//			std.insertAllMobile(mb);
			
				
		} catch (SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
