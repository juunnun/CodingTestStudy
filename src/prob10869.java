import java.util.Scanner;
public class prob10869 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println((a+b) + "\n" +  (a-b) + "\n" + (a*b)+ "\n" + ((long)a/b)+ "\n" + (a%b));
	}
}
