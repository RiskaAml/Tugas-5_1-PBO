public class RaceCar {
    public static void validateSpeed(int speed) throws InvalidSpeedException {
        if (speed < 100) {
            throw new InvalidSpeedException("Kecepatan terlalu rendah! Minimal 100 km/h untuk balapan.");
        }
        System.out.println("Kecepatan aman: " + speed + " km/h");
    }
}
