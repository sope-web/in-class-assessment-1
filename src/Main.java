import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("This code helps calculate the total population");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current population");
        int population = scanner.nextInt();
        System.out.println("How many seconds between births");
        int births = scanner.nextInt();
        System.out.println("How many seconds between deaths");
        int deaths = scanner.nextInt();
        System.out.println("How many immigrations");
        int immigration = scanner.nextInt();
        System.out.println("How many years");
        int years = scanner.nextInt();
        int secinyr = 31536000;
        int Totalpop = population+(secinyr/births*years)-(secinyr/deaths*years)+(secinyr/immigration*years);
        System.out.println("The new population is "+Totalpop);
        if (Totalpop>population){
            System.out.println("There will be an increase");
        }
        if (Totalpop==population){
            System.out.println("it will stay the same");
        }
        if (Totalpop<population){
            System.out.println("There will be an decrease");
        }

    }
}