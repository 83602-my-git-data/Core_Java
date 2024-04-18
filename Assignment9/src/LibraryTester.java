import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class LibraryTester {

	public static void main(String[] args) {
		// , category(enum), price(double), authorName(string),
		// quantity(int)
		ArrayList<Library> library = new ArrayList<>();
		// STORY(500), CODEING(1000);
							//key -isbn(string)
		library.add(new Library("abc-1234", "STORY", 3456+Category.valueOf("STORY").getCategoryValue(), "Honda", 5));
		library.add(new Library("abc-1230", "CODEING", 4456, "Honda", 4));
		library.add(new Library("abc-1233", "STORY", 378, "Honda", 1));
		library.add(new Library("abc-1238", "STORY", 5678, "Maruti", 3));
		library.add(new Library("abc-1239", "CODEING", 568, "Honda", 7));
		library.add(new Library("abc-1231", "CODEING", 78, "Maruti", 2));
		library.add(new Library("abc-1232", "CODEING", 678, "Honda", 9));
		library.add(new Library("abc-1240", "STORY", 3678, "Maruti", 5));
		
		
		 Category cb  = Category.valueOf("codeing".toUpperCase());
		  System.out.println(cb);
		  System.out.println();
		for(Category c : Category.values())
			System.out.println(c);
		
		
		HashMap<String, Library> hashmap = new HashMap<>();
		for (Library p : library)
			hashmap.put(p.getIsbn(), p);
		
		
		System.out.println();
		
		hashmap.forEach((k, v) -> System.out.println("key -- " + k + " value-- " + v));
		System.out.println();
		
		if (hashmap.containsKey("abc-1240"))
			System.out.println(hashmap.get("abc-1240"));
          
		System.out.println("*****by using functional programming using Comparable*******");
		
		
		hashmap.values().stream().sorted().forEach(System.out::println);
		
		System.out.println("*****by using functional programming using Comparator*******");
		
		hashmap.values().stream().sorted((a,b)->a.getCategory().name().compareTo(b.getCategory().name())).forEach(System.out::println);
          
      System.out.println("**************************************************");
		List<Library> list = new ArrayList<>(hashmap.values());
		System.out.println();
		System.out.println("*********************by Authors****************************");
		Collections.sort(list,(a,b) ->{
               return a.getAuthorName().compareTo(b.getAuthorName());
        });
		
		
		list.forEach(p-> System.out.println(p));
		System.out.println();
		System.out.println("*********************by Quantity****************************");
		Collections.sort(list,(a,b) ->{
            return a.getQuantity()-(b.getQuantity());
     });	
		list.forEach(p-> System.out.println(p));
		System.out.println();
		System.out.println("*********************by Category****************************");
		Collections.sort(list,(a,b) ->{
               return -a.getCategory().compareTo(b.getCategory());
        });
		
		 
		Collections.sort(list,new Catesort());
		
		list.forEach(p-> System.out.println(p));
		System.out.println();

	}

}

class Catesort implements Comparator<Library>{

	@Override
	public int compare(Library o1, Library o2) {
		return o1.getCategory().compareTo(o2.getCategory());
	}
	
}
