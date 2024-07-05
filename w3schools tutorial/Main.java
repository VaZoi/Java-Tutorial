public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wolrd");
        System.out.println("I am learning Java.");
        /* Multi line comment
         * Jippie
         */
        System.out.println("It is awesome!");
        System.out.print("Hello world! ");
        System.out.print("I will print on the same line.");
        System.out.println(3);
        System.out.println(237); // comment
        System.out.println(50000);
        System.out.println(3 +3);
        System.out.println(2 * 5);
        // This is a comment
        String name = "John";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
        int Num;
        Num = 15;
        System.out.println(Num);
        myNum = 30;
        System.out.println(myNum);
        // final int Number = 60;
        // // Number = 20;
        int theNum = 8;
        float myFloatNum = 5.99f;
        char myletter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        String namie = "John";
        System.out.println("Hello " + namie);
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int x = 5;
        int y = 6;
        int z = 70;
        int a = 8, b = 5, c = 4;
        System.out.println(a + b + c);
        System.out.println(x + y + z);
        int d, e, f;
        d = e = f = 3;
        System.out.println(d + e + f);

        //good
        int minutesperHour = 60;
        // OK, but not so easy to undersatnd what m actually is
        int m = 60;

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        int length = 4;
        int width = 6;
        int area;

        area = length * width;

        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

        int myNumb = 5; // integer (Whole number)
        float myFloatNumb = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool2 = true; // Boolean
        String myText2 = "Hello"; // 
        
        byte myByte = 100;
        System.out.println (myByte);

        short myShort = 5000;
        System.out.println(myShort);

        int myInt = 100000;
        System.out.println(myInt);

        long myLong = 15000000000L;
        System.out.println(myLong);

        float myFloat = 5.75f;
        System.out.println(myFloat);

        double myDouble = 19.99d;
        System.out.println(myDouble);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        int myInt3 = 9;
        double myDouble3 = myInt3;

        System.out.println(myInt3);
        System.out.println(myDouble3);

        double myDouble4 = 9.78d;
        int myInt4 = (int) myDouble4;

        System.out.println(myDouble4);
        System.out.println(myInt4);

        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);

        int h = 100 + 50;
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        int v = 6;
        int j = 4;
        System.out.println(v > j);
        String greeting1 = "Hello";
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));

        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1 + " " + lastName1);

        System.out.println(firstName1.concat(lastName1));

        int x1 = 10;
        int y1 = 20;
        int z1 = x1 + y1;
        System.out.println(z1);

        String x2 = "10";
        String y2 = "20";
        String z2 = x2 + y2;
        System.out.println(z2);

        String x3 = "10";
        int y3 = 20;
        String z3 = x3 + y3;
        System.out.println(z3);

        String txt5 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt5);

        String txt6 = "It\'s alright.";
        System.out.println(txt6);

        String txt7 = "the character \\ is called backlash.";
        System.out.println(txt7);

        String  txt10 = "Hello \b You!";
        System.out.println(txt10);

        int num5 = 30;
        int num4 = 20;

        System.out.println(Math.max(num5, num4));
        System.out.println(Math.min(num5, num4));
        System.out.println(Math.sqrt(num5));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

        int boolx = 10;
        int booly = 9;
        System.out.println(boolx > booly);

        int bool2x = 10;
        System.out.println(bool2x == 10);
        System.out.println(10 == 15);

        int myAge1 = 25;
        int votingAge = 18;
        if (myAge1 >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time1 = 14;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNumber0 = 10;
        if (myNumber0 > 0 ) {
            System.out.println("The value is a positive number.");
        } else if (myNumber0 < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        int myNumber2 = 5;
        if (myNumber2 % 2 == 0) {
            System.out.println(myNumber2 + " is even");
        } else {
            System.out.println(myNumber2 + " is odd.");
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend!");
        }

        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        }
        while (i2 < 5);

        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");

        int dice = 1;
        while (dice <= 6) {
            if (dice < 6 ) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }

        for (int i3 = 0; i3 < 5; i3++) {
            System.out.println(i3);
        }

        for (int i4 = 0; i4 <= 10; i4 = i4 + 2) {
            System.out.println(i4);
        }

        for (int i5 = 1; i5 <= 2; i5++) {
            System.out.println("Outer: " + i5);

            for (int j2 = 1; j2 <= 3; j2++) {
                System.out.println("Innner: " + j2);
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String iarr : cars) {
            System.out.println(iarr);
        }

        for (int ia = 0; ia <= 100; ia += 10) {
            System.out.println(ia);
        }

        for (int ib = 0; ib <= 10; ib = ib +2) {
            System.out.println(ib);
        }

        int numberb = 2;
        for (int im = 1; im <= 10; im++) {
            System.out.println(numberb + " x " + im + " = " + (numberb * im));
        }

        for (int io = 0; io <10; io++) {
            if (io ==4) {
                break;
            }
            System.out.println(io);
        }

        for (int ij = 0; ij <10; ij++) {
            if (ij == 4) {
                continue;
            }
            System.out.println(ij);
        }

        int ih = 0;
        while (ih <10) {
            System.out.println(ih);
            ih++;
            if (ih == 4) {
                break;
            }
        }

        int ig = 0;
        while (ig < 10) {
            if (ig == 4) {
                ig++;
                continue;
            }
            System.out.println(ig);
            ig++;
        }

        int[] myNumberss = {10, 20, 30, 40};
        System.out.println(myNumberss[2]);
        myNumberss[2] = 25;
        System.out.println(myNumberss[2]);
        System.out.println(myNumberss.length);

        for (int vi = 0; vi < myNumberss.length;vi++) {
            System.out.println(myNumberss[vi]);
        }
        for (int ci : myNumberss) {
            System.out.println(ci);
        }

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int lengthh = ages.length;

        for (int age : ages) {
            sum += age;
        }
        avg = sum / lengthh;
        System.out.println("Average age is: " + avg);

        int lowestAge = ages[0];
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);

        int[][] myArrays = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myArrays[1][2]);
        myArrays[1][2] = 9;
        System.out.println(myArrays[1][2]);

        for (int xz = 0; xz < myArrays.length; ++xz) {
            for (int xc = 0; xc < myArrays[xz].length; ++xc) {
                System.out.println(myArrays[xz][xc]);
            }
        }

        for (int[] row : myArrays) {
            for (int bv : row) {
                System.out.println(bv);
            }
        }
        myMethod();
        myMethod();
        myMethod();
        myName("Liam", 3);
        myName("Jenny", 42);
        myName("Anja", 23);
        checkAge(20);
        checkAge(5);
        checkAge(50);
        System.out.println(myCalc(3));
        System.out.println(myCalc(8));
        System.out.println(myCalc2(5, 5));
        int calz = myCalc2(9, 9);
        System.out.println(calz);
        int myNum1o = plusMethodInt(8, 5);
        double myNum2o = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1o);
        System.out.println("double: " + myNum2o);
        int myNum1i = plusMethod(8, 5);
        double myNum2i = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1i);
        System.out.println("double: " + myNum2i);
        int resultp = sum5(10);
        System.out.println(resultp);
        int re = sum9(8, 23);
        System.out.println(re);
    }

    static void myMethod() {
        System.out.println("I just got executed!");    
    }

    static void myName(String fname, int age) {
        System.out.println(fname + " Refsnes, is age: " + age);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Acces denied - You are not old enough!");
        } else {
            System.out.println("Acces granted - You are old enough!");
        }
    }

    static int myCalc(int x) {
        return 5 + x;
    }

    static int myCalc2(int x, int y) {
        return x + y;
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static int sum5(int k) {
        if (k > 0) {
            return k + sum5(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum9(int start, int end) {
        if (end > start) {
            return end + sum9(start, end -1);
        } else {
            return end;
        }
    }
}
