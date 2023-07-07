import java.util.*;
import java.io.*;
public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter nr");
		int nr=in.nextInt();
		int count=0;
		while(nr!=0)
		{
			nr=nr/10;
			count++;
		}
		System.out.println(count);
	}

}
