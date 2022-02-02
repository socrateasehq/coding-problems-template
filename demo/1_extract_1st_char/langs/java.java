import java.util.Scanner;

public class abc{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        scanner.close();

        System.out.print(Character.toString(first_char(myString)));
    }

    public static Character first_char(String input) {
        return input.charAt(0);
    }
}