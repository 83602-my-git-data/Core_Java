class Wheel {
	double diameter;
	double width;

	public Wheel() {
		// TODO Auto-generated constructor stub
	}

	public Wheel(double diameter, double width) {
		this.diameter = diameter;
		this.width = width;
	}


	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", width=" + width + "]";
	}

}

class Car implements Cloneable {
	String company;
	String number;
	Wheel wheel;

	public Car() {
	}

	public Car(String company, String number, double diameter, double width) {
		this.company = company;
		this.number = number;
		this.wheel = new Wheel(diameter, width);
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", number=" + number + ", wheel=" + wheel + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// this-> c1;
		// to perform deep copy implement clone method.
		// perform the copy of the objects manually
		Car c =  (Car) super.clone();
		c.wheel = new Wheel();
		c.wheel.diameter = this.wheel.diameter;
		c.wheel.width = this.wheel.width;
		return c;
	}

}
public class CloneDemo {

	public static void main(String[] args) {
		Car c1 = new Car("car1", "mh101234", 20, 300);
		Car c2 = null;
		try {
			c2 = (Car) c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(c1);
		System.out.println(c2);

		System.out.println("After change in c2 wheels");
		c2.wheel.diameter = 30;
		c2.wheel.width = 250;
		System.out.println(c1);
		System.out.println(c2);
	}

}
