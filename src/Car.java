public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void start(){
        System.out.println("Car engine is starting... Vroom!");
    }

    public void honk() {
        System.out.println("Beep beep!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Doors: " + doors + ", Fuel: " + fuelType);
    }
}
