package entity;

public class Account {

    private String accountClient;
    private Integer accountNumber;
    private Integer accountAgency;
    private Double accountBalance;

    public Account(Integer accountNumber, Integer accountAgency, Double accountBalance, String accountClient) {
        this.accountNumber = accountNumber;
        this.accountAgency = accountAgency;
        this.accountBalance = accountBalance;
        this.accountClient = accountClient;
    }

    public Account() {
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountAgency() {
        return accountAgency;
    }

    public void setAccountAgency(Integer accountAgency) {
        this.accountAgency = accountAgency;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountClient() {
        return accountClient;
    }

    public void setAccountClient(String accountClient) {
        this.accountClient = accountClient;
    }

}
