package Practice.Java;

import java.awt.Robot;
import java.util.Random;
public class awake{

    public static void main(String[] args) throws Exception{
    	 /*Robot rob = new Robot();
         PointerInfo ptr = null;
         while (true) {
             rob.delay(1000);  // Mouse moves every 30 seconds
             ptr = MouseInfo.getPointerInfo();
             rob.mouseMove((int) ptr.getLocation().getX() + 1, (int) ptr.getLocation().getY() + 1);
         }
     }
 }*/

Robot hal = new Robot();
Random random = new Random();
while(true){
    hal.delay(1000 *60);
    int x = random.nextInt() % 640;
    int y = random.nextInt() % 480;
    hal.mouseMove(x,y);
}
}
}
