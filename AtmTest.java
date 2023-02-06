    import java.util.Scanner;
    public class AtmTest {
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            Bank bank = new Bank("My Bank");
            ATM atm = new ATM(bank);

            Account account = new Account(500);
            Customer customer = new Customer("John Doe", account);
            // bank.addAccount(account);

            Session session = new Session(customer, atm);

            Transaction depositTransaction = new Transaction(session, 200, false);
            depositTransaction.execute();

            Transaction withdrawTransaction = new Transaction(session, 100, true);
            withdrawTransaction.execute();


             System.out.println("ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 EXIT");
            System.out.println("Choose the operation:");

            System.out.print("Choose the number");
            int choice = sc.nextInt();
                  switch(choice){
                    case 1 : 
                        System.out.println("Enter the Amount you want to withdraw");
                        int cash = sc.nextInt();
                        account.withdraw(cash);
                        System.out.println("Amount is hold " + account.getBalance());

                    break;
                    
                    case 3 :
                         System.out.println("Your Amount is " + account.getBalance());
                    break;

                    case 2 : 
                        System.out.println("Enter the Amount you want to Deposit");
                        int in = sc.nextInt();
                        account.deposit(in);

                        System.out.println("Your Amount Deposited Successfully");
                        System.out.println("Your Balance is " + account.getBalance());

                    break;

                    case 4 :
                        System.exit(0);

                  }

        }
    }