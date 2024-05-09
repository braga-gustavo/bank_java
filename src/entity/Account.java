package entity;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {

    private String accountClient;
    private Integer accountNumber;
    private Integer accountAgency;
    private BigDecimal accountBalance;

    public Account(Integer accountNumber, Integer accountAgency, BigDecimal accountBalance, String accountClient) {
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

    public String getAccountBalance() {
        return formatCurrency(accountBalance);
        
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountClient() {
        return accountClient;
    }

    public void setAccountClient(String accountClient) {
        this.accountClient = accountClient;
    }

    private String formatCurrency(BigDecimal accountBalanceToFormat){
        Locale br = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        NumberFormat nf = NumberFormat.getCurrencyInstance(br);
        String accountBalanceFormatted = nf.format(accountBalanceToFormat);
        return accountBalanceFormatted;
    }

}
