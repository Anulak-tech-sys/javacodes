import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner in=new Scanner(System.in);
            System.out.println("enetr n");
            int n=in.nextInt();
            int i=1,fact=1;
            for(i=1;i<=n;i++)
            {        
               fact=fact*i;
              
            }
            System.out.println(fact);
	}

}
