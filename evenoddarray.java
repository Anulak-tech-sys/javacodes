import java.util.*;
public class evenoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4,5};
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				System.out.println("even numbers"+" "+n[i]);
			}
			else
			{
				System.out.println("odd numbers"+" "+n[i]);
			}
		}

	}

}
