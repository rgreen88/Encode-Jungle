import java.util.Random;

public class Jungle {

	public static void main(String[] args) {

		

/*Assessment Problem Definition – Part 1: 
 
Create the objects that you feel would best model a jungle using your best OO design and coding practices based on the following requirements.
Be ready to submit any and all work, including partial work, at the end of one hour.
1. The jungle contains several species of animals; tigers, monkeys and snakes.
2. All animals can do three things, make a sound, eat food, and sleep.
3. Each species of animal knows how many others of its kind exist.
4. By default when an animal’s energy level changes, it changes in the following ways:
     a. -3 for making a sound
     b. +5 for eating food
     c. +10 for sleeping
5. The jungle can perform a sound off. This involves all of the animals in the jungle each making their sound, along with reporting their energy level.
6. Tigers get +5 energy for sleeping.
7. Monkeys get +2 energy for eating and -4 energy for making a sound.
8. Some animals have the ability to play.
9. Only monkeys can play. When they do they say "Oooo Oooo Oooo" and get -8 energy. If a monkey doesn't have enough energy to play they say "Monkey is too tired".
10. The jungle contains several types of food; meat, fish, bugs and grain.
11. Tigers can't eat grain because they have sensitive digestive systems.
12. Bonus Item: The jungle can have each animal perform a random activity out of the ones possible for that animal. Include Unit tests if you would like to do so.
*/
		Jungle jungle = new Jungle();
		jungle.Monkey();
		jungle.Tiger();
		jungle.Snake();
	}
	
	String[] food = {"meat", "bugs", "fish", "grain"};
	int tigerEnergy, monkeyEnergy, snakeEnergy, sleeping = 10, eating = 5, sound = -3;
	boolean eat, sleep, play;
	
	
	public void Monkey() {
		
		monkeyEnergy = 0;
		
		
		//randomized boolean
		 
		eat = getRandomBoolean();
		sleep = getRandomBoolean2();
		play = getRandomBoolean3();
		
		if(eat = true)
			monkeyEnergy += eating + 2;
		if (sleep = true)
			monkeyEnergy += sleeping;
		if(play = true) {
				if(monkeyEnergy > 8) {
					monkeyEnergy -= 8;
					System.out.println("Monkey plays: \"Oooo Oooo Oooo\" and loses 8 energy!");
				}
				else {
					System.out.println("Monkey is too tired to play!");
				}
			}
		
			
		monkeyEnergy += SoundOff();
		
				
		System.out.println("Monkey has " + monkeyEnergy + " left after sounding off!");
					
	}
	//public void monkeyActions()
	//+2 energy eating  -4 energy making sound
	//if play -8 energy and says "Oooo Oooo Oooo"  
	//else "Monkey is too tired"
	//sleep = +10 energy
	//eat = 5 energy totaling to +7 energy --- can eat everything
	//sound = -3 energy totaling to -7 energy and report total energy left
	//return monkeyEnergy
	
	
	public void Tiger() { //can't eat grain
		
		tigerEnergy = 0;
		
		eat = getRandomBoolean();
		sleep = getRandomBoolean2();
	
		String temp;
		int i = getRandomArraySlot();
		temp = food[i];
		
		if(eat = true)

			if(temp != "grains")
				tigerEnergy += eating;
			else
				tigerEnergy += 0;
			
		if (sleep = true)
			tigerEnergy += sleeping + 5;	
		
			
		tigerEnergy += SoundOff();
		
				
		System.out.println("Tiger has " + tigerEnergy + " left after sounding off!");
		
	}
	
	//public void tigerActions()
	//tigers get +5 extra energy for sleeping
	//can't eat grains = 0 energy ------------------- eats meat, fish, bugs
	//sleep = +10 energy totaling to +15 energy
	//eat = 5 energy totaling to +7 energy
	//sound = -3 energy and report total energy left
	
	
	public void Snake() {
		
		snakeEnergy = 0;
		
		eat = getRandomBoolean();
		sleep = getRandomBoolean2();
		
		if(eat = true)
			snakeEnergy += eating;
		if (sleep = true)
			snakeEnergy += sleeping;		
			
		snakeEnergy += SoundOff();
		
				
		System.out.println("Snake has " + snakeEnergy + " left after sounding off!");
		
		
	}
	
	//public void snakeActions()
	//sleep = +10 energy
	//eat = 5 energy totaling to +7 energy ---------------can eat everything
	//sound = -3 energy and report total energy left
	
	public int SoundOff() {
		
		return -3;
		
	}
	//Fix Random Classes!!
	public boolean getRandomBoolean() {
	    
		Random rng = new Random();
	    return rng.nextBoolean();
	    
	}
	public boolean getRandomBoolean2() {
	    
		Random rng = new Random();
	    return rng.nextBoolean();
	    
	}
	public boolean getRandomBoolean3() {
	    
		Random rng = new Random();
	    return rng.nextBoolean();
	    
	}
	
	public int getRandomArraySlot(){
		
		Random rand = new Random();
		return rand.nextInt(4);
		
	}
	
	

}
