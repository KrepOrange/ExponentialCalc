import java.text.DecimalFormat;
import java.util.Scanner;

public class ExponentialCalc {
    public static void main(String[] args) {
        double base, result = 1;
        int exponent;
        Scanner input = new Scanner(System.in);
        DecimalFormat decFormat = new DecimalFormat("0.#####");

        System.out.print("Taban sayıyı giriniz: ");
        base = input.nextDouble();

        System.out.print("Üssü giriniz: ");
        exponent = input.nextInt();

        for(int i = 0; i < exponent; i++)
            result *= base;

        System.out.println(decFormat.format(base) + "^" + exponent + " = " + decFormat.format(result));
    }
}
