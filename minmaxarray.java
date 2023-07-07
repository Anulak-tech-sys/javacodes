import java.util.*;
public class minmaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,4,5};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
			else if(max<a[i])
				max=a[i];
		}
         System.out.println(min); 
         System.out.println(max);
	}

}
