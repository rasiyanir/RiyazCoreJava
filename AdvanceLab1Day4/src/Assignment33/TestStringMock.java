package Assignment33;

public class TestStringMock {
	public static void main(String[] args) {
		String message = "What's in the name";
		StringMock stringMock = new StringMock();
		System.out.println(StringMock.search("Hello", 'e'));
		System.out.println(StringMock.search("Hello", 's'));
	}
}
