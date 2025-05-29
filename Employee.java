/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diksh
 */

import java.util.*;

public class Employee {
    String EmpID;
    String Empname;
    long EmpPhone;
    float EmpSalary;

    public void accept() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Staff ID: ");
        EmpID = obj.nextLine();
        System.out.println("Enter Name: ");
        Empname = obj.nextLine();
        System.out.println("Enter Phone number: ");
        EmpPhone = obj.nextLong();
        System.out.println("Enter Salary: ");
        EmpSalary = obj.nextFloat();
    }

    public void display() {
        System.out.println("Staff ID: " + EmpID);
        System.out.println("Name: " + Empname);
        System.out.println("Phone: " + EmpPhone);
        System.out.println("Salary: " + EmpSalary);
    }
}

class Teaching extends Employee {
    String domain;
    int n;
    @Override
    public void accept() {
        super.accept();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Domain:");
        domain = obj.nextLine();
        System.out.println("Enter number of Publications:");
        n = obj.nextInt();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Domain:" + domain);
        System.out.println("Publications: " + n);
    }
}

class Technical extends Employee {
    String skill;
    @Override
    public void accept() {
        super.accept();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Technical Skills:");
        skill = obj.nextLine();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Technical Skills: " + skill);
    }
}

class Contract extends Employee {
    int period;
    @Override
    public void accept() {
        super.accept();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Period:");
        period = obj.nextInt();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Contract Period: " + period);
    }
}
