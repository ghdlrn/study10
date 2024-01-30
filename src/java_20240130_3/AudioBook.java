package java_20240130_3;
/*
3. AudioBook 클래스 (자식 클래스):
Book 클래스로부터 상속받습니다.

추가 속성:

length (오디오북 길이, 실수 타입, 시간 단위)
narrator (낭독자, 문자열 타입)
메서드:

생성자: Book 클래스의 속성과 AudioBook 클래스의 속성 모두를 초기화합니다.
오버라이드된 displayInfo(): Book의 정보를 출력하고, 추가로 "Length: [length] hours, Narrator: [narrator]"를 출력합니다.
연습문제 요약:
Book, EBook, AudioBook 세 클래스를 생성합니다.
각 클래스는 주어진 속성과 메서드를 가집니다.
EBook과 AudioBook 클래스는 Book 클래스로부터 상속받고, 추가 속성과 메서드를 가집니다.
*/
public class AudioBook extends Book {

	private double length;
	private String narrator;
	
	public AudioBook() {	}
	
	public AudioBook(String title, String author,int publicationYear, double length, String narrator) {	
		super(title, author, publicationYear);
		this.length = length;
		this.narrator = narrator;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Length: [" + length + "]");
		System.out.println("Narrator: [" + narrator + "]");
		
	}
	
}
