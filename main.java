import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


class center{
	public static void main(String[] args){
		twoDimensional Test = new twoDimensional();
		/* Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String s = reader.next(); */
		Test.setArray(new int[][]{
			{ 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
			{ 1, 3, 5, 7 },
			{ 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
		});
		
		// Test 1
		System.out.print("Test.nearby(0, 2, 2): ");
		System.out.println(Test.nearby(0, 2, 2));
		// Test 2
		System.out.print("Test.nearby(1, 0, 1): ");
		System.out.println(Test.nearby(1, 0, 1));
		// Test 3
		System.out.print("Test.nearby(1, 3, 5): ");
		System.out.println(Test.nearby(1, 3, 5));
	}
}
