package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String yesOrNo = " ";
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Honda","Civic", 2017, 17999.99)); //Starting data for ArrayList
        carList.add(new UsedCar("Buick","Century", 2001, 1799.99, 150000));
        carList.add(new Car("Chevy","Cavalier", 2017, 15999.99));
        carList.add(new UsedCar("Ford","Explorer", 2010, 11999.99, 75000));




        System.out.println("Welcome to the Grand Circus Motors admin console!");

        printList(carList);

        System.out.println("Do you want to add or remove a vehicle:");
        yesOrNo = scan1.nextLine();
        yesOrNo = yesOrNo.toLowerCase();

        if (yesOrNo.equals("add")) {

            addNewOrUsed(carList);
        }
        else {

            removeCar(carList);
        }
        printList(carList);
    }

    static Scanner scan1 = new Scanner(System.in); //Scanner outside main to be available to methods


    public static void newCarEntry(ArrayList<Car> carList) { //Enters new cars
        //for (int i = 0; i < numCars; i++) {
            System.out.println("Enter the make:");
            String carMake = scan1.nextLine();

            System.out.println("Enter the model:");
            String carModel = scan1.nextLine();

            System.out.println("Enter the year:");
            int carYear = scan1.nextInt();
            scan1.nextLine();

            System.out.println("Enter the price:");
            double carPrice = scan1.nextDouble();
            scan1.nextLine();

            carList.add(new Car(carMake, carModel, carYear, carPrice));

            printList(carList);


        }

    public static void usedCarEntry(ArrayList<Car> carList) { //Enters used cars
        //for (int i = 0; i < numCars; i++) {
            System.out.println("Enter the make:");
            String carMake = scan1.nextLine();

            System.out.println("Enter the model:");
            String carModel = scan1.nextLine();

            System.out.println("Enter the year:");
            int carYear = scan1.nextInt();
            scan1.nextLine();

            System.out.println("Enter the price:");
            double carPrice = scan1.nextDouble();
            scan1.nextLine();

            System.out.println("Enter the mileage:");
            double carMileage = scan1.nextDouble();
            scan1.nextLine();

            carList.add(new UsedCar(carMake, carModel, carYear, carPrice, carMileage));

            printList(carList);


        }

    public static void removeCar(ArrayList<Car> carList) { //Removes chosen car

        printList(carList);

        System.out.println("Please choose the car to be removed from inventory by number:");
        int carPick = scan1.nextInt();
        scan1.nextLine();

        System.out.println(carList.get(carPick - 1).toString());

        System.out.println("Is this the correct car? (y/n)");
        char yesNo = scan1.nextLine().charAt(0);

        if (yesNo == 'y') {
            carList.remove(carPick - 1);
        }
        else {
            removeCar(carList); //Starts over
        }


    }

    public static void printList(ArrayList<Car> carList) { //Call to print ArrayList values

        System.out.println("Current Inventory:");

        for (int i = 0; i < carList.size(); i++ ) {
            System.out.printf("%d %s \n",i + 1,carList.get(i).toString());
        }
    }

    public static void addNewOrUsed(ArrayList<Car> carList) { //User input for add or remove

        int count = 0;

        System.out.println("How many cars are you entering:");
        int numCars = scan1.nextInt();
        scan1.nextLine();

        while (count < numCars) {
            count++;
            System.out.println("Is this a new or used car:");
            String newUsed = scan1.nextLine();
            newUsed = newUsed.toLowerCase();


            switch (newUsed) {

                case "new":
                    newCarEntry(carList);
                    break;
                case "used":
                    usedCarEntry(carList);
                    break;
            }
        }
    }

    }



