/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareeverydigit;

/**
 *
 * @author xrist
 */
public class SquareEveryDigit {

    public static void main(String[] args) {
        System.out.println(SquareDigits(473));
    }

    public static int SquareDigits(int n) {

        {
            int lastDigit = 0;
            int result = 0;
            int counter = 0;
            int squaredDigit;
            do {
                if (lastDigit <= 3) {
                    lastDigit = n % 10;
                    squaredDigit = lastDigit * lastDigit;
                    result = result + squaredDigit * (int) Math.pow(10, counter);
                } else {
                    lastDigit = n % 10;
                    counter++;
                    squaredDigit = lastDigit * lastDigit;
                    result = result + squaredDigit * (int) Math.pow(10, counter);
                }
                n = n / 10;
                counter++;
            } while (n != 0);
            return result;
        }
    }
}

