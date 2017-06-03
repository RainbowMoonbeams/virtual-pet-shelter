
public class VirtualPet {

	String name;
	String description;
	int hungerLevel;
	int waterLevel;
	int wantsToPlay;
	int messyCage;

	public VirtualPet(String name, String description, int hungerLevel, int waterLevel, int wantsToPlay, int messyCage) {
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
		hungerLevel = hungerLevel - 20;
		waterLevel = waterLevel + 5;
	}

	void giveWater() {
		hungerLevel = hungerLevel + 5;
		waterLevel = waterLevel -20;
	}

	void playWith() {
		hungerLevel = hungerLevel + 10;
		waterLevel = waterLevel + 10;
		wantsToPlay = wantsToPlay - 20;
	}

	void tick() { // passage of time
		hungerLevel = hungerLevel + 5;
		waterLevel = waterLevel + 5;
		wantsToPlay = wantsToPlay + 5;
	}
	@Override
	public String toString() {
		return ("" + name + " " + description);
	}
}
