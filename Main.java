import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random number = new Random();
        System.out.println("With Math.random() function.");
        int equation = (int) (Math.random() * 11 + 1);
        System.out.println(equation);
        System.out.println("With the Random module.");
        int num1 = number.nextInt(11);
        int num2 = number.nextInt(2);
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}