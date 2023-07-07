import java.util.*;
import java.io.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enetr a");
      int a=sc.nextInt();
      System.out.println("enetr b");
      int b=sc.nextInt();
      int temp;
      temp=a;
      a=b;
      b=temp;
      System.out.println(a+" "+b);
	}

}
