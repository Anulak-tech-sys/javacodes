import java.util.*;
public class duplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,2,5,1};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=1;j<a.length;j++)
			{
				a[i]=a[j];
			
				if(a[i]==a[j])
				{
					System.out.println("duplicate elemts are="+" "+a[i]+" "+a[j]);
				}
	}}
			
		
}
}
