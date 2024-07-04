import org.apache.commons.lang3.RandomStringUtils;

public class ReferenceNonJDKClass {

    public static void main(String[] args) {
        int randomInt = Integer.parseInt(RandomStringUtils.randomNumeric(9));
        System.out.println(randomInt);
    }

}
