import java.util.*;
import java.io.*;
public class oddevencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enetr n");
		int n=in.nextInt();
		System.out.println("enetr r");
		int r=in.nextInt();
		System.out.println("enetr e");
		int e=in.nextInt();
		if(n>r && n>e)
			System.out.println(n);
		else if(r>n && r>e)
			System.out.println(r);
		else
			System.out.println(e);
		
	}

}
