package java_20240130_3;

public class ex1 {

	public static void main(String[] args) {

		Book ab = new Book("aa","bb",100);
		ab.displayInfo();
		
		System.out.println("---------------------");
		
		EBook ab1 = new EBook("11","22",33,44,"55");
		ab1.displayInfo();
		
		System.out.println("---------------------");
		
		AudioBook ab2 = new AudioBook("66","77",88,99,"00");
		ab2.displayInfo();
		
		
		
	}

}
