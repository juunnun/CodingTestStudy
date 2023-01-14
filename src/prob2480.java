import java.util.Scanner;

//public class prob2480 {
//	public static void main(String [] args) {
//		Scanner input = new Scanner(System.in);
//        int a,b,c;
//        a = input.nextInt();
//        b = input.nextInt();
//        c = input.nextInt();
//        if(a==b && b==c && a==c)
//        	System.out.println(10000+(a*1000));
//        else if((a==b && b!=c)||(a==c && b!=c)||(a!=c && b==c)){
//        	if(a==b && b!=c) System.out.println(1000+(a*100));
//        	else if(a==c && b!=c) System.out.println(1000+(a*100));
//        	else System.out.println(1000+(b*100));
//        }
//        else if(a!=b && b!=c && a!=c){
//        	if(a>b && a>c) System.out.println(a*100);
//        	if(b>a && b>c) System.out.println(a*100);
//        	if(c>a && c>b) System.out.println(a*100);
//        }
//        		    
//}
//}
//
import java.util.Scanner;

public class prob2480 {
	public static void main(String[] args) {
		int one, two, three;
		Scanner in = new Scanner(System.in);
		one = in.nextInt();
		two = in.nextInt();
		three = in.nextInt();
		
		if(one == two && two == three)
			System.out.println(10000 + one * 1000);
		else if(one == two || one == three)
			System.out.println(1000 + one * 100);
		else if(two == three)
			System.out.println(1000 + two * 100);
		else
		{
			if(one > two && one > three)
				System.out.println(one * 100);
			else if(two > three)
				System.out.println(two * 100);
			else
				System.out.println(three * 100);
		}
	}
}//else if, else문을 잘 활용하자..
