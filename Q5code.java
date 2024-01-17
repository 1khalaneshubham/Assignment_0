// program Q.5: Write a java program, in which according to month no print the no. if days in than month
// input : month = 7;
// Output : july has 31 days
// input : month = 13
// output : invalid month
// input: month = -6
// output: ???


class Demo{
	public static void main(String[] args){

		//int month = 7;
		//int month = 13;
		//int month = -6;
		//int month = 4;
		//int month = -1;
		//int month = 14;
		int month = 8;



		if( month <= 0){
			System.out.println("???");
		}
		else if(month <= 12){
			System.out.println(month+" has 31 days");
		}
		else{
			System.out.println("Invalid month");
		}
	}

}

