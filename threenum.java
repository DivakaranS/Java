import java.io.*;
import java.util.*;

class Threenum
{
	public static void main(String arg[]) throws IOException 
	{
		int a,b,c;

		System.out.println("Enter A,B & C value");

		Scanner s=new Scanner(System.in);

		a=s.nextInt();

		b=s.nextInt();

		c=s.nextInt();

		if((a>b) && (a>c))

			System.out.println("A IS BIG");

		else
			if(b>c)

				System.out.println("B IS BIG");

			else

				System.out.println("C IS BIG");
	}

}

