/*
 * AP CS MOOC
 * Term 2 - Assignment 4, Dashboard
 * A class which represents a car dashboard.
 * Making it comparable
 */

public class Dashboard implements Comparable {

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

    public int compareTo(Object d) {
        Dashboard temp = (Dashboard) d;
         // A Dashboard object should be considered less than another if it has lower total mileage, 
        // or lower speedometer, or does not have a check engine light on, in that order of priority. 
        if (odometer == temp.odometer) {
            if (speedometer == temp.speedometer) {
                if (checkEngine && !temp.checkEngine) {
                    return 1;
                } else if (!checkEngine && temp.checkEngine) {
                    return -1;
                }
            } else {
                if (speedometer > temp.speedometer) {
                    return 1;
                } else if (speedometer < temp.speedometer) {
                    return -1;
                }
            }
        } else {
            if (odometer > temp.odometer) {
                return 1;
            } else if (odometer < temp.odometer) {
                return -1;
            }
        }

        // truly equal
        return 0;
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

    public String race(Dashboard other, int acc1, int acc2) {
        // Each dashboard will accelerate in increments of 1 mph n1 and n2 times, respectively 
        // (i.e. dashboard 1 will accelerate() acc1 times, and dashboard 2 ("other") will accelerate() acc2 times).

        boolean dash1stalled = false;
        boolean dash2stalled = false;
        String msg = "";

        for (int i = 0; i < acc1; i++) {
            if (speedometer == 100) {
                dash1stalled = true;
                msg += "First car stalled out!\n";
                accelerate();
                break;
            }
            accelerate();
        }

        for (int i = 0; i < acc2; i++) {
            other.accelerate();
            if (other.speedometer == 100) {
                dash2stalled = true;
                msg += "Second car stalled out!\n";
                other.accelerate();
                break;
            }
        }

        msg+= "\n" + this.toString() + "\n\n" + other.toString()+"\n\n";

        if (dash1stalled && dash2stalled) {
            msg += "It's a tie!";
        } else if (!dash1stalled && dash2stalled) {
            msg += "Car 1 has won the race!";
        } else if (dash1stalled && !dash2stalled) {
            msg += "Car 2 has won the race!";
        } else if (speedometer > other.speedometer) {
            msg += "Car 1 has won the race!";
        } else if (speedometer < other.speedometer) {
            msg += "Car 2 has won the race!";
        } else if (speedometer == other.speedometer) {
            msg += "It's a tie!";
        } else {
            msg += "nerror: neither stalled but neither won the race";
        }

        return msg;
    }

    public String difference (Dashboard other) {
        if (odometer > other.odometer) {
            double diff = odometer - other.odometer;
            double hr = diff / other.speedometer;
            return "Second car will need to drive for " + (int)hr*60 + " minutes to catch first car.";
        } else if (odometer < other.odometer) {
            double diff = other.odometer - odometer;
            double hr = diff / speedometer;
            return "First car will need to drive for " + (int)hr*60 + " minutes to catch second car.";
        } else {
            return "Cars are equal.";
        }
    }

}