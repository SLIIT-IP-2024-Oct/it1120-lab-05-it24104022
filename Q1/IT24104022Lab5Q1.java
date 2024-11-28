import java.util.scanner;

	public class IT24104022Lab5Q1 {

		public static void main(String[] args)
		{

		Scanner input = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("Enter the first num: ");
		num1 = input.nextInt();

		System.out.print("Enter the second num: ");
		num2 = input.nextInt();

		System.out.print("Enter the third num: ");
		num3 = input.nextInt();

		if (num1 > num2)
		{
			System.out.println("Smallest: " + num2);
			System.out.println("Largest: " + num1);
		}
		else
		{
			System.out.println("Largest: " + num2);
			System.out.printin("Smallest: " + num1);
		}
		if (num1 > num3)
		{
			System.out.println("Largest: " + num1);
			System.out.println("Smallest: " + num3);
		}
		else
		{
			System.out.println("Largest: " + num3);
			System.out.println("Smallest: " + num1);
		}
		if (num2 > num3)
		{
			System.out.println("Largest: " + num2);
			System.out.printlnt("Smallest: " + num3);
		}
		else
		{
			System.out.println("Largest: " + num3);
			System.out.println("Smallest: " + num2);
		}
	input.close();
	}
}
