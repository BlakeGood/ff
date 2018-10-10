import java.util.ArrayList;
import java.util.Scanner;

public class QuarterBacksRunner {
	public static void main(String[] args) {
		
		// Welcome message
		
		System.out.println("Hello! Welcome to the fantasy football preditcor. Please enter your team name:");
		Scanner userTeam = new Scanner(System.in);
		String team = userTeam.nextLine();
		System.out.println("Welcome to the predictor " + team + ". Lets start with quarterbacks");

		// Quarterbacks Ranking

		ArrayList<QuarterBacks> roster = new ArrayList<QuarterBacks>();

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

		ArrayList<QuarterBacks> userQuarterbacks = new ArrayList<QuarterBacks>();

		String userQbs = new String();

		for (int i = 0; i < inputs; i++) {
			System.out.println("Please input quarterback #" + (i + 1));
			userQbs = userInput.nextLine();

			for (QuarterBacks qb : roster) {
				if (userQbs.equals(qb.getName())) {
					userQuarterbacks.add(qb);
				}
			}

		}

		double finalNumber = 0;
		for (int i = 0; i < userQuarterbacks.size(); i++) {
			finalNumber = userQuarterbacks.get(i).getAveragePoints() - userQuarterbacks.get(i).getDefensePoints();
			userQuarterbacks.get(i).setFinalNumber(finalNumber);
		}

		double qbNumber = userQuarterbacks.get(0).getFinalNumber();
		for (int i = 0; i < userQuarterbacks.size(); i++) {
			if (qbNumber < userQuarterbacks.get(i).getFinalNumber()) {
				qbNumber = userQuarterbacks.get(i).getFinalNumber();
			}

		}

		for (int i = 0; i < roster.size(); i++) {
			if (qbNumber == roster.get(i).getFinalNumber()) {
				System.out.println("You should start " + roster.get(i).getName() + " at quarterback.");
			}
		}

		System.out.println("");

		// Runningbacks ranking

		ArrayList<runningbacks> rbRoster = new ArrayList<runningbacks>();

		rbRoster.add(new runningbacks("Todd Gurley", 1));
		rbRoster.add(new runningbacks("Melvin Gordon", 2));
		rbRoster.add(new runningbacks("Saquon Barkley", 3));
		rbRoster.add(new runningbacks("Christian McCaffery", 4));
		rbRoster.add(new runningbacks("Kareem Hunt", 5));
		rbRoster.add(new runningbacks("Ezekiel Elliot", 6));
		rbRoster.add(new runningbacks("Sony Michel", 7));
		rbRoster.add(new runningbacks("Joe Mixon", 8));
		rbRoster.add(new runningbacks("James Conner", 9));
		rbRoster.add(new runningbacks("Carlos Hyde", 10));
		rbRoster.add(new runningbacks("James White", 11));
		rbRoster.add(new runningbacks("David Johnson", 12));
		rbRoster.add(new runningbacks("Jordan Howard", 13));
		rbRoster.add(new runningbacks("Marshawn Lynch", 14));
		rbRoster.add(new runningbacks("T.J. Yeldon", 15));
		rbRoster.add(new runningbacks("Devonta Freeman", 16));
		rbRoster.add(new runningbacks("Chris Carson", 17));
		rbRoster.add(new runningbacks("Isaiah Crowell", 18));
		rbRoster.add(new runningbacks("Chris Thompson", 19));
		rbRoster.add(new runningbacks("Phillip Lindsay", 20));
		rbRoster.add(new runningbacks("LeSean McCoy", 21));
		rbRoster.add(new runningbacks("Adrian Peterson", 22));
		rbRoster.add(new runningbacks("Dalvin Cook", 23));
		rbRoster.add(new runningbacks("Aaron Jones", 24));
		rbRoster.add(new runningbacks("Alfred Morris", 25));
		rbRoster.add(new runningbacks("Wendell Smallwood", 26));
		rbRoster.add(new runningbacks("Austin Ekeler", 27));
		rbRoster.add(new runningbacks("Tevin Coleman", 28));
		rbRoster.add(new runningbacks("Nyheim Hines", 29));
		rbRoster.add(new runningbacks("Kenyan Drake", 30));
		rbRoster.add(new runningbacks("Alex Collins", 31));
		rbRoster.add(new runningbacks("Royce Freeman", 32));
		rbRoster.add(new runningbacks("Tarik Cohen", 33));
		rbRoster.add(new runningbacks("Dion Lewis", 34));
		rbRoster.add(new runningbacks("Javorius Allen", 35));
		rbRoster.add(new runningbacks("Bilal Powell", 36));
		rbRoster.add(new runningbacks("Lamar Miller", 37));
		rbRoster.add(new runningbacks("Mike Davis", 38));
		rbRoster.add(new runningbacks("Corey Clement", 39));
		rbRoster.add(new runningbacks("Ronald Jones II", 40));

		System.out.println("How many runningbacks do you want to choose from");
		Scanner userNumber2 = new Scanner(System.in);
		int inputs2 = userNumber.nextInt();
		Scanner userInput2 = new Scanner(System.in);

		ArrayList<runningbacks> userRunningbacks = new ArrayList<runningbacks>();

		String userRbs = new String();

		for (int i = 0; i < inputs2; i++) {
			System.out.println("Please input runningback #" + (i + 1));
			userRbs = userInput2.nextLine();

			for (runningbacks rb : rbRoster) {
				if (userRbs.equals(rb.getName())) {
					userRunningbacks.add(rb);
				}
			}

		}

		int rank = 0;
		for (int i = 0; i < userRunningbacks.size(); i++) {
			rank = userRunningbacks.get(i).getRanking();
			userRunningbacks.get(i).setRanking(rank);
		}

		double rbNumber = userRunningbacks.get(0).getRanking();
		for (int i = 0; i < userRunningbacks.size(); i++) {
			if (rbNumber > userRunningbacks.get(i).getRanking()) {
				rbNumber = userRunningbacks.get(i).getRanking();
			}

		}

		for (int i = 0; i < rbRoster.size(); i++) {
			if (rbNumber == rbRoster.get(i).getRanking()) {
				System.out.println("You should start " + rbRoster.get(i).getName() + " at runningback.");
			}
		}

		System.out.println("");

		// Wide Receiver Rankings
		
		ArrayList<wideReceivers> wrRoster = new ArrayList<wideReceivers>();
		
		wrRoster.add(new wideReceivers("Antonio Brown", 1));
		wrRoster.add(new wideReceivers("Julio Jones", 2));
		wrRoster.add(new wideReceivers("Odell Beckham Jr.", 3));
		wrRoster.add(new wideReceivers("DeAndre Hopkins", 4));
		wrRoster.add(new wideReceivers("Davante Adams", 5));
		wrRoster.add(new wideReceivers("Tyreek Hill", 6));
		wrRoster.add(new wideReceivers("A.J. Green", 7));
		wrRoster.add(new wideReceivers("Mike Evans", 8));
		wrRoster.add(new wideReceivers("Adam Thielen", 9));
		wrRoster.add(new wideReceivers("Stefon Diggs", 10));
		wrRoster.add(new wideReceivers("JuJu Smith-Schuster", 11));
		wrRoster.add(new wideReceivers("Robert Woods", 12));
		wrRoster.add(new wideReceivers("Keenan Allen", 13));
		wrRoster.add(new wideReceivers("Jarvis Landry ", 14));
		wrRoster.add(new wideReceivers("Tyler Boyd", 15));
		wrRoster.add(new wideReceivers("Julian Edelman", 16));
		wrRoster.add(new wideReceivers("Calvin Ridley", 17));
		wrRoster.add(new wideReceivers("Emmanuel Sanders", 18));
		wrRoster.add(new wideReceivers("Allen Robinson", 19));
		wrRoster.add(new wideReceivers("John Brown", 20));
		wrRoster.add(new wideReceivers("DeSean Jackson", 21));
		wrRoster.add(new wideReceivers("Will Fuller", 22));
		wrRoster.add(new wideReceivers("Alshon Jeffery", 23));
		wrRoster.add(new wideReceivers("Demaryius Thomas", 24));
		wrRoster.add(new wideReceivers("Cooper Kupp", 25));
		wrRoster.add(new wideReceivers("Corey Davis", 26));
		wrRoster.add(new wideReceivers("Brandin Cooks", 27));
		wrRoster.add(new wideReceivers("Josh Gordon", 28));
		wrRoster.add(new wideReceivers("Sterling Shepard", 29));
		wrRoster.add(new wideReceivers("Tyler Lockett", 30));
		wrRoster.add(new wideReceivers("Doug Baldwin", 31));
		wrRoster.add(new wideReceivers("Sammy Watkins", 32));
		
		System.out.println("How many wide receivers do you want to choose from");
		Scanner userNumber3 = new Scanner(System.in);
		int inputs3 = userNumber.nextInt();
		Scanner userInput3 = new Scanner(System.in);

		ArrayList<wideReceivers> userWideReceivers = new ArrayList<wideReceivers>();

		String userWrs = new String();

		for (int i = 0; i < inputs3; i++) {
			System.out.println("Please input wide receiver #" + (i + 1));
			userWrs = userInput3.nextLine();

			for (wideReceivers wr : wrRoster) {
				if (userWrs.equals(wr.getName())) {
					userWideReceivers.add(wr);
				}
			}

		}

		int wrRank = 0;
		for (int i = 0; i < userWideReceivers.size(); i++) {
			wrRank = userWideReceivers.get(i).getRanking();
			userWideReceivers.get(i).setRanking(wrRank);
		}

		int wrNumber = userWideReceivers.get(0).getRanking();
		for (int i = 0; i < userWideReceivers.size(); i++) {
			if (wrNumber > userWideReceivers.get(i).getRanking()) {
				wrNumber = userWideReceivers.get(i).getRanking();
			}

		}

		for (int i = 0; i < wrRoster.size(); i++) {
			if (wrNumber == wrRoster.get(i).getRanking()) {
				System.out.println("You should start " + wrRoster.get(i).getName() + " at wide receiver.");
			}
		}

		System.out.println("");
		
		// Tight Ends 
		
		ArrayList <tightends> teRoster = new ArrayList <tightends>();
		
		teRoster.add(new tightends("Travis Kelce", 1));
		teRoster.add(new tightends("Zach Ertz", 2));
		teRoster.add(new tightends("Rob Gronkowski", 3));
		teRoster.add(new tightends("George Kittle", 4));
		teRoster.add(new tightends("Jimmy Graham", 5));
		teRoster.add(new tightends("Eric Ebron", 6));
		teRoster.add(new tightends("Trey Burton", 7));
		teRoster.add(new tightends("Jared Cook", 8));
		teRoster.add(new tightends("Jordan Reed", 9));
		teRoster.add(new tightends("Cameron Brate", 10));
		teRoster.add(new tightends("Kyle Rudolph", 11));
		teRoster.add(new tightends("David Njoku", 12));
		teRoster.add(new tightends("Austin Hooper", 13));
		teRoster.add(new tightends("Vance McDonald", 14));
		teRoster.add(new tightends("Ricky Seals-Jones", 15));
		teRoster.add(new tightends("Geoff Swaim", 16));
		teRoster.add(new tightends("Greg Olsen", 17));
		teRoster.add(new tightends("Nick Vannett", 18));
		teRoster.add(new tightends("Hayden Hurst", 19));
		teRoster.add(new tightends("Charles Clay", 20));
		teRoster.add(new tightends("Antonio Gates", 21));
		teRoster.add(new tightends("C.J. Uzomah", 22));
		teRoster.add(new tightends("Ryan Griffin", 23));
		teRoster.add(new tightends("Jack Doyle", 24));
		teRoster.add(new tightends("Nile Paul", 25));
		teRoster.add(new tightends("Rhett Ellison", 26));
		teRoster.add(new tightends("Dallas Goedert", 27));
		teRoster.add(new tightends("Mike Gesicki", 28));
		teRoster.add(new tightends("Jesse James", 29));
		teRoster.add(new tightends("Ian Thomas", 30));
		teRoster.add(new tightends("Jeff Heuerman", 31));
		teRoster.add(new tightends("Jonnu Smith", 32));
		
		System.out.println("How many tight ends do you want to choose from");
		Scanner userNumber4 = new Scanner(System.in);
		int inputs4 = userNumber.nextInt();
		Scanner userInput4 = new Scanner(System.in);

		ArrayList<tightends> userTightends = new ArrayList<tightends>();

		String userTes = new String();

		for (int i = 0; i < inputs4; i++) {
			System.out.println("Please input tight end #" + (i + 1));
			userTes = userInput4.nextLine();

			for (tightends te : teRoster) {
				if (userTes.equals(te.getName())) {
					userTightends.add(te);
				}
			}

		}

		int teRank = 0;
		for (int i = 0; i < userTightends.size(); i++) {
			teRank = userTightends.get(i).getRanking();
			userTightends.get(i).setRanking(teRank);
		}

		int teNumber = userTightends.get(0).getRanking();
		for (int i = 0; i < userTightends.size(); i++) {
			if (teNumber > userTightends.get(i).getRanking()) {
				teNumber = userTightends.get(i).getRanking();
			}

		}

		for (int i = 0; i < teRoster.size(); i++) {
			if (teNumber == teRoster.get(i).getRanking()) {
				System.out.println("You should start " + teRoster.get(i).getName() + " at tight end.");
			}
		}

		System.out.println("");
		
		// Defense
		
		ArrayList<defense> dRoster = new ArrayList<defense>();
		
		dRoster.add(new defense("Bears", 1));
		dRoster.add(new defense("Jaguars", 2));
		dRoster.add(new defense("Vikings", 3));
		dRoster.add(new defense("Texans", 4));
		dRoster.add(new defense("Rams", 5));
		dRoster.add(new defense("Ravens", 6));
		dRoster.add(new defense("Packers", 7));
		dRoster.add(new defense("Eagles", 8));
		dRoster.add(new defense("Titans", 9));
		dRoster.add(new defense("Jets", 10));
		dRoster.add(new defense("Cowboys", 11));
		dRoster.add(new defense("Seahawks", 12));
		dRoster.add(new defense("Panthers", 13));
		dRoster.add(new defense("Dolphins", 14));
		dRoster.add(new defense("Chargers", 15));
		dRoster.add(new defense("Browns", 16));
		dRoster.add(new defense("Colts", 17));
		dRoster.add(new defense("Bills", 18));
		dRoster.add(new defense("Redskins", 19));
		dRoster.add(new defense("Bengals", 20));
		dRoster.add(new defense("Giants", 21));
		dRoster.add(new defense("Patriots", 22));
		dRoster.add(new defense("Falcons", 23));
		dRoster.add(new defense("Steelers", 24));
		dRoster.add(new defense("Raiders", 25));
		dRoster.add(new defense("Cardinals", 26));
		dRoster.add(new defense("Broncos", 27));
		dRoster.add(new defense("49ers", 28));
		dRoster.add(new defense("Buccaneers",29));
		dRoster.add(new defense("Chiefs", 30));
		dRoster.add(new defense("Lions", 31));
		dRoster.add(new defense("Saints", 32));
		
		System.out.println("How many defenses do you want to choose from");
		Scanner userNumber5 = new Scanner(System.in);
		int inputs5 = userNumber.nextInt();
		Scanner userInput5 = new Scanner(System.in);

		ArrayList<defense> userDefense = new ArrayList<defense>();

		String userD = new String();

		for (int i = 0; i < inputs5; i++) {
			System.out.println("Please input defense #" + (i + 1));
			userD = userInput5.nextLine();

			for (defense d : dRoster) {
				if (userD.equals(d.getName())) {
					userDefense.add(d);
				}
			}

		}

		int dRank = 0;
		for (int i = 0; i < userDefense.size(); i++) {
			dRank = userDefense.get(i).getRanking();
			userDefense.get(i).setRanking(dRank);
		}

		int dNumber = userDefense.get(0).getRanking();
		for (int i = 0; i < userDefense.size(); i++) {
			if (dNumber > userDefense.get(i).getRanking()) {
				dNumber = userDefense.get(i).getRanking();
			}

		}

		for (int i = 0; i < dRoster.size(); i++) {
			if (dNumber == dRoster.get(i).getRanking()) {
				System.out.println("You should start the " + dRoster.get(i).getName() + " at defense.");
			}
		}

		System.out.println("");
		
		// Kickers
		
		ArrayList<kickers> kRoster = new ArrayList<kickers>();
		
		kRoster.add(new kickers("Stephen Gostkowski", 1));
		kRoster.add(new kickers("Harrison Butker", 2));
		kRoster.add(new kickers("Matt Bryant", 3));
		kRoster.add(new kickers("Justin Tucker", 4));
		kRoster.add(new kickers("Dan Bailey", 5));
		kRoster.add(new kickers("Jake Elliott", 6));
		kRoster.add(new kickers("Grahm Gano", 7));
		kRoster.add(new kickers("Chris Boswell", 8));
		kRoster.add(new kickers("Ka'imi Fairbairn", 9));
		kRoster.add(new kickers("Mason Crosby", 10));
		kRoster.add(new kickers("Cody Parkey", 11));
		kRoster.add(new kickers("Adam Vinatieri", 12));
		kRoster.add(new kickers("Randy Bullock", 13));
		kRoster.add(new kickers("Cairo Santos", 14));
		kRoster.add(new kickers("Chandler Catanzaro", 15));
		kRoster.add(new kickers("Josh Lambo", 16));
		kRoster.add(new kickers("Caleb Sturgis", 17));
		kRoster.add(new kickers("Ryan Succop", 18));
		kRoster.add(new kickers("Sebastian Janikowski", 19));
		kRoster.add(new kickers("Dustin Hopkins", 20));
		kRoster.add(new kickers("Robbie Gould", 21));
		kRoster.add(new kickers("Aldrick Rosas", 22));
		kRoster.add(new kickers("Jason Myers", 23));
		kRoster.add(new kickers("Greg Zuerlein", 24));
		kRoster.add(new kickers("Brandon McManus", 25));
		kRoster.add(new kickers("Greg Joseph", 26));
		
		System.out.println("How many kickers do you want to choose from");
		Scanner userNumber6 = new Scanner(System.in);
		int inputs6 = userNumber.nextInt();
		Scanner userInput6 = new Scanner(System.in);

		ArrayList<kickers> userKickers = new ArrayList<kickers>();

		String userK = new String();

		for (int i = 0; i < inputs6; i++) {
			System.out.println("Please input kicker #" + (i + 1));
			userK = userInput6.nextLine();

			for (kickers k : kRoster) {
				if (userK.equals(k.getName())) {
					userKickers.add(k);
				}
			}

		}

		int kRank = 0;
		for (int i = 0; i < userKickers.size(); i++) {
			kRank = userKickers.get(i).getRanking();
			userKickers.get(i).setRanking(kRank);
		}

		int kNumber = userKickers.get(0).getRanking();
		for (int i = 0; i < userKickers.size(); i++) {
			if (kNumber > userKickers.get(i).getRanking()) {
				kNumber = userKickers.get(i).getRanking();
			}

		}

		for (int i = 0; i < kRoster.size(); i++) {
			if (kNumber == kRoster.get(i).getRanking()) {
				System.out.println("You should start " + kRoster.get(i).getName() + " at kicker.");
			}
		}

		System.out.println("");
		System.out.println("");
		
		// Final Roster
		
		System.out.println(team + "'s final roster is:");
		System.out.println("--------------------");
		
		for (int i = 0; i < roster.size(); i++) 
		{
			if (qbNumber == roster.get(i).getFinalNumber()) {
				System.out.println("| QB | " + roster.get(i).getName());
			}
		}
		
		System.out.println("--------------------");
		
		for (int i = 0; i < rbRoster.size(); i++) 
		{
			if (rbNumber == rbRoster.get(i).getRanking()) {
				System.out.println("| RB | " + rbRoster.get(i).getName());
			}
		}
		
		System.out.println("--------------------");
		
		for (int i = 0; i < wrRoster.size(); i++) 
		{
			if (wrNumber == wrRoster.get(i).getRanking()) {
				System.out.println("| WR | " + wrRoster.get(i).getName());
			}
		}
		
		System.out.println("--------------------");
		
		for (int i = 0; i < teRoster.size(); i++) {
			if (teNumber == teRoster.get(i).getRanking()) {
				System.out.println("| TE | " + teRoster.get(i).getName());
			}
		}
		
		System.out.println("--------------------");
		
		for (int i = 0; i < dRoster.size(); i++) {
			if (dNumber == dRoster.get(i).getRanking()) {
				System.out.println("| DE | " + dRoster.get(i).getName());
			}
		}
		
		System.out.println("--------------------");
		
		for (int i = 0; i < kRoster.size(); i++) {
			if (kNumber == kRoster.get(i).getRanking()) {
				System.out.println("| K  | " + kRoster.get(i).getName());
			}
		}
		
		System.out.println("--------------------");
		
	}
}
