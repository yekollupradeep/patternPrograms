package com.Patterns;

public class Player {
	int jerseyNumber;
	String Playername;
	void displayPlayerDetails() {
		System.out.println("jerseyNumber"+"*"+"PlayerName");
		
	}

	public static void main(String[] args) {
		Player player1=new Player();
		Player player2=new Player();
		player1.displayPlayerDetails();
		player2.displayPlayerDetails();
		

	}

}
