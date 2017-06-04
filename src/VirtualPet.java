
public class VirtualPet {
	// initializing variable names
	String name;
	String description;
	int hungerLevel;
	int waterLevel;
	int wantsToPlay;
	int messyCage;

	public VirtualPet(String name, String description, int hungerLevel, int waterLevel, int wantsToPlay,
			int messyCage) {
		// constructor for pet name & needs levels
		this.name = name;
		this.description = description;
		this.hungerLevel = hungerLevel;
		this.waterLevel = waterLevel;
		this.wantsToPlay = wantsToPlay;
		this.messyCage = messyCage;
	}

	public VirtualPet(String name, String description) { // constructor for pet name & description
		this.name = name;
		this.description = description;

	}

	void feed() {
		// ticker (reduces hunger level, increases thirst level) for all pets
		hungerLevel = hungerLevel - 20;
		waterLevel = waterLevel + 5;
	}

	void giveWater() {
		// ticker (reduces thirst level, increases hunger level) for all pets
		hungerLevel = hungerLevel + 5;
		waterLevel = waterLevel - 20;
	}

	void playWith() {
		// ticker (reduces boredom level, increases hunger level, increases thirst level) for all pets
		hungerLevel = hungerLevel + 10;
		waterLevel = waterLevel + 10;
		wantsToPlay = wantsToPlay - 20;
	}

	void cleanCage() {
		// ticker (reduces messyCage level, increases boredom level) for all pets
		wantsToPlay = wantsToPlay + 10;
		messyCage = messyCage - 20;
	}

	void tick() { // passage of time; changes needs levels for all pets
		hungerLevel = hungerLevel + 5;
		waterLevel = waterLevel + 5;
		wantsToPlay = wantsToPlay + 5;
		messyCage = messyCage + 5;
	}

	@Override
	public String toString() {
		return ("" + name + " " + description);
	}
}
