import java.util.*;
import java.io.*;
 class reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		System.out.println("enetr num");
		int num=sc.nextInt();
		int rem,rev=0,temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
           
           if(temp==rev)
        	   System.out.println("palindrome"+" "+rev);
           else
        	   System.out.println("not palindrome"+" "+rev);
	}

}
