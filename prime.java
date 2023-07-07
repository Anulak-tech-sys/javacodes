import java.util.*;
import java.io.*;
public class prime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enetr n");
		int n=in.nextInt();
		int count=0,num=10;
		for(int i=1;i<=num;i++)
		{
		if(n%i==0)
			count++;
	}
         if(count==2)
        	 System.out.println("prime");
         else
        	 System.out.println("not prime");
	}   	 
}
