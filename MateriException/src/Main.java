
public class Main {
    public static void main(String []args){
        int[] speeds = {80, 120, 95};
        
        for (int speed : speeds) {
            try{
                RaceCar.validateSpeed(speed);
            } catch (InvalidSpeedException e) {
                System.out.println("Terjadi Exception: " + e.getMessage());
            }
        }
    }
}
