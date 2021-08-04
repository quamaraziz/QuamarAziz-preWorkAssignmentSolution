import java.util.Scanner;

//code for palindrome
class Palindrome{
	int temp;
	public void palindrome(int num){
		temp= num;
		int num2 = 0;
		int multiplier = 0;
		while(temp!=0){
			num2 = temp%10;
			multiplier = num2+(multiplier*10);
			temp = temp /10;
		}
		if(multiplier==num)
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");
	}
}

//code for pattern
class Pattern{
	public void pattern(int num){
		for(int i = num; i>=0 ; i--){
			for(int j = 0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//code for prime number
class Prime{
	int count=0;
	public void prime(int num){
		for(int i =1; i<=(num/2); i++){
			if(num%i==0)
				count += 1;
		}
		if(count>1)
			System.out.println("Not a prime number.");
		else
			System.out.println("Prime Number.");
	}
}

//code for fibonacci number
class Fibonacci{
	public void fibonacci(int num){
		num = num-2;
		int a= 0;
		int b= 1;
		int c;
		System.out.print(a+","+b);
		while(num!=0){
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			num--;
		}
	}
}

class Main{
	public static void main(String[] args) {
		int input;
		int temp;
		System.out.println("Please enter your input:");
		System.out.printf("1 => for Palindrome\n2 => for Patter\n3 => for Prime Number\n4 => fir Fibonacci.\nEnter input :");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		System.out.println();

		switch(input){
			case 1:
				Palindrome obj = new Palindrome();
				System.out.print("Enter an Integer :");
				temp = sc.nextInt();
				obj.palindrome(temp);
				break;
			case 2:
				Pattern obj2 = new Pattern();
				System.out.print("Enter an Integer :");
				temp = sc.nextInt();
				obj2.pattern(temp);
				break;
			case 3:
				Prime obj3 = new Prime();
				System.out.print("Enter an Integer :");
				temp = sc.nextInt();
				obj3.prime(temp);
				break;
			case 4:
				Fibonacci obj4 = new Fibonacci();
				System.out.print("Enter an Integer :");
				temp = sc.nextInt();
				obj4.fibonacci(temp);
				break;
			default:
				System.out.println("Invalid Input.");	
		}
	
		
	}
}