//Oren Horak - Algorithmic Design 1 - 005
import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//beggining messages
		System.out.println("Welcome to Apple Tester!");
		System.out.println("Creating the new Apple!");
		//creating new "Apple" as "a1".
		Apple a1 = new Apple();
		System.out.println(a1.writeOutput());
		//using writeOutput method in order to print new object of a1 apple.
		System.out.println("Enter the type of the second apple object");
		String Type = key.nextLine();
		System.out.println("Enter the weight of the second apple object");
		double Weight = key.nextDouble();
		System.out.println("Enter the price of the second apple object");
		double Price = key.nextDouble();
		Apple a2 = new Apple(Type, Weight, Price);
		System.out.println(a2.writeOutput());
	}

}
