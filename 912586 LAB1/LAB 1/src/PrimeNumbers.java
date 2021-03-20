/**
 * NAME: BATHULA ROOPASRI
 * Description: Prime Numbers
 * Date: 13/3/2021
 */
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(),count=0;
		sc.close();
		if(number==1)
			System.out.println("not a prime number");
		else 
		{
			for(int i=2;i<=number;i++)
			{
				count=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
					System.out.println(i+" ");
			}
		}

	}

}
