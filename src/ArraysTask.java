import java.util.Arrays;
public class ArraysTask {
    public static void main(String[] args) {

    //Create an array to hold five different weather temperatures.
        double[] temperatures = new double[5];

    //Initialize the array with five temperature values of your choice.
        temperatures[0] = 33.5;
        temperatures[1] = 25.5;
        temperatures[2] = 52.5;
        temperatures[3] = 18.6;
        temperatures[4] = 11.2;
        System.out.println(Arrays.toString(temperatures));

    //Change the temperature at the third position (index 2) to a new value.
        temperatures[2] = 16.5;
        System.out.println(Arrays.toString(temperatures));

    // Use a loop to display all the temperatures in your array.
        for (double temperature : temperatures) {
            System.out.println(temperature);
        }


    }
}
