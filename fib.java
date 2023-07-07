import java.util.*;
import java.io.*;
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          System.out.println("enetr n");
          int n=in.nextInt();
          int fib1=0;
          int fib2=1;
          int fib;
          while(n!=0)
          {    fib=fib1+fib2;
        	  fib1=fib2;
        	  fib2=fib;
        	  n--;
        	  System.out.println(fib);
          }
         
	}

}
