import java.util.Scanner;
public class prob2588 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int c = b / 100;
        int d = (b % 100) / 10;
        int e = (b % 100) % 10;
        System.out.println((a*e) + "\n" + (a*d) + "\n" + (a*c)+ "\n" + (a*b));
	}
}