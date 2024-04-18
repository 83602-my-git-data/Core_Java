package com.app.utils;

import java.io.*;
import java.util.ArrayList;

import com.app.pojos.Student;

public interface StudentFile {

	static void saveFile(ArrayList<Student> list) throws FileNotFoundException, IOException {

		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:/Users/91935/Desktop/sunbeam git/git/Core_Java/Project1/student.txt"))) {
			//"C:/Users/91935/Desktop/sunbeam git/git/Core_Java/Project1/student.txt"
			obj.writeObject(list);
			

		}
	}

	
	static ArrayList<Student> readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
			ArrayList<Student> list = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/91935/Desktop/sunbeam git/git/Core_Java/Project1/student.txt"))) {
			list.addAll((ArrayList<Student>) in.readObject());
		  return list;
		  
		}
	}
}
