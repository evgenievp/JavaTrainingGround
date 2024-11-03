package elementaryJava;

public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour) {
            long milesPerHourRounded = -1;

            if (kilometersPerHour >= 1) {
                milesPerHourRounded = Math.round(kilometersPerHour / 1.609);
            } else if (kilometersPerHour >= 0) {
                milesPerHourRounded = 0;
            }

            return milesPerHourRounded;
        }

        public static void printConversion(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
            } else {
                long milesPerHourRounded = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + milesPerHourRounded + " mi/h");
            }
        }

}

