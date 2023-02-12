
public class Pattern {
public static void main(String [] args)
{
	for(int j=1; j<=5; j++)
	{
		for(int i=1; i<=5; i++)
		{
			if(i<=j)
			{
				System.out.print("@");
				
			}
			else
				System.out.print(" ");
		}
		System.out.println();
		
	}
}
}
