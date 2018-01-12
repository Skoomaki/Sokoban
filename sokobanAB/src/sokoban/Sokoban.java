
package sokoban;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Sokoban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//      instance of object SokobanGame  
        SokobanGame game = new SokobanGame();
        
//      test to see that level1.txt file can be read and put out correctly in console 
        File levelOneTest = new File("resources/SokobanMaps/level1.txt");
//      used to scan text file  
        Scanner levelScan = new Scanner(levelOneTest);
//      while loop that scans while hasNext is true
        while(levelScan.hasNext()){
            String s = levelScan.nextLine();
            System.out.println(s);
            
        }
        
        
        
        
        
    }
    
}
