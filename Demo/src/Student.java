
public class Student implements Comparable<Student> {
	
	private int number;
	private String name;
	
	
	
	public Student(int number,String name) {
		this.name = name;
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Department [name=" + name + ", number=" + number + "]";
	}


	@Override
	public int compareTo(Student o) {
		//return this.getName().compareTo(o.getName());
	    //return  o.getNumber() - (this.getNumber());
		if((this.getNumber() - (o.getNumber()))==0)
			return o.getName().compareTo(this.getName());
		return  this.getNumber() - (o.getNumber());
		
	}

	
}
