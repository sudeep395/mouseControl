import java.awt.*;
import java.awt.event.*;

public class MouseControl {

    public static void main(String[] args) {
        
        Robot robot = null;
        
        try {
            robot = new Robot();

            while (true) {
                Thread.sleep(1000*60); 
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                System.out.println("Mouse Clicked");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }        
        

    }
}
