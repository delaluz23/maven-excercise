import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String some = sc.nextLine();
        if(StringUtils.isNumeric(some)){
            System.out.println(some + " is a number");
        } else {
            System.out.println(some + " is not a number");
        }
        System.out.println(StringUtils.swapCase(some));
        System.out.println(StringUtils.reverse(some));
    }
}
