//Author: Mayank Jain
//Purpose: To play tic tac toe 2 player game.

import java.util.Scanner;
public class TicTacToe {
	private char[] c;
	private int turn;
	private char letter;
	private Scanner stdin = new Scanner(System.in);
	
	public TicTacToe(){
		 c = new char[]{'1','2','3','4','5','6','7','8','9'};
		 turn = 1;
		 letter = 'X';
	}
	
	
	
	public void printBoard(){
		System.out.println(
				" "+c[0]+" | "+c[1]+" | "+c[2]+" \n"+
				"-----------\n"+
				" "+c[3]+" | "+c[4]+" | "+c[5]+" \n"+
				"-----------\n"+
				" "+c[6]+" | "+c[7]+" | "+c[8]+" \n");
	}
	public void initGame(){
		System.out.println("Press the number where you want to play");
		printBoard();
		int i;
		for(i=0;i<9;i++){
			play();
			if(turn>4 && checkWinner() )
					break;
		}
		if(i==9)
			System.out.println("Its a tie");
	}
	public boolean checkWinner(){
		if(		(c[0]==c[1] && c[1] ==c[2]) || 
				(c[3]==c[4] && c[4] ==c[5]) ||
				(c[6]==c[7] && c[7] ==c[8]) ||
				(c[0]==c[3] && c[3] ==c[6]) ||
				(c[1]==c[4] && c[4] ==c[7]) ||
				(c[2]==c[5] && c[5] ==c[8]) ||
				(c[0]==c[4] && c[4] ==c[8]) ||
				(c[2]==c[4] && c[4] ==c[6]) ){
			System.out.println("The winner is Player "+letter);
			return true;
		}
		else
			return false;
	}
	public void play(){
		letter = 'X';
		//Checking whose turn it is
		if(turn % 2 == 0){
			letter = 'O';
		}
		
		//Asking the player for input
		System.out.println("Player "+letter+", Enter your move: ");	
		int c = stdin.nextInt();
		
		//printing the board with updated result
		if(this.c[c-1] == 'X' || this.c[c-1] == 'O'){
			System.out.println("This place is alredy taken, try again");
			printBoard();
			play();
		}
		else{
			this.c[c-1] = letter;
			printBoard();
			turn++;
		}
		
	}
	
	
	
	public static void main(String[] args){
		
		TicTacToe newGame = new TicTacToe();
		newGame.initGame();
		
		
	}
}

