

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	


	Map<String, VirtualPet> myPets = new HashMap<String, VirtualPet>();
	
	public Collection<VirtualPet> pets() {
		// returns a collection of the pets
		return myPets.values();
	}
	
	public VirtualPet getPet(String name) {
		// returns a virtual pet
		return myPets.get(name);
	}
	
	public void feedPets() {
		// feed all the pets in the shelter
		for (VirtualPet currentPet : myPets.values()) {
			currentPet.feed(); 
		}
	}

	public void waterPets() {
		// water all the pets in the shelter
		for (VirtualPet currentPet : myPets.values()) {
			currentPet.giveWater(); 
		}
	}
	
	public void playWithPet(VirtualPet pet) {
		// play with a specific pet
			pet.playWith(); 
	}

	public void intakePet(VirtualPet pet) {
		// adds pet to the map
		myPets.put(pet.name, pet);
	}
		
	public void adoptPet(VirtualPet pet) {
		// removes a pet from the map
		myPets.remove(pet.name);
	}
	
	
	void tick(){
		// passage of time - call tick on each pet
	}
	
	@Override
	public String toString() {
		return ("\n" + myPets.keySet() + myPets.values());
	}
	
}
