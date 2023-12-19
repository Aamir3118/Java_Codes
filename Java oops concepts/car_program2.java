// Convertible interface
interface Convertible {
    void openRoof();
    void closeRoof();
}

class Engine {
    boolean isOn;

    public Engine() {
        this.isOn = false;
    }

    public void start() {
        if (!isOn) {
            System.out.println("Engine started.");
            isOn = true;
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stop() {
        if (isOn) {
            System.out.println("Engine stopped.");
            isOn = false;
        } else {
            System.out.println("Engine is already off.");
        }
    }
}
class Car {
    String brand;
    String model;
    int year;
    Engine engine;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine status: " + (engine.isOn ? "Running" : "Off"));
    }
}

class SportsCar extends Car implements Convertible {
    boolean isRoofOpen;

    public SportsCar(String brand, String model, int year) {
        super(brand, model, year);
        this.isRoofOpen = false;
    }

    @Override
    public void openRoof() {
        if (!isRoofOpen) {
            System.out.println("Convertible roof opened.");
            isRoofOpen = true;
        } else {
            System.out.println("Roof is already open.");
        }
    }

    @Override
    public void closeRoof() {
        if (isRoofOpen) {
            System.out.println("Convertible roof closed.");
            isRoofOpen = false;
        } else {
            System.out.println("Roof is already closed.");
        }
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Convertible roof status: " + (isRoofOpen ? "Open" : "Closed"));
    }
}


class CarProgram2 {
    public static void main(String[] args) {
        Car myCar = new Car("Tata", "Tata Nexon", 2022);
        SportsCar mySportsCar = new SportsCar("Ferrari", "Spider", 2023);

        // Displaying car information
        myCar.displayInfo();
        mySportsCar.displayInfo();
        System.out.println("---------");

        // Starting the engines
        myCar.start();
        mySportsCar.start();
        System.out.println("---------");

        // Displaying updated information
        myCar.displayInfo();
        mySportsCar.displayInfo();
        System.out.println("---------");

        // Opening the roof
        ((Convertible) mySportsCar).openRoof();

        // Displaying final information
        myCar.displayInfo();
        mySportsCar.displayInfo();
        System.out.println("---------");

        // Closing the roof for the sports car
        ((Convertible) mySportsCar).closeRoof();

        // Displaying final information
        myCar.displayInfo();
        mySportsCar.displayInfo();
        System.out.println("---------");
    }
}
