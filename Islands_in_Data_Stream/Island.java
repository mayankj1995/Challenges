//Author: Mayank Jain
//Purpose: To find the number of islands in a list of 12 numbers (island definition is included in the read me file)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Island {
	
	//Checks if all elements in an array is greater than input value 'prev' and 'next'	
	public static boolean checkArray(int prev, ArrayList<Integer> spare, int next){
		for(int i=0;i<spare.size();i++)
			if(spare.get(i)<=prev || spare.get(i)<=next)
				return false;
		return true;
	
	}
	//prints all the elements in an array
	public static void printall(ArrayList<Integer> spare){
		for(int i=0;i<spare.size();i++){
			System.out.print(spare.get(i));
		}
		System.out.println("");
	}
	
	//Checks if there are islands in the array 'num'
	public static int check_island(int[] num){
		int x=0;
		ArrayList<Integer> spare = new ArrayList<Integer>();
		for (int i=1;i<num.length;i++){
			spare.clear();
			if(num[i]>num[i-1]){
				for(int j=i;j<num.length-1;j++){
					spare.add(num[j]);
					if(checkArray(num[i-1],spare,num[j+1])){
						//Uncomment this to see all the islands
						//printall(spare);
						x++;
					}
				}
			}
		}
		System.out.print(Arrays.toString(num) + ": ");
		return x;
	}
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Checking all the default cases");
		int[] num1 = {0,0,1,1,2,2,1,1,0,1,2,0};
		int[] num2 = {0,1,2,4,3,1,3,4,5,2,1,0};
		int[] num3 = {0,1,2,4,4,1,0,2,4,1,0,0};
		int[] num4 = {0,1,2,3,4,5,6,7,8,9,10,0};
		System.out.println(check_island(num1));
		System.out.println(check_island(num2));
		System.out.println(check_island(num3));
		System.out.println(check_island(num4));
		
		System.out.println("Now you can as well");
		System.out.println("The first line of the input must be the number of datasets");
		System.out.println("Each Dataset must consist a single line of input."); 
		System.out.println("It must start with the dataset number K, followed"
				+ "\n by a list 12 digit number seperated by a space");
		
		int num_of_rows = stdin.nextInt();
		int[][] num = new int[num_of_rows][13];
		
		for (int i=0;i<num_of_rows;i++) {
		    for (int j=0;j<12;j++) {
		    	try{
		    		num[i][j] = stdin.nextInt();
		    	}
		    	catch (InputMismatchException e){
		    		stdin.next();
		    		j=j-1;
		    	    System.out.print("That’s not an integer. Try again: ");
		    	   }
		    }
		}
		System.out.println(check_island(num[0]));
		
		
	}

}
