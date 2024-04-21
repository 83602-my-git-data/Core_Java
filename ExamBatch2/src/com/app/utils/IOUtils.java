package com.app.utils;

import java.io.*;
import java.util.List;
import java.util.Set;

import com.app.pojos.Address;
import com.app.pojos.Person;

public interface IOUtils {
	static void storePersonDetails(String fileName, Set<Person> person) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName)))) {
			out.writeObject(person);// serialization
		}
	}


	@SuppressWarnings("unchecked")
	static Set<Person> restorePersonDetails(String fileName) throws IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
			return (Set<Person>) in.readObject();
		}
	}

}
