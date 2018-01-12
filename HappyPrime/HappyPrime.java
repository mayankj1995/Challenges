//Author: Mayank Jain
//Purpose: To find if a number is Happy prime or not

import java.util.ArrayList;

public class HappyPrime {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	//Checks if a number is prime or not, returns true if it is
	public static boolean checkPrime(int num){
		if(num==1)
			return false;
		
		for(int i=2;i<num;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	//Adds all the individual numbers in an integer
	//Example 123 = 1 + 2 + 3 = 6
	public static int splitSqAdd(Integer num){
		int value=0;
		int temp=0;
		while(num != 0){
			temp = num%10;
			value = value + temp*temp;
			num = num/10;
		}
		
		return value;
	}
	//checks if input value 'num' is present in input ArayList 'list'
	//returns false if it is present
	public static boolean checkRepeat(ArrayList<Integer> list, int num){
		for(int i=0;i<list.size();i++){
				if(list.get(i)==num)
					return false;
			
		}
		return true;
	}
	
	//Checks if a number is happy prime or not
	public static boolean finall(int num){
		list.clear();
		if(checkPrime(num)){
			while(num != 1){
				num = splitSqAdd(num);
				if(!checkRepeat(list,num))
					return false;
				list.add(num);
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){

		System.out.println("1. 1: " + finall(1));
		System.out.println("2. 7: " + finall(7));
		System.out.println("3. 383: " + finall(383));
		System.out.println("4. 1000: " + finall(1000));
		
	}
}
