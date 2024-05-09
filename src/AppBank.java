import java.util.Scanner;

import entity.Account;

public class AppBank {
    public static void main(String[] args) throws Exception {

        Account account1 = new Account();
        Scanner scanner = new Scanner(System.in);

        // TODO: terminar implementação
        System.out.println("Please insert account client name: ");
        String clientNameScan = scanner.nextLine();
        account1.setAccountClient(clientNameScan);

        System.out.println("Please insert account number: ");
        Integer accountNumberScan = scanner.nextInt();
        account1.setAccountNumber(accountNumberScan);

        System.out.println("Please insert account agency: ");
        Integer accountAgencyNumber = scanner.nextInt();
        account1.setAccountAgency(accountAgencyNumber);

        System.out.println("Please insert account balance: ");
        Double accountBalanceScan = scanner.nextDouble();
        account1.setAccountBalance(accountBalanceScan); 

        System.out.println("Hello, " + account1 .getAccountClient() + ". Thank you for creating an account in our bank." +
         " Your account number is " + account1.getAccountNumber() + " and your agency is " + account1.getAccountAgency()
          + ", your balance " + account1.getAccountBalance() + " is ready for whitdraw");

        scanner.close();

    }
}
