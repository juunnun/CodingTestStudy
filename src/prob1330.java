import java.util.Scanner;

public class prob1330 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        if(a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
        else System.out.println("==");
	}
}