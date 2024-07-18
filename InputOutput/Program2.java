/*
	============ Java Language ===========

	Input/Output ->
		* In Java,their are two ways to take the Input.
			1) BufferedReader and InputStreamReader Class -> Present in 'io'package.
			2) Scanner Class. -> Present in 'util'package.
*/

//Take input Using BufferedReader and InputStreamReader 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// or import java.io.*;
class BufferedReaderInput{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		byte by;
		short s;
		int num;
		float f;
		char ch;
		long l;
		double d;
		boolean b;

		try{							// Using try-catch to avoid the IOException.
			System.out.println("Enter the Byte Value : ");
			by = Byte.parseByte(br.readLine());
			System.out.println("Byte Value : " + by);

			System.out.println("Enter the Short Value : ");
			s = Short.parseShort(br.readLine());
			System.out.println("Short Value : " + s);

			System.out.println("Enter the Integer Value : ");
			num = Integer.parseInt(br.readLine());
			System.out.println("Integer Value : " + num);

			System.out.println("Enter the Float Value : ");
			f = Float.parseFloat(br.readLine());
			System.out.println("Float Value : " + f);

			System.out.println("Enter the Character Value : ");
			ch = (char)br.read();
			br.skip(1);
			System.out.println("Character Value : " + ch);

			System.out.println("Enter the Long Value : ");
			l = Long.parseLong(br.readLine());
			System.out.println("Long Value : " + l);

			System.out.println("Enter the Double Value : ");
			d = Double.parseDouble(br.readLine());
			System.out.println("Double Value : " + d);

			System.out.println("Enter the Boolean Value : ");
			b = Boolean.parseBoolean(br.readLine());
			System.out.println("Boolean Value : " + by);

		}catch(IOException io){

			io.printStackTrace();
		}
	}
}



