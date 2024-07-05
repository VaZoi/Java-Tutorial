public class OOP {
    String modelFname;
    String modelLname;
    int modelAge;

    public OOP(String fname, String lname, int age) {
        modelFname = fname;
        modelLname = lname;
        modelAge = age;
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

}
