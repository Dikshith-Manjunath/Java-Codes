/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diksh
 */

class BankBal {
    public static void main(String[] args) {
        try {
            balance.Account a = new balance.Account();  // creating object of Account class
            a.read();  // calling the read method
            a.disp();  // calling the display method
        } catch (Exception e) {
            System.out.println(e);  // handling any exceptions that may occur
        }
    }
}