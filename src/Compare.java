public class Compare {
    public static void main(String[] args) {
        short numberOne = 1;
        short numberTwo = 2;
        if (numberOne >= numberTwo) {
            System.out.println("Number One is bigger than Number Two");
        } else {
            System.out.println("Number Two is bigger than Number One");

            if (numberOne > numberTwo) {
                System.out.println("Number One is bigger than Number Two");
            } else {
                System.out.println("Number One is smaller than Number Two");
            }
            if (numberOne == numberTwo) {
                System.out.println("Number One is equal Number Two");
            } else {
                System.out.println("Number One and Number Two are not equal");
            }
            if (numberOne == 0) {
                System.out.println("Number One is even");
            } else {
                System.out.println("Number One is uneven");
            }
            if (numberOne < 0 && numberTwo < 0) {
                System.out.println("Number One and Number Two are negative");
            } else {
                System.out.println("Number One and number Two are positive");

                if (numberOne < 100 && numberTwo < 100) {
                    System.out.println("Number One and Number Two are smaller than 100");
                } else {
                    System.out.println("Both numbers are equal or bigger than 100");
                }
            }
        }
    }