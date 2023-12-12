package day2;

import java.util.Scanner;

public class BankApp {

	static Account acc = null;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println();
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Details");
			System.out.println("5.Exit");
			System.out.println();
			System.out.println("Select an Option");
			int option = s.nextInt();
			switch (option) {

			case 1:
				if (acc == null) {
					createAccount();
				}else {
					System.out.println("Account already exist please proceed forward..");
				}
				
				break;

			case 2: {
				if (acc != null) {
					System.out.print("Enter amount to deposit: ");
					double amt = s.nextDouble();
					acc.addAmount(amt);
					System.out.println("Rs." + amt + " Credited | Balance: " + acc.balance);

				} else
					System.out.println("please open a a/c with us...");
				break;
			}

			case 3: {

				if (acc != null) {
					System.out.print("Enter amount to withdraw: ");
					double amt = s.nextDouble();
					acc.debitAmount(amt);
					
						System.out.println("Rs." + amt + " debited | Balance: " + acc.balance);

				}
			}

			case 4: {
				if (acc != null) {
					System.out.println(acc.getDetails());
				} else
					System.out.println("please open a a/c with us...");
				break;
			}

			case 5:
				System.out.println("Thanku for banking with us!....");
				System.exit(0);
			}
		}

	}

	public static void createAccount() {
		System.out.print("Enter a/c number: ");
		long accNo = s.nextLong();
		s.nextLine();
		System.out.print("Enter name: ");
		String name = s.nextLine();
		System.out.print("Enter initial deposit: ");
		double inidepo = s.nextDouble();

		System.out.println("Please select the account type:\n" + "1.Savings Account\n" + "2.Current Account");
		int acctype = s.nextInt();
		if (acctype == 1) {
			acc = new SavingAccount(accNo, name, inidepo);
			System.out.println("Account Opened");
		} else if (acctype == 2) {
			acc = new CurrentAccount(accNo, name, inidepo);
		} else {
			System.err.println("Please give valid input");
			createAccount();
		}
	}
}
