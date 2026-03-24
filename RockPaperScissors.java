package games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"Rock", "Paper", "Scissors"};
		int playerChoice, computerChoice;
		int round = 1;
		int c_score = 0;
		int p_score = 0;
		String stillPlaying;
		
		
		System.out.println("Welcome to Rock, Paper, Scissors! \n");
		
		while(true) {
			System.out.println(" ");
			System.out.println("ROUND " + round);
			
			System.out.println(" ");
			
			System.out.println("Choose an option: ");
			System.out.println("1 - Rock");
			System.out.println("2 - Paper");
			System.out.println("3 - Scissors");
		
		
		
			System.out.println(" ");
			
			
			System.out.println("Are you playing (Yes or No): ");
			stillPlaying = scanner.next();
			
			
			
		
			if(stillPlaying.equalsIgnoreCase("No")) {
				System.out.println("Game Over");
				break;
			}
			
			
		
		
			System.out.println("Enter your choice (1-3): ");
			playerChoice = scanner.nextInt() - 1;  
			
				
			
			if (playerChoice < 0 || playerChoice > 2) {
				System.out.println("Invalid choice! Please select 1, 2, or 3");
				continue;
				}
			
				
				
				computerChoice = random.nextInt(3);
				
				System.out.println(" ");
					
				System.out.println("You chose:  " + choices[playerChoice]);
				System.out.println("The computer chose:  " + choices[computerChoice]);
					
				if (playerChoice == computerChoice) {
					System.out.println(" ");
					System.out.println("It's a tie!");
					c_score++;
					p_score++;
					}
				else if ((playerChoice == 0 && computerChoice == 2) || // rock beats scissors
					(playerChoice == 1 && computerChoice == 0) || // paper beats rock
					(playerChoice == 2 && computerChoice == 1)) // scissors beats paper
					{
					System.out.println(" ");
					System.out.println("You win!");
					p_score++;
					}
				else {
					System.out.println(" ");
					System.out.println("The computer wins!\n");
					c_score++;
					}
				
				System.out.println(" ");
				System.out.println("SCORE - You: " + p_score + " | Computer: " + c_score);   
				round++;
			
		}
		
		
		
		
		scanner.close();
		
		}

	}


