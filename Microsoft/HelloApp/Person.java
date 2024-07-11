public class Person {
    final private String firstName;
    final private String lastName;
    final private int age;
    final private String address;
    final private int phoneNumber;
    final private String email;

    public Person(String firstName, String lastName, int age, String address, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}