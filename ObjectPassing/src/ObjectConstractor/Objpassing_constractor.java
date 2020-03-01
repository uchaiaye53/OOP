package ObjectConstractor;

public class Objpassing_constractor {
	
	int length,width;
	
	Objpassing_constractor(int l,int w){
		length =l;
		width=w;
	}
	
	Objpassing_constractor(Objpassing_constractor b){
		
		this.length = b.length;
		this.width = b.width;
	}
	
	void displayresult() {
		
		System.out.println("length is:"+this.length);
		System.out.println("width is:"+this.width);
	}


}
