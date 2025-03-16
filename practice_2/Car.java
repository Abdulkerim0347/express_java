package practice_2;

public class Car {
    int year;
    String brand;

    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    int getYear() {
        return year;
    }

    String getBrand() {
        return brand;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void print() {
        System.out.println("Brand: " + brand + ", year: " + year);
    }


    public static void main(String[] args) {
        Car car1 = new Car(2020,"Mercedes");
        car1.print();

        car1.setYear(2021);
        car1.print();
    }
}
