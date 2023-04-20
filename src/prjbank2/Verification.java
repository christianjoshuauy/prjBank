/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjbank2;

/**
 *
 * @author L14Y09W14
 */
public class Verification {
    private String customerUsername;
    private String accountNumber;
    private double amount;
    private String typeOfTransaction;
    private int status;

    public Verification(String customerUsername, String accountNumber, double amount, String typeOfTransaction) {
        this.customerUsername = customerUsername;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.typeOfTransaction = typeOfTransaction;
        this.status = 0;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
