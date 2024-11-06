package elementaryJava;

class Leap {
    public boolean Leap(int year) {
        boolean yup = true;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0) {
                if (year % 400 == 0) {
                    yup = true;
                } else {
                    yup = false;
                }
            } else {
                yup = false;
            }
        } else {
            yup = false;
        }
        return yup;
    }
}