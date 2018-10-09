
public class QuarterBacks
	{

		private String name;
		private double averagePoints;
		private double defensePoints;
		private double finalNumber;
		
		public QuarterBacks(String n, double a, double d, double f)
		{
			name = n;
			averagePoints = a;
			defensePoints = d;
			finalNumber = f;
		}

		public double getFinalNumber()
			{
				return finalNumber;
			}

		public void setFinalNumber(double finalNumber)
			{
				this.finalNumber = finalNumber;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public double getAveragePoints()
			{
				return averagePoints;
			}

		public void setAveragePoints(double averagePoints)
			{
				this.averagePoints = averagePoints;
			}

		public double getDefensePoints()
			{
				return defensePoints;
			}

		public void setDefensePoints(double defensePoints)
			{
				this.defensePoints = defensePoints;
			}	
		
		
	}
