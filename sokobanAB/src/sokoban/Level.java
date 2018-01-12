
package sokoban;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author Adam
 */
public class Level extends JComponent implements ActionListener {
//  2d array of non-moveable objects (wall, diamond, floor);  
    MapElement map[][];
//  array of crates 
    Crate crates[];
//  only one instance of warehousekeeper is needed  
    WarehouseKeeper warehouseKeeper;
//  track number of moves a player has made per level  
    int numberOfMoves;
//  label for number of moves a player has made  
    JLabel numberOfMovesLabel;
//  button for restarting the game when the user clicks on it  
    JButton restartLevelButton;
    
//  will have a scanner that can read from text file to build level  
    public void loadMap (int levelNumber) throws FileNotFoundException {
        
    }
        
//  method for checking if the win condition has been met  
    public void checkForWin() {
        
    }
//  method for restarting the current level if player wants (button)  
    public void restartLevel() {
        
    }
//  error for abstract method, this is stop error for now in class
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
