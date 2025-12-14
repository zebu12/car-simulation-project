import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car myFirstCar = new Car();

        myFirstCar.carMake = "Volvo";
        myFirstCar.carModel = "S70";
        myFirstCar.carColor = "Silver";
        myFirstCar.carYear = 1999;

        System.out.println(myFirstCar.getCarDetails());

        Car[] myCars = new Car[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            myCars[i] = new Car();
            System.out.println("Enter the details of your cars: ");
            myCars[i].carMake = input.nextLine();
            myCars[i].carModel = input.nextLine();
            myCars[i].carColor = input.nextLine();
            myCars[i].carYear = input.nextInt();
           input.nextLine();
        }
        System.out.println("Cars Collection Details:");
        for (int i = 0; i < myCars.length; i++) {
            String carDetails = myCars[i].getCarDetails();
            System.out.println(carDetails);
        }

    }
}
