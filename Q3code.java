//  Q.3-program 3: Write a java program ,take a number and print whether it is postive or negative 
//  input: num = 5
//  output:5 is postive number
//  input: num = -9
//  output:-9 is a neagative number
//  input: num = 0
//  output: ???????



class Demo{
	public static void main(String[] args){

		//int num = 5;.................> input1
		//int num = -9;................> inpu2
		int num = 0;


		if( num == 0){
			System.out.println("???????");
		}
		else if(num > 0){
			System.out.println(num+" is postive number");
		}
		else{
			System.out.println(num+" is neagative number");
		}
	}
}
