package sample.model;

public class PlayDohSquare
{

	//Declaration section
	//Data member section
	//NEED TO BE PRIVATE
	private int weight;
	
	public PlayDohSquare()
	{
		this.weight = 20;
	}
	
	public PlayDohSquare(int weight)
	{
		this.weight = weight;
	}
	public String toString()
	{
		String description = "I am a PlayDohSquare and my size is " + weight;
		return description; 
	}
}