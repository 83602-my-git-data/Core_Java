package com.app.Tester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.app.customException.CustomException;
import com.app.pojos.Student;
import com.app.utils.StudentFile;
import com.app.utils.StudentsUtils;

public class StudentTester {

	public static void main(String[] args) {
		
		try {
			ArrayList<Student> student =StudentFile.readFile();
			
					student.addAll(StudentsUtils.PopulatedList());
					
		  Student stu = student.get(0);
		  
		 System.out.println(stu.equals(new Student(3)));
		   
		   
			for(Student s : student)
				System.out.println(s);
			
			if(StudentsUtils.checkForDuplicates(10,student))
				 System.out.println("Student is exits>>>>>>");
			else
				System.out.println("Student is not exits>>");
			
			System.out.println("************************ shuffle method in collections *********************************");
			Collections.shuffle(student);
			student.forEach(p->System.out.println(p));
			
			System.out.println("************************ by ROLL NO *********************************");
			Collections.sort(student,(a,b)->  a.getRoll()-b.getRoll());
			student.forEach(p->System.out.println(p));
			
			System.out.println();
			
			System.out.println("*********************** By Marks **********************************");
			Collections.sort(student,(a,b)-> (int)(a.getMarks()-b.getMarks()));
		 //	Collections.sort(student,(a,b)-> Double.compare(a.getMarks(),b.getMarks()));
			student.forEach(p->System.out.println(p));
			
			System.out.println();
			
			System.out.println("************************ By city *********************************");
			Collections.sort(student,(a,b)->  a.getCity().compareTo(b.getCity()));
			student.forEach(p->System.out.println(p));
			
			System.out.println();
			
			System.out.println("************************By Name*********************************");
			Collections.sort(student,(a,b)->  a.getName().compareTo(b.getName()));
			student.forEach(p->System.out.println(p));
			
			System.out.println();
			
			System.out.println("************************By Dates*********************************");
			Collections.sort(student,(a,b)->  -a.getDateOfAdimission().compareTo(b.getDateOfAdimission()));
			student.forEach(p->System.out.println(p));
			
			StudentFile.saveFile(student);
			
		
		} catch (CustomException | IOException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
