import java.math.BigDecimal;
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
        BigDecimal accountBalanceScan = scanner.nextBigDecimal();
        account1.setAccountBalance(accountBalanceScan);

        System.out.println("Hello, ".concat(account1.getAccountClient())
                .concat(". Thank you for creating an account in our bank.")
                .concat(" Your account number is ")
                .concat(String.valueOf(account1.getAccountNumber()))
                .concat(" and your agency ")
                .concat(String.valueOf(account1.getAccountAgency()))
                .concat(" your balance ")
                .concat(account1.getAccountBalance())
                .concat(" is ready for withdraw"));

        scanner.close();

    }
}
