package parties;
import java.util.Scanner;
public class ATMtransaction {

	public static void main(String args[]) {
		
		int balance = 100000, deposit, withdraw;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("ATM Transection Machine");
			System.out.println("chose 0 for cardValidatin");
			System.out.println("chose 1 for Withdraw");
			System.out.println("chose 2 for Deposit");
			System.out.println("chose 3 fror Balance");
			System.out.println("chose 4 for Exit");
			System.out.println("chose the operatin you ant to Perfome :- ");
			int n = s.nextInt();
			switch (n) {
			case 0:
				System.out.println("Enter Card Numer");
				String word1 = s.next();
				if(word1.length() >= 12) {
					System.out.println("your card number is access");
				}else {
					System.out.println("your card is invalid");
				}
				break;
			case 1:
				System.out.println("Enter the withdraw amount");
				withdraw = s.nextInt();
				if(balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please Collect the Amount");
							
				}else {
					System.out.println("Insufficient Balance");
				}
		 
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter Deposit Money");
				deposit  = s.nextInt();
				balance = balance + deposit;
				System.out.println("Successfully Deposit your money");
				System.out.println("");
			break;
			
			case 3:
				System.out.println("Balance   " + balance);
				System.out.println("");
			break;
			case 4:
				System.exit(0);
			}
			
		}
	}
}
