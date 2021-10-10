public class Time {

    public static void main(String[] args) {
        String regex = "([01]?[0-9]|2[0-4])";
        int time = 20;
        if (time <= 12) {
            System.out.println("Good Morning, Sunshine!");
        } else if (time >= 13 && time <= 19)
            System.out.println("Good Afternoon! Work hard!");
        else if (time >= 20 && time <= 24)
            System.out.println("Good Evening! Get some rest!");
    }
}





