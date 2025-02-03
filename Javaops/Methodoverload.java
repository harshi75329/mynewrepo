package Javaops;


public class Methodoverload {
	
	public void eat(String food1) {
		System.out.println("eating : "+ food1);		
	}
	
	public void eat(String food1,String food2) {
		System.out.println("eating : "+ food1+","+food2);		
	}
	
	public void eat(String food1,String food2,String food3) {
		System.out.println("Stomach is full");
	}
	
	public void eat() {
		System.out.println("dieting");
	}

	public static void main(String[] args) {
		Methodoverload obj = new Methodoverload();
		obj.eat();
		obj.eat("pizza");
		obj.eat("pizza","burger","drinks");

	}

}

