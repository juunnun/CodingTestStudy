//import java.util.Scanner;
//
//public class prob14681 {
//	public static void main(String [] args) {
//		Scanner input = new Scanner(System.in);
//        int a,b;
//        a = input.nextInt();
//        b = input.nextInt();
//        if(b<45) {
//        	a--;
//        	b += 15;
//        	if(a<0) a=23;
//        	System.out.println(a + " " + b);
//        }
//        else System.out.println(a + " " + (b-45));
//	}
//}
import java.util.Scanner;

public class prob14681 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        if(a>=1 && b>=45) System.out.println(a + " " + (b-45));
        else if(b<45&& a>=1) System.out.println((a-1) + " " + (b +60-45));
        else if(a==0 && b>=45) System.out.println(a + " " + (b-45));
        else if(a==0 && b<45) System.out.println("23 "+ (b+15));
       
	}
} 
//오타를 잘 보자..