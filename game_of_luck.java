package games;

import java.util.Random;
import java.util.Scanner;

public class game_of_luck

{
	public static void main(String []args)
	{
		Scanner ip=new Scanner(System.in);
		Random rand=new Random();
		
		char ch;
		int dep,bet,rem,luck,dice;
		
		System.out.print("\t\t\t\t\t----Hello Sir Welcome to Casino----\n");
		System.out.print("The rules of this game are :\n1.You will be choosing your lucky number\n2.If the chosen number matches with the generated number you will be awarded 10 times of your bet amount\n3.And if it does'nt match then you will be losing your bet amount");
		System.out.print("\n\nEnter the amount you have to play the game : ");
		dep=ip.nextInt();
		rem=dep;
		
		do
		{
			if(rem==0)
			{
				System.out.print("\nSir the door is that side you may leave ,\"Bye-Bye Kangal\"");
				break;
			}
			
			System.out.print("Enter the betting amount : ");
			bet=ip.nextInt();
			
			if(bet>rem)
			{
				System.out.print("Sir you are not having this much amount to play :(\nPlease Re-enter the amount\n");
			}
			else
			{
				System.out.print("Enter your lucky number between 1 to 10 : ");
				luck=ip.nextInt();
				dice=1+rand.nextInt(9);
					if(luck==dice)
					{
						System.out.printf("Congratulations you won %d rupees : \n",(bet*10));
						rem+=bet*10;
						System.out.printf("Sir now you are left with rupees %d \n\n", rem);
					}
					else
					{
						System.out.printf("Sorry you lose\nThe winning number was %d\n",dice);
						rem-=bet;
						System.out.printf("Sir now you are left with rupees %d\n\n", rem);
					}
			}
			
			System.out.print("Want to try your luck one more time (y/n) : ");
			ch=ip.next(".").charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.printf("Thanx for playing , your remaining amount is %d",rem);
		ip.close();
	}
}

