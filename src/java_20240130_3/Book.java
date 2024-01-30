package java_20240130_3;
/*당신은 도서관 시스템을 위한 소프트웨어를 개발하고 있습니다. 다음 요구사항을 충족하는 클래스를 작성하세요.

1. Book 클래스 (부모 클래스):
속성:

title (책 제목, 문자열 타입)
author (저자, 문자열 타입)
publicationYear (출판 연도, 정수 타입)
메서드:

생성자: 모든 속성을 초기화합니다.
displayInfo(): 책의 정보를 "Title: [title], Author: [author], Year: [publicationYear]" 형태로 출력합니다.
*/
public class Book {

	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {	}
	
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	public void displayInfo() {
		System.out.println("Title: [" + title + "]");
		System.out.println("Author: [" + author + "]");
		System.out.println("Year: [" + publicationYear + "]");
	
	}
	
}
