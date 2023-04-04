package com.nexbank.nexonlinebanking;

public class User {

    String name;
    int acc_num;
    double balance;
    String dob;
    String password;
    String email;

    public User() {

    }

    public User(String name, String email, String dob, int acc_num) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.acc_num = acc_num;
        this.balance = 0;
    }

    public User(String name, String email, String dob, int acc_num, double balance) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.acc_num = acc_num;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
