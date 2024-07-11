import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Person questions(Scanner scanner) {
        System.out.println("What is your firstname?");
        String firstName = scanner.nextLine();
        System.out.println("What is your lastname?");
        String lastName = scanner.nextLine();
        System.out.println("What is your age?");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("What is your address?");
        String address = scanner.nextLine();
        System.out.println("What is your phone number?");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("What is your email?");
        String email = scanner.nextLine();

        return new Person(firstName, lastName, age, address, phoneNumber, email);
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people do you want to register?");
        int num = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Registering person " + (i + 1) + ":");
            Person person = questions(scanner);
            people.add(person);
        }

        System.out.println("All Registered People: ");
        for (Person person : people) {
            System.out.println("Person details: ");
            System.out.println("First Name: " + person.getFirstName());
            System.out.println("Last Name: " + person.getLastName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Phone Number: " + person.getPhoneNumber());
            System.out.println("Email: " + person.getEmail());
            System.out.println();
        }
        
    }
}