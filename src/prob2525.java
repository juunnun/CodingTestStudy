import java.util.Scanner;

public class prob2525 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(b+c>=60) {
        	int d = (b+c)/60;
        	a= a+d;
        	int min = (b+c)%60;
        	if(a>=24) a= a-24;
        	System.out.println(a + " " + min);
        }
        else System.out.println(a + " " + (b+c));
        	
	}
}
