/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diksh
 */

class EmployeeFour {
    public static void main(String[] args) {
        Teaching teach = new Teaching();
        System.out.println("Enter the details of Teaching Staff:");
        teach.accept();
        Technical tech = new Technical();
        System.out.println("Enter the details of Technical Staff:");
        tech.accept();
        Contract con = new Contract();
        System.out.println("Enter the details of Contract Staff:");
        con.accept();
        System.out.println("The details of Teaching Staff:");
        teach.display();
        System.out.println("The details of Technical Staff:");
        tech.display();
        System.out.println("The details of Contract Staff:");
        con.display();
    }
}