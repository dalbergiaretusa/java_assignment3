//Note via Seb
//this is very very basic and wont even compile. Id like you guys to read the function names and descriptions and think if I //have thought about all that is required and put something there if you think appropriate. also write on messenger if you //change something and update the pastebin. And please think on how to store the grid in memory because I dont have a very //efficient idea for it.



import ShefRobot.*;
import sheffield.*;

/**
 *
 * @author sdn
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    //robot goes forward until it finds a black line
    /*public static findTheLine() {

    }*/
    //robot follows the black line (ideally to the left) until it finds a coloured dot
    public static followTheLine(leftMotor, rightMotor, speaker, colorSensor) {
        leftMotor.setSpeed(300);
        rightMotor.setSpeed(300);
        leftMotor.forward();
        rightMotor.forward();

        final float TRESHOLD = 0.4; //thershold between black and white

        while(true) {
            if(colorSensor.getAmbient() < TRESHOLD) {
              leftMotor.setSpeed(300);
              rightMotor.setSpeed(0);
            }
            else {
              leftMotor.setSpeed(0);
              rightMotor.setSpeed(300);
            }
        }
        return false;
    }
    /*robot stores the dot position (how?) and its colour, updates the graph and the boolean array whether this colour has already been used. then checks if the dot has been used before - if so, then calls goToDot(previous dot). otherwise searches for another black line. I could try and implement that and goToDot(seb)
    public static analyzeDot() {

    }
    public static goToDot() {

    }
    public static void makeSound() {

    }
    public static void spin() {

    }*/
    public static void testFunctions(leftMotor, rightMotor, speaker, colorSensor) {
      //test if all the things work
      leftMotor.setSpeed(400);
      rightMotor.setSpeed(400);
      leftMotor.forward();
      rightMotor.forward();
      myRobot.sleep(1000);

      speaker.playTone(500,200);

      myRobot.sleep(100);

      return false;
    }

    public static void main(String[] args) {

        Robot myRobot = new Robot();
        Sensor mySensor= new Sensor();

        Motor leftMotor = myRobot.getLargeMotor(Motor.Port.B);
        Motor rightMotor = myRobot.getLargeMotor(Motor.Port.C);

        Speaker speaker = myRobot.getSpeaker();
        ColorSensor colorSensor = myRobot.getColorSensor(Sensor.Port.S1); //not sure about the sensor.port thing
        testFunctions(leftMotor, rightMotor, speaker, colorSensor);



        myRobot.close();

    }

}
