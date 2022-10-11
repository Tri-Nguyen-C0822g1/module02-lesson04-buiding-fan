public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "pink";

//    public void setSpeed (){
//        this.speed = speed;
//    }
//    public int getSpeed(){
//        return this.speed;
//    }
//    public void setOn (){
//        this.on = on;
//    }
//    public boolean getOn(){
//        return this.on;
//    }
//    public void setRadius (){
//        this.radius = radius;
//    }
//    public double getRadius(){
//        return this.radius;
//    }
//    public void setColor (){
//        this.color = color;
//    }
//    public String getColor(){
//        return this.color;
//    }
    // Khuc nay tao viet tay;
// Alt + insert;
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
//    public void Fan(int speed, boolean on, String color, double radius){
//        this.speed = speed;
//        this.on = on;
//        this.color = color;
//        this.radius =radius;
//    }
//    khuc nay tao viet tay;
    // Alt + insert;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString() {
        if (!on) {
            System.out.println("speed = " + speed + " radius = " + radius + " color = " + color + " Fan is on");
        } else {
            System.out.println("speed = " + speed + " radius = " + radius + " color = " + color + " Fan is off");
        }
        return null;
    }
}
