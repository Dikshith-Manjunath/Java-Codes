/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diksh
 */

public class Vehicle{
    int no_of_seats;
    int no_of_wheels;
    public Vehicle(int numseats, int numwheels){
        this.no_of_seats = numseats;
        this.no_of_wheels = numwheels;
    }
    public void showVehicle(){
        System.out.println("Total Number of seats: " + no_of_seats);
        System.out.println("Total Number of wheels: " + no_of_wheels);
    }
    public static void main(String[] args){
        Vehicle motorcycle = new Vehicle(1,2);
        Vehicle car = new Vehicle(5,4);
        System.out.println("Details of Car:");
        car.showVehicle();
        System.out.println("Details of Motorcycle:");
        motorcycle.showVehicle();
    }
}