import processing.core.PApplet;

public class Utils {
    static int pickFromArray(PApplet p5, int[] myArray) {
        return myArray[(int) p5.random(myArray.length)];
    }
}
