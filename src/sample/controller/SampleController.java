package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohSquare;
public class SampleController
{
	public SampleController()
	{
		
	}
	
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(5);
		
		PlayDohSquare mySquare = new PlayDohSquare(1);
		PlayDohSquare bigSquare = new PlayDohSquare();
		
		System.out.println("Hereis my play doh circle");
		System.out.println(firstCircle);
		
		
		
		System.out.println("this is a sample project to show the github and");
		System.out.println("eclipse process so I develop muscle memory :D");
		
		testScanner();
	}

	private void testScanner()
	{
		Scanner firstScanner;// Declares a Scanner object.
		firstScanner = new Scanner(System.in); // Instanciates a Scanner object.
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}
}
