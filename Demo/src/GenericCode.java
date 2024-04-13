
class Time<sham>{
	private sham obj;

	Time(){
		
	}
	
	Time(sham s){
		this.obj = s;
	}
	public sham getObj() {
		return obj;
	}

	public void setObj(sham obj) {
		this.obj = obj;
	}
	
	public <sham > void printName(sham str){
		System.out.println(str);
	}

	@Override
	public String toString() {
		return "Time [obj=" + obj + "]";
	}
	public void display(Time<? extends Number> b) {
		Object obj = b.getObj();
		System.out.println("obj - " + obj);
	}
	
	public  void display1(Time<? super Character> b) {
		System.out.println("Obj - "+b.getObj());
	}
	
	public void display2(Time<? extends Number> b) {
		Object obj = b.getObj();
		System.out.println("obj - " + obj);
	}
	
	public static <s> void displayArray(s[] arr){
		System.out.println("Array Prints :: ");
		for(s str : arr) 
			System.out.println(str);
	}
	
}

public class GenericCode {
   
	public static void main(String[] args) {

    	Time<StringBuilder> t = new Time<>();
        System.out.println(t.getObj()+" :: "+t.toString());
        
        t.setObj(new StringBuilder("Sham"));
         StringBuilder obj = t.getObj();
        System.out.println(t.getObj()+" :: "+t.toString());
        
        t.<Integer>printName(10000);
        t.printName(new StringBuffer("shamgirhe"));
        
        Time<Integer> i =new Time<>(10000);
        t.display(i);
        
        t.display1(new Time<>("abcdefghi"));
        
        Integer [] arr = {1,2,3,4,5,6,7,8,9};
        Time.displayArray(arr);
        String [] arr1 = {"Nutan","Dipali","Ram","Sham"};
        Time.displayArray(arr1);
        
	}
    
}
