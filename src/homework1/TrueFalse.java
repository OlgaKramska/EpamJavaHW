package homework1;

import java.util.Scanner;

/**
 * Created by Olga Kramska on 24-Feb-16.
 */
public class TrueFalse {
    public static void main(String[] args){
        System.out.print("Enter a four-place decimal number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        TrueFalse obj = new TrueFalse();
        System.out.println(obj.checkNumber(num));
    }

     boolean checkNumber(int num) {
        int thousands;
        int hundreds;
        int tens;
        int units;
        boolean check = false;
        if (num >= 0 && num <= 9999) {
            thousands = num / 1000;
            int num1 = num % 1000;
            hundreds = num1 / 100;
            int num2 = num1 % 100;
            tens = num2 / 10;
            units = num2 % 10;
            if ((thousands + hundreds) == (tens + units)) {
                check = true;
            }
        } else {
            System.out.println("Wrong number");
        }

         return check;
    }
}
