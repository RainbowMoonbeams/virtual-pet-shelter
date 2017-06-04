import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
// initializing map "shelter"
		VirtualPetShelter shelter = new VirtualPetShelter();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		VirtualPet petFiona = new VirtualPet("Fiona", " has a pink birthmark on her back. She is so sweet and cuddly. She loves to play with cardboard boxes and to swim.", 70, 40, 60, 20);
		shelter.intakePet(petFiona);

		VirtualPet petGeorge = new VirtualPet("George", " is Mister Personality! He's very particular about his hair (he's got a mohawk) and enjoys getting a massage.", 70, 50, 60, 40);
		shelter.intakePet(petGeorge);

		VirtualPet petHenry = new VirtualPet("Henry", " has large tusks and can be stubborn at times. He doesn't get along well with iguanas, but loves most other animals, especially birds.", 70, 60, 40, 20);
		shelter.intakePet(petHenry);

		VirtualPet petBibi = new VirtualPet("Bibi", " wears a purple headband. She's a bit of a diva, loves to have her picture taken, and has been begging for her own Instagram account.", 70, 40, 60, 30);
		shelter.intakePet(petBibi);

		writeLine("Welcome to the Plum Street Pet Shelter!");
		writeLine("We provide food, shelter & interaction to mini hippos.\nOur facilities are open for field trips and we work with various shelters and rehabilitation groups in the area.");

		writeLine("To interact with our pets, to adopt, or to surrender your own pet, come on in!");
		writeLine("\nMeet our pets!");
		writeLine("-----");
		System.out.println(petFiona);
		System.out.println(petGeorge);
		System.out.println(petHenry);
		System.out.println(petBibi);
		writeLine("-----");
		
		do {
			writeLine("\nBelow is the chart of the animals\' stats. They are happiest when the numbers are around 50.");
			writeLine("\nName\t|Hunger\t|Thirst\t|Bored\t|Cage Messiness");
			writeLine("--------|-------|-------|-------|-------");

			for (VirtualPet currentPet : shelter.pets()) {
				writeLine(currentPet.name + "\t|  " + currentPet.hungerLevel + "\t|  " + currentPet.waterLevel + "\t|  "
						+ currentPet.wantsToPlay + "\t|  " + currentPet.messyCage);
			}

			writeLine("\nHow do you want to interact with the mini hippos?\n1 Meet the pets\n2 Feed hippos\n3 Give water\n4 Play with\n5 Clean cages\n6 ADOPT!\n7 Surrender a mini hippo to the shelter\nType the number that corresponds to the interaction.");
			String interact = input.next();
			input.nextLine();

			switch (interact) {
			case "1":
				writeLine("Meet our pets!");
				writeLine("-----");
				for (VirtualPet currentPet : shelter.pets()) {
					writeLine(currentPet.name + currentPet.description);
				}
				writeLine("-----");
				writeLine("\nHow do you want to interact with the mini hippos? Type the number that corresponds to the interaction.");
				String interact1 = input.next();
				input.nextLine();
				
				
				
			case "2":
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
			case "3":
				shelter.waterPets();
				writeLine("You fill the trough with water and the hippos happily slurp it up.");
				break;
			case "4":
				writeLine("You want to play with the hippos! Which hippo would you like to play with?\n");
				for (VirtualPet currentPet : shelter.pets()) {
					writeLine(currentPet.name + "\t|  " + currentPet.hungerLevel + "\t|  " + currentPet.waterLevel + "\t|  "
							+ currentPet.wantsToPlay + "\t|  " + currentPet.messyCage);
				} 
				String interact2 = input.next();
				VirtualPet petToPlayWith = shelter.getPet(interact2);
				shelter.playWithPet(petToPlayWith);
				writeLine("You played with " + interact2 + " and it was so much fun! You're both exhausted.");
				break;
			case "5":
				// clean cages
				shelter.messyCage();
				writeLine("You cleaned the animals' cages and now you need a shower...");
				break;
			case "6":
				writeLine("You want to adopt a mini hippo!! How noble of you :D");
				writeLine("\nWhich hippo would you like to adopt?");
				writeLine("-----");
				System.out.println(petFiona);
				System.out.println(petGeorge);
				System.out.println(petHenry);
				System.out.println(petBibi);
				writeLine("-----");
				
				String adoptPet = input.next();
				VirtualPet petToAdopt = shelter.getPet(adoptPet);
				shelter.adoptPet(petToAdopt);

				if (adoptPet.equals("Fiona")) {
					writeLine("Fiona ");
				} else if (adoptPet.equals("George")) {
					writeLine("George ");
				} else if (adoptPet.equals("Henry")) {
					writeLine("Henry ");
				} else {
					writeLine("You chose Bibi. ");
				}
				break;
			case "7":
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
				System.exit(0);
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
