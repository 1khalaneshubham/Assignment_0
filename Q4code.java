// program Q.4 Write a java program the checks a number from 0 to 5 and print its spelling, if the number is greather than 5 print the number is greather than 5


class Demo{
	public static void main(String[] args){

		//int num = 5;
		//int num = 6;
		//int num = -6;
		//int num = -4;
		int num = 0;

		if(num <= 0 ){
			System.out.println("???");
		}
		else if(num ==  1){
			System.out.println("ONE");
		}
		else if(num == 2){
			System.out.println("TWO");
		}
		else if(num == 3){
			System.out.println("THREE");
		}
		else if(num == 4){
			System.out.println("FOUR");
		}
		else if(num == 5){
			System.out.println("FIVE");
		}
		else{
			System.out.println("Number is greather than 5");
		}
	}
}

