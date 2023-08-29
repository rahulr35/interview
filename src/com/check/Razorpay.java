package check;

public class Razorpay {

    // Hour hand moves by 30 degree in 1 hour, 0.5 degree per min
    // Minute hand moves by 360 degree in 1 hours,
    public static void main (String [] args){
        int hour = 10;
        int min = 5;
        System.out.println(findTheAngle(hour, min));
    }

    public static double findTheAngle(int hour, int min){
        double hourHandMovement = 0;
        // Handling for time being 12
        if (hour !=12) {
            // Every minute 0.5 degree is covered
            // So converting the hours in minutes in the case, the time is above 12
            hourHandMovement = 0.5 * 60 * hour + 0.5 * min;
        } else {
            hourHandMovement = 0.5 * min;
        }

        // Every min 6 degree is covered
        int minMovement = 6 * min;

        return (minMovement>hourHandMovement) ? minMovement-hourHandMovement : hourHandMovement-minMovement;
    }
}
