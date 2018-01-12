Assignment 2- part1
Name: Mayank Jain
Submission Date: 09/30/2015
—————————————————————

Purpose: Play Tic Tac Toe 2 player
Input: an integer between 1 - 9
Output: Updated TicTacToe Board

——————————————————————

This program needs to import java.util.Scanner to take the users input.

1. we declare a one dimensional array to keep track of the users input.
	The array is initialized with the numbers 1-9.

 1 | 2 | 3 
-----------
 4 | 5 | 6 
-----------
 7 | 8 | 9

here the position 1 is defined by array[0] and so on.

2. The method ‘printBoard’ just prints the board with the values from the array.

3. The method ‘checkWinner’ checks if there is a winner by comparing all the possible combinations to win in a single if/else statement.

4. The variable turn keeps track of the turn.

5. The method ‘play’ first checks whose turn it is and thus assigns the value to the variable ‘letter’. Then it asks that player to input. If that place is already taken by ‘X’ or ‘O’ then the play() function is called again. Else we print the board with updated result.

6. In the method ‘initGame’ we use a for loop to call the method ‘play()’ 9 times. If somebody wins before that we break the loop. We only check the winner after 4 turns as it is not possible to win before that. We check a tie by seeing if the for loop ran all the 9 times. 