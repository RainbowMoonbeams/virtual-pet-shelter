import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter shelter = new VirtualPetShelter();

		Scanner input = new Scanner(System.in);

		VirtualPet petFiona = new VirtualPet("Fiona", "has a pink birthmark on her back", 50, 40, 60, 20);
		shelter.intakePet(petFiona);

		VirtualPet petGeorge = new VirtualPet("George", "has a bristle mohawk", 50, 40, 60, 40);
		shelter.intakePet(petGeorge);

		VirtualPet petHenry = new VirtualPet("Henry", "has large tusks", 50, 40, 60, 20);
		shelter.intakePet(petHenry);

		VirtualPet petBibi = new VirtualPet("Bibi", "wears a purple headband", 50, 40, 60, 30);
		shelter.intakePet(petBibi);

		writeLine("Welcome to the Plum Street Pet Shelter!");
		writeLine(
				"We provide food, shelter & interaction to mini hippos.\nOur facilities are open for field trips and we work with various shelters and rehabilitation groups in the area.");

		writeLine("To learn more about our pets, come on in!\n");

		
		do {
			writeLine("\n|Name\t|Hunger\t|Thirst\t|Bored\t|Cage Messiness");
			writeLine("--------|-------|-------|-------|-------");

			for (VirtualPet currentPet : shelter.pets()) {
				writeLine(currentPet.name + "\t|  " + currentPet.hungerLevel + "\t|  " + currentPet.waterLevel + "\t|  "
						+ currentPet.wantsToPlay + "\t|  " + currentPet.messyCage);
			}

			writeLine("\nHow do you want to interact with the mini hippos?\n1 Feed hippos\n2 Give water\n3 Play with\n4 ADOPT!\n5 Surrender a mini hippo to the shelter\nType the number that corresponds to the interaction.");
			String interact = input.next();
			input.nextLine();

			switch (interact) {
			case "1":
				writeLine("Choose a meal to feed the mini hippos:\n1 Fruit\n2 Hay, alfalfa & lettuce\n3 Pumpkins & melon");
				String feed1 = input.next();
				if (feed1.equals("1")) {
					shelter.feedPets();
					writeLine("The hippos LOVE chopped fruits!");
				} else if (feed1.equals("2")) {
					shelter.feedPets();
					writeLine("The hippos will be munching on their meal for a while!");
				} else if (feed1.equals("3")) {
					shelter.feedPets();
					writeLine("Yummy!! Hippos love pumpkin & melon!");
				}
				break;
			case "2":
				shelter.waterPets();
				writeLine("You fill the trough with water and the hippos happily slurp it up.");
				break;
			case "3":
				writeLine("You want to play with the hippos! Which hippo would you like to play with?");
				for (VirtualPet currentPet : shelter.pets()) {
					writeLine(currentPet.name + "\t|  " + currentPet.hungerLevel + "\t|  " + currentPet.waterLevel + "\t|  "
							+ currentPet.wantsToPlay + "\t|  " + currentPet.messyCage);
				} 
				String interact1 = input.next();
				VirtualPet petToPlayWith = shelter.getPet(interact1);
				shelter.playWithPet(petToPlayWith);
				writeLine("You played with " + interact1 + " and it was so much fun! You're both exhausted.");
				break;
			case "4":
				writeLine("You want to adopt a mini hippo!! How noble of you :D\nWhich hippo would you like to adopt?");
				String adoptPet = input.next();
				VirtualPet petToAdopt = shelter.getPet(adoptPet);
				shelter.adoptPet(petToAdopt);
				
				break;
			case "5":
				writeLine("You have a mini hippo to surrender to the shelter? Type \'yes\' or \'no\'");
				String surrenderHippo = input.next();

				if (surrenderHippo.equals("yes")) {
					writeLine("We'd be more than happy to accept your pet! Please tell us your pets name:");
					String newPetName = input.next();
					writeLine(newPetName
							+ " is a lovely name for a mini hippo! Can you give us a description for our website?");
					String newPetDescription = input.next();
					writeLine("Got it! " + newPetName + " " + newPetDescription
							+ " is exactly how we will update the profile on our website!\nWould you like to interact with the hippos here at the shelter?\nType \'status\' or \'leave\'");
					String stayOrLeave = input.next();
				} else {
					writeLine("Would you like to interact with the hipps here at the shelter?\nType \'status\' or \'leave\'");
//					String leaveGame = 
//					if ()
				}
				break;
			default:
				writeLine("Have a great day! Stop by again soon.");
				break;
				
			}
			shelter.tick();

		} while (6 > 5); // (myPets.hungerLevel <= 5) if one pet dies, the
							// shelter gets shut down
//		input.close();
	}

	private static String input(String string) {
		return null;
	}

	public static void writeLine(String message) {
		System.out.println(message);
	}
}
