package com.example.car;
// the car class is like an blueprint
public class Car {
    // Instance Variables
    int maxSpeed = 100;
    int minSpeed = 0;
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    boolean isTheCarOn = false;
    char condition = 'L';
    String nameOfCar = "Lawe";

    double weight = 4079;
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    // Create a custom car with a constructor
    public Car() {

    }
    //Getters & setter
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }


    public int getNumberOfPeopleInCar() {
        return this.numberOfPeopleInCar;
    }


    public void setNumberOfPeopleInCar(int newNumberOfPeopleInCar) {
        this.numberOfPeopleInCar = newNumberOfPeopleInCar;
    }


    public int getMaxNumberOfPeopleInCar() {
        return this.maxNumberOfPeopleInCar;
    }

    public void setMaxNumberOfPeopleInCar(int newMaxPeopleInCar) {
        this.maxNumberOfPeopleInCar = newMaxPeopleInCar;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getMaxFuel() {
        return this.maxFuel;
    }

    public double getCurrentFuel() {
        return this.currentFuel;
    }

    public double getMpg() {
        return this.mpg;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public char getCondition() {
        return this.condition;
    }

    public String getNameOfCar() {
        return this.nameOfCar;
    }

    public Car (int customMaxSpeed,
                double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    // Properties
    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void expandSeats() {
        setMaxNumberOfPeopleInCar(getMaxNumberOfPeopleInCar() + 2);
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar ++;
            System.out.println("Someone got in.");
        } else {
            System.out.println("The car is full." +
                    numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar +
                    " People Is in the car");
        }
    }

    public void getOut() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar --;
        }
        else {
            System.out.println("The car is empty " + numberOfPeopleInCar);
        }
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillup() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        }
        else {
            System.out.println("The car is already on " + isTheCarOn);
        }
    }

    public  static void main(String[] args) {
        Car lawesCar = new Car();
        lawesCar.getOut();
        lawesCar.getOut();
        lawesCar.getIn();
        lawesCar.getIn();
        lawesCar.getIn();
        lawesCar.getIn();
        lawesCar.getIn();
        lawesCar.getIn();
        lawesCar.getIn();
        lawesCar.turnTheCarOn();
        lawesCar.turnTheCarOn();
    }
}
