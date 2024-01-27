import java.util.Scanner;
class OpBitEquals
{
	public static void  main(String args[])
	{
		int a, b, c;

		Scanner scin=new Scanner(System.in);
		a=scin.nextInt();
		b=scin.nextInt();
		c=scin.nextInt();

		a = 4;
		b>>=1;
		c<<=1;
		a^=c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		scin.close();
	}
}