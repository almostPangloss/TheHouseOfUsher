package textBook;


import java.util.Scanner;

public class MinMaxAvg {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in );
		double min = 100, max = 0;
		double cumulativeScore = 0.0;
		
		System.out.println("Please enter scores: \n *****************");
		for ( int i = 0; i < 10; i++)
		{
			System.out.print((i + 1) + ". ");
			
			double score = -1;
			do 
			{
				if (scan.hasNextDouble())
				{
					String entry = scan.nextLine();
					score = Double.parseDouble(entry);
					System.out.println("Score: " + score);
					if ( score <= 100 && score  >= 0 )
					{
						System.out.println("Score: " + score);
						if ( score < min)
						{
							min = score;
						} else if ( score > max)
						{
							max = score;
						}
						cumulativeScore += score;
						System.out.println("CumScore: " + cumulativeScore);
					} else
					{
						score = -1.0;
					}
				} else 
				{
					String grabage = scan.nextLine();
				}
			} while (score == -1.0);
			
			
		}
		
		System.out.println( "The average of those ten scores is " + (cumulativeScore / 10) );
		System.out.println( "The maximum of those ten scores is " + max );
		System.out.println( "The minimum of those ten scores is " + min );
		
		scan.close();

	}

}
