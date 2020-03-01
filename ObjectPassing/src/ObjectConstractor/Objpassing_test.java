package ObjectConstractor;

public class Objpassing_test {

	public static void main(String[] args) {
		
		Objpassing_constractor book1=new Objpassing_constractor(50,20);
		System.out.println("for book1: ");
		book1.displayresult();
		
		Objpassing_constractor book2=new Objpassing_constractor(book1);
		System.out.println("for book2: " );
		book2.displayresult();

	}

}
