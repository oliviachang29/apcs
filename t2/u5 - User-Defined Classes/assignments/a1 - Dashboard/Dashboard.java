/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

    private int odometer;
    private int speedometer;
    private boolean checkEngine;

    public Dashboard() {
        this(0, 0);
    }

    public Dashboard(int o, int s) {
        setCheckEngine(false); // default false
        setOdometer(o);
        setSpeed(s);
    }

    public void setOdometer(int o) {
        if (o >= 0 && o <= 99999) {
            odometer = o;
        } else {
            odometer = 0;
            setCheckEngine(true);
        }
    }

    public void setSpeed(int s) {
        if (s >= 0 && s <= 100) {
            speedometer = s;
        } else {
            speedometer = 0;
            setCheckEngine(true);
        }
    }

    public void setCheckEngine(boolean ce) {
        checkEngine = ce;
    }

    public String toString() {
        /* missing code */
        String o = "";
        int length = String.valueOf(odometer).length();
        if (length < 5) {
            for (int i = 0; i < (5 - length); i++) {
                o += "0";
            }
        }

        String ce = "";
        if (checkEngine) {
            ce = "On";
        } else {
            ce = "Off";
        }
        return "Speedometer: " + speedometer + " MPH\nOdometer: " + o + odometer + "\nCheck Engine: " + ce;
    }

    public void accelerate() {
        setSpeed(speedometer + 1);
    }

    public void drive(int n) {
        if (n >= 0 && n <= 720) {
            double distance = ((n*1.0/60) * speedometer);
            setOdometer(odometer + (int)distance);
        }
    }

    // public int getMilesTravelled() {
    //     return odometer;
    // }
    // public int getSpeed() {
    //     return speedometer;
    // }

}