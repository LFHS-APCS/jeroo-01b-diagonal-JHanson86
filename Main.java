/**
 * Write code in runJerooCode() to have a single Jeroo 
 * put a flower at (0,0), (1,1), (2,2) and (3,3).
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
  //      new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
     Jeroo boy = new Jeroo(0,0,EAST,10);
boy.plant();
boy.hop();
boy.turn(LEFT);
boy.turn(LEFT);
boy.turn(LEFT);
boy.hop();
boy.plant();
boy.hop();
boy.turn(LEFT);
boy.hop();
boy.plant();
boy.hop();
boy.turn(LEFT);
boy.turn(LEFT);
boy.turn(LEFT);
boy.hop();
boy.plant();
boy.turn(LEFT);
boy.hop();
    }

}
