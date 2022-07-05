public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
    }

    public String details() {
        if (on)
            return "Fan speed = " + this.getSpeed() + "\nFan Color = " + this.getColor() + "\nFan Radius = " + this.getRadius();
        else
            return "Fan color = " + this.getColor() + "\nFan Radius = " + this.radius + "\nFan is off";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

