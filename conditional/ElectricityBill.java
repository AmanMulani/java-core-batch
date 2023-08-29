package conditional;

/**
 * Given the number of units of electricity consumed and the rate of units used
 * being:
 * 0-100 = 4Rs./unit
 * 101-300 = 3.75Rs./unit
 * 301-500 = 3.50Rs./unit
 * 501-600 = 3.30Rs./unit
 * 601+ = 3.25Rs./unit
 * Calculate the amount of bill.
 * Example: units: 400
 * Ans = 400 * 3.50 = Rs. 1400
 */

public class ElectricityBill {

    public static void main(String[] args) {
        int numberOfUnits = 400; // Assuming that this is user input, since we are not taking input from the
                                 // user.

        double bill = 0;
        if (numberOfUnits > 0 && numberOfUnits <= 100) {
            bill = numberOfUnits * 4;
        } else if(numberOfUnits > 100 && numberOfUnits <=300) {
            bill = numberOfUnits * 3.75;
        } else if (numberOfUnits > 300 && numberOfUnits <=500) {
            bill = numberOfUnits * 3.50;
        } else if (numberOfUnits > 500 && numberOfUnits <= 600) {
            bill = numberOfUnits * 3.30;
        } else {
            bill = numberOfUnits * 3.25;
        }

        System.out.println(bill);
    }

}
