import java.util.Scanner;
public class prob10430 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int A, B,C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        System.out.println((A+B)%C + "\n" + ((A%C) + (B%C))%C+ "\n" + (A*B)%C + "\n" + ((A%C)*(B%C))%C);
     
	}
}