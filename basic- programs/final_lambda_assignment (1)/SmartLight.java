interface LightAction {
    void execute();
}

public class SmartLight {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction night = () -> System.out.println("Dim lights at night");
        LightAction voice = () -> System.out.println("Lights controlled by voice");

        motion.execute();
        night.execute();
        voice.execute();
    }
}
