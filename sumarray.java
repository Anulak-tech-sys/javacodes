import java.util.*;
public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner in=new Scanner(System.in);
           
            int[] n=new int[5];
            for(int i=0;i<5;i++)
            {

                System.out.println("enter the array");
            	n[i]=in.nextInt();
            }
           
            int sum=0,i=0;
            for(i=0;i<n.length;i++)
            {
            	sum=sum+n[i];
            }
           System.out.println(sum);
            	
            
	}

}
