
public class VirtualPet {
	// Create a tick() method that represents the passage of time.
	// Create at least three instance variables (aka attributes aka properties
	// aka fields).
	// Create at least three methods (messages you send to your pet).

	// holds the number choice for how you want to interact with myPet
	String interact;
	// variable holds the name of myPet
	String name;
	// we can have a short conversation
	String talkToMe;
	// to quit the game
	String quit;
	// feed Albus
	// make hunger down and thirst go up
	int hunger = 50;
	// give Albus something to drink
	// make thirst go down and hunger & loo go up
	int thirsty = 50;
	// play catch, fetch, squats, jogging, & swimming
	// make playWithMe go down and imTired go up
	int playWith = 25;
	// fluff Albus' hay so he can lay down comfortably
	int energy = 50;
	// Albus needs you to hold his tissue while he blows his nose
	// imSick goes down and thirsty goes up
	int sick = 10;
	// walk Albus to his loo spot
	// make loo go down and tired & thirsty go up
	int loo = 20;
	// Albus is really hot. You need to call the groomer to shave his fleece
	int isHot = 10;

	void feed() {
		hunger = hunger - 20;
		thirsty = thirsty + 1;
		playWith = playWith + 2;
		energy = energy + 10;
		sick = sick - 1;
		loo = loo + 3;
		isHot = isHot + 2;

	}

	void giveDrink() {
		hunger = hunger + 1;
		thirsty = thirsty - 20;
		playWith = playWith + 1;
		energy = energy + 10;
		sick = sick - 2;
		loo = loo + 10;
		isHot = isHot - 5;
	}

	void playWith() {
		hunger = hunger + 3;
		thirsty = thirsty + 3;
		playWith = playWith - 20;
		energy = energy - 15;
		sick = sick + 1;
		loo = loo - 1;
		isHot = isHot + 5;

	}

	void energy() {
		hunger = hunger + 5;
		thirsty = thirsty + 5;
		playWith = playWith + 10;
		energy = energy + 20;
		sick = sick - 5;
		loo = loo + 5;
		isHot = isHot + 2;
	}

	void sick() {
		hunger = hunger + 0;
		thirsty = thirsty + 0;
		playWith = playWith + 0;
		energy = energy + 10;
		sick = sick - 20;
		loo = loo + 5;
		isHot = isHot + 2;
	}

	void loo() {
		hunger = hunger + 5;
		thirsty = thirsty + 10;
		playWith = playWith + 0;
		energy = energy + 10;
		sick = sick - 5;
		loo = loo - 10;
		isHot = isHot + 2;
	}

	void isHot() {
		hunger = hunger + 5;
		thirsty = thirsty + 20;
		playWith = playWith - 5;
		energy = energy + 20;
		sick = sick + 5;
		loo = loo + 0;
		isHot = isHot - 10;
	}

	// passage of time; values change
	void tick() {
		hunger = hunger + 5;
		thirsty = thirsty + 5;
		playWith = playWith + 4;
		energy = energy - 5;
		sick = sick + 1;
		loo = loo + 3;
		isHot = isHot + 5;
	}

}
