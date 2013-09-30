
public class Animal {

	public String animalHabitat,animalSound,animalFoodType;
	
	public String move()
	{
		String ret="";
		if ((animalHabitat).equalsIgnoreCase("Terrestrial"))
		{
			ret="walk";
		}
		else if ((animalHabitat).equalsIgnoreCase("Aquatic"))
		{
			ret="swim";
		}
		return ret;
	}
	
	public String cry()
	{
		return animalSound;
	}
	
	public String eat()
	{
		String ret="";
		if ((animalFoodType).equalsIgnoreCase("Carnivore"))
		{
			ret="meat";
		}
		else if ((animalFoodType).equalsIgnoreCase("Herbivore"))
		{
			ret="plants";
		}
		else if ((animalFoodType).equalsIgnoreCase("Omnivore"))
		{
			ret="plantsmeat";
		}
		return ret;
	}
}
