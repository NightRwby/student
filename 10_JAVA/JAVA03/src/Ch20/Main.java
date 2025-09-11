package Ch20;

@CustomAnnotation(isOpen = true, number = 10000, value = "홍길동")
class Simple{
	
	String value;
	int number;
	boolean isOpne;
	
	Simple(){
		CustomAnnotation ref = this.getClass().getAnnotation(CustomAnnotation.class);
		System.out.println("VALUE : "+ref.value());
		System.out.println("NUMBER : "+ref.number());
		System.out.println("ISPOEN : "+ref.isOpen());
		this.value = ref.value();
		this.number = ref.number();
		this.isOpne = ref.isOpen();
	}
}

public class Main {
	public static void main(String[] args) {
		Simple ob = new Simple();
		System.out.println(ob);
	}
}
