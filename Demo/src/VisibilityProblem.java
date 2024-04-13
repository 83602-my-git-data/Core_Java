
public class VisibilityProblem {

	public static void main(String[] args) {
		sharedRessource sr = new sharedRessource();
		// thread 1
		new Thread(() -> {
			System.out.println("Thread 1 stared");
			try {
				System.out.println("Thread 1 logic stared");
				Thread.sleep(1000);
				System.out.println("Thread 1 logic completed.");
				sr.setFlag(true);
				System.out.println("Flag set by Threade 1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		// thread 2
		new Thread(() -> {
			System.out.println("Thread 2 stared");
			while (!sr.getFlag()) {
				// it will run until flag value is true
				System.out.println("In while loop");
			}
			System.out.println("Threade 2 logic stared");
		}).start();
	}
}

class sharedRessource {
	private volatile boolean flag = false;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean getFlag() {
		return this.flag;
	}
}
