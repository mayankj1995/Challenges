import java.util.ArrayList;

public class HappyPrime {
	public static ArrayList<Integer> list = new ArrayList<Integer>();

	public static boolean checkPrime(int num){
		if(num==1)
			return false;
		
		for(int i=2;i<num;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	
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
	public static boolean checkRepeat(ArrayList<Integer> list, int num){
		for(int i=0;i<list.size();i++){
				if(list.get(i)==num)
					return false;
			
		}
		return true;
	}
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
