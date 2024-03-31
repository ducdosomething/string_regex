package classnamevalid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckClassName checkClassName = new CheckClassName();
        System.out.println("Enter class name need to check:");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        if (checkClassName.checkClassName(className)) {
            System.out.println(className + " is ivailble!");
        } else {
            System.out.println(className + " is not ivailble!");
        }
    }
}
