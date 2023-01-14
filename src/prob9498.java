import java.util.Scanner;

public class prob9498 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        
        if(a>= 90 && a<=100) System.out.println("A");
        else if(a>= 80) System.out.println("B");
        else if(a>= 70) System.out.println("C");
        else if(a>= 60) System.out.println("D");
        else System.out.println("F");

}
}