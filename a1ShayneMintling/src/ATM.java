import java.util.Scanner;

public class ATM {

    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        Account[] accountID = new Account[10];
        for (int i = 0; i < accountID.length; i++) {
            accountID[i] = new Account(i);
        }
        int id;
        int option;
        boolean check;
        while (true) {
            id = mainMenu();
            atmMenu(id);
            do {
                System.out.print("Enter option: ");
                option = rangeCheck(Input.nextInt(), 1, 4);
                switch (option) {
                    case 1 -> System.out.printf("Account balance = $%2f\n", accountID[id].getBalance());
                    case 2 -> {
                        System.out.print("Deposit Amount = $");
                        check = accountID[id].deposit(Input.nextDouble());
                        while (!check) {
                            System.out.println("Operation unsuccessful!");
                            System.out.print("New deposit amount: $");
                            check = accountID[id].deposit(Input.nextDouble());
                        }
                        System.out.printf("Account balance = $%2f\n", accountID[id].getBalance());
                    }
                    case 3 -> {
                        System.out.print("Withdrawal Amount = $");
                        check = accountID[id].withdraw(Input.nextDouble());
                        while (!check) {
                            System.out.println("Operation unsuccessful!");
                            System.out.print("New withdrawal amount: $");
                            check = accountID[id].withdraw(Input.nextDouble());
                        }
                        System.out.printf("Account balance = $%2f\n", accountID[id].getBalance());
                    }
                    case 4 -> System.out.println();
                }
            } while (option != 4);
        }
    }


    private static int mainMenu() {
        System.out.print("""
                ----------------------------------
                MAIN MENU
                ----------------------------------
                Enter account ID:\s""");
        return rangeCheck(Input.nextInt(), 0, 9);
    }

    private static void atmMenu(int userID) {
        System.out.print("""
                ----------------------------------
                ATM MENU FOR ACCOUNT
                ----------------------------------
                1: Check balance
                2: Deposit
                3: Withdraw
                4: Exit

                """);
    }

    private static int rangeCheck(int number, int low, int high) {
        while (number < low || number > high) {
            System.out.printf("Valid options (%d - %d): ", low, high);
            number = Input.nextInt();
        }
        return number;
    }
}

//if withdraw is enter when balance is 0 infinite operation unsuccessful




