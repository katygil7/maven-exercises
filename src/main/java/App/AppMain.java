package App;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or string");
        String userInput = input.nextLine();

        System.out.println("Your string numeric: " + StringUtils.isNumeric(userInput));
        System.out.println("Your string reversed: " + StringUtils.reverse(userInput));
        System.out.println("Your string flipped: " + StringUtils.swapCase(userInput));


    }
}
