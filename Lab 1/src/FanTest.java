public class FanTest {
    public static void main(String[] args) {
        Fan f1 = new Fan(Fan.FAST, true, 10.0, "yellow");
        System.out.println("Fan f1");
        System.out.println(f1.details());

        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);

        System.out.println("Fan f2");
        System.out.println(f2.details());
    }
}