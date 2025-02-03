package Javaops;


class Phone{
	public void cost() {
		System.out.println("below 10,000");
	}
}
class Iqoo extends Phone{
	public void cost() {
		System.out.println("Cost of Iqoo : "+ "50,000");
	}
}
class Samsung extends Phone{
	public void cost() {
		System.out.println("Cost of Samsung : "+ "90,000");
	}
}
class Iphone extends Phone{
	public void cost() {
		System.out.println("Cost of IPhone : "+ "1,30,000");
	}
}
public class Methodoverride {
	public static void main(String args[]) {
		Phone NormalPhone = new Phone();
		Iqoo Iqoo = new Iqoo();
		Samsung Samsung = new Samsung();
		Iphone Iphone = new Iphone();
		NormalPhone.cost();
		Iqoo.cost();
		Samsung.cost();
		Iphone.cost();
	}

}


