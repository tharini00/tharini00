import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        while (true) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date now = new Date();
            String formattedTime = dateFormat.format(now);
            System.out.println(formattedTime);

            try {
                Thread.sleep(1000); // Update the time every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}