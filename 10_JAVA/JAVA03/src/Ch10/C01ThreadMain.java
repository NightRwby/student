package Ch10;

public class C01ThreadMain {
	public static void main(String[] args) throws Exception {
		
		//동기방식
		for (int i=0; i<5; i++) {
			System.out.println("TASK01...");
			Thread.sleep(500);
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("TASK02...");
			Thread.sleep(500);
		}
		
	}
}
