import java.util.Scanner;

public class InputTutorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Input some name :");
        System.out.print("Input some name : ");
        String name = sc.nextLine(); 

        System.out.print("Year : ");
        int year = sc.nextInt();

        System.out.print("age : ");
        double age = sc.nextDouble();

        System.out.println("");
        System.out.println("That's name : " + name);
        System.out.println("Birthday : " + year);
        System.out.println("Age : " + age);

    }
}
