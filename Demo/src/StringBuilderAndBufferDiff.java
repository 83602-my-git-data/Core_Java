
public class StringBuilderAndBufferDiff {

	public static void main(String[] args) {
     StringBuilder sb1 = new StringBuilder();
    StringBuffer sb2 = new StringBuffer();

    //create two threads that modifies the same string builder and Buffer instance
    Thread t1 = new Thread(() -> {
       for(int i=0;i<1000;i++){
        // sb1.append("a");
         sb2.append("a");
       }
    });

    Thread t2 = new Thread(() ->{
       for(int i=0;i<1000;i++){
        // sb1.append("b");
         sb2.append("b");
       }
    });

    //start the both threads
    t1.start();
    t2.start();
    //wait for both threads to finish
    try{
      t1.join();
      t2.join();
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    //print the final string builder and buffer result
   // System.out.println("String Builder: "+sb1.toString().length());
    System.out.println("String Buffer: "+sb2.toString().length());
  }
}