/* Declares an array of doubles of length 5, and uses methods to populate the 
array with user input from the command line and to print out the max (highest)
and min (lowest) values in the array.
 */
package minmax;

import java.util.Scanner;

public class MinMax {
    
    public static void main(String[] args) {
        double array[] = readInputs();
        double max = array[0];
        double min = array[0];
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
    }
    public static double[] readInputs() {
        double d[]= new double[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<d.length; i++){
            System.out.println("Enter number "+(i+1)+": ");
            d[i] = scan.nextDouble();
        }
        return d;
    }
}
