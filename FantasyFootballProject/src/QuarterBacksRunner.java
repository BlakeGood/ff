import java.util.ArrayList;
import java.util.Scanner;
public class QuarterBacksRunner
	{
public static void main(String[] args)
{

	
	ArrayList<QuarterBacks>roster = new ArrayList<QuarterBacks>();
	
	roster.add(new QuarterBacks("Josh Rosen", 0.6, 2.7, 0));
	roster.add(new QuarterBacks("Matt Ryan", 26.6, 9.0, 0));
	roster.add(new QuarterBacks("Joe Flacco", 18.3, 10.7, 0));
	roster.add(new QuarterBacks("Josh Allen", 15.4, 8.0, 0));
	roster.add(new QuarterBacks("Cam Newton", 25.1, 4.0, 0));
	roster.add(new QuarterBacks("Mitchell Trubisky", 11.3, 7.5, 0));
	roster.add(new QuarterBacks("Andy Dalton", 19.1, 9.3, 0));
	roster.add(new QuarterBacks("Baker Mayfield", 9.8, 7.3, 0));
	roster.add(new QuarterBacks("Dak Prescott", 10.8, 4.0, 0));
	roster.add(new QuarterBacks("Case Keenum", 13.1, 11.0, 0));
	roster.add(new QuarterBacks("Matthew Stafford", 16.7, 5.7, 0));
	roster.add(new QuarterBacks("Aaron Rodgers", 20.3, 6.3, 0));
	roster.add(new QuarterBacks("Deshaun Watson", 19.6, 6.7, 0));
	roster.add(new QuarterBacks("Andrew Luck", 14.9, 4.7, 0));
	roster.add(new QuarterBacks("Blake Bortles", 18.2, 1.0, 0));
	roster.add(new QuarterBacks("Patrick Mahomes", 30.8, 7.7, 0));
	roster.add(new QuarterBacks("Phillip Rivers", 22.9, 1.7, 0));
	roster.add(new QuarterBacks("Jared Goff", 20.4, 9.7, 0));
	roster.add(new QuarterBacks("Ryan Tannehill", 19.0, 7.3, 0));
	roster.add(new QuarterBacks("Kirk Cousins", 21.3, 6.3, 0));
	roster.add(new QuarterBacks("Tom Brady", 15.1, 8.0, 0));
	roster.add(new QuarterBacks("Drew Brees", 29.9, 8.3, 0));
	roster.add(new QuarterBacks("Eli Manning", 13.5, 7.7, 0));
	roster.add(new QuarterBacks("Sam Darnold", 10.0, 5.3, 0));
	roster.add(new QuarterBacks("Derek Carr", 11.8, 3.7, 0));
	roster.add(new QuarterBacks("Carson Wentz", 11.2, 8.0, 0));
	roster.add(new QuarterBacks("Ben Rothlisberger", 24.0, 2.0, 0));
	roster.add(new QuarterBacks("Jimmy Garoppolo", 16.0, 5.3, 0));
	roster.add(new QuarterBacks("Russell Wilson", 16.9, 14.0, 0));
	roster.add(new QuarterBacks("Ryan Fitzpatrick", 32.5, 7.5, 0));
	roster.add(new QuarterBacks("Marcus Mariota", 5.4, 6.0, 0));
	roster.add(new QuarterBacks("Alex Smith", 16.5, 0.3, 0));


// Takes the user's Quarterbacks 
	
	System.out.println("How many quaterbacks do you want to choose from");
	Scanner userNumber = new Scanner(System.in);
	int inputs = userNumber.nextInt();
	Scanner userInput = new Scanner(System.in);
	
	ArrayList<QuarterBacks> userQuarterbacks = new ArrayList <QuarterBacks>();
	
	String userQbs = new String();
	
	
	for (int i = 0; i < inputs; i++)
		{
			System.out.println("Please input quarterback #" + (i+1));
			userQbs = userInput.nextLine();

			for (QuarterBacks qb : roster)
				{
					if (userQbs.equals(qb.getName()))
						{
							userQuarterbacks.add(qb);
						}
				}

		}
	
double finalNumber = 0;
for (int i = 0; i < userQuarterbacks.size(); i++)
	{
		finalNumber = userQuarterbacks.get(i).getAveragePoints() - userQuarterbacks.get(i).getDefensePoints();
		userQuarterbacks.get(i).setFinalNumber(finalNumber);
	}

double qbNumber = userQuarterbacks.get(0).getFinalNumber();
for (int i = 0; i < userQuarterbacks.size(); i++)
	{
		if (qbNumber < userQuarterbacks.get(i).getFinalNumber())
			{
				qbNumber = userQuarterbacks.get(i).getFinalNumber();
			}
		
	}

for(int i = 0; i < roster.size(); i++)
	{
		if (qbNumber == roster.get(i).getFinalNumber())
			{
				System.out.println("You should start " + roster.get(i).getName() + ".");
			}
	}


	
	
	
}


		

	}
