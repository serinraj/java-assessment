import java.util.Scanner;
public class Fact {
	public static void main(String p[])
	{
		  int i,fact=1; 
		  Scanner sc=new Scanner(System.in);
		  int number=sc.nextInt();   
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("N= "+fact);   
		  NumberNames nn=new NumberNames();
		  nn.numberToWords((fact+"").toCharArray());
	}
}
