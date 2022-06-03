package com.techelevator.bankaccount;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

    @Test
    public void withdraw_returns_147_given_150_to_start_and_withdraw_1() {
        //Arrange
        SavingsAccount savingsAccount = new SavingsAccount("Walt", "12345", 150);

        //Act
        int remainingBalance = savingsAccount.withdraw(1);

        //Assert
        Assert.assertEquals(147, remainingBalance);
    }

    @Test
    public void withdraw_is_prevented_when_withdrawing_more_than_net_withdraw_and_fee() {
        //Arrange
        SavingsAccount savingsAccount = new SavingsAccount("Walt", "12345", 100);

        //Act
        int remainingBalance = savingsAccount.withdraw(99);

        //Assert
        Assert.assertEquals(100, remainingBalance);
    }

    @Test
    public void withdraw_is_prevented_when_withdrawing_negative_amount() {
        //Arrange
        SavingsAccount savingsAccount = new SavingsAccount("Walt", "12345", 1000);

        //Act
        int remainingBalance = savingsAccount.withdraw(-1);

        //Assert
        Assert.assertEquals(1000, remainingBalance);
    }
}
