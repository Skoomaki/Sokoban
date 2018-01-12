
package sokoban;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Adam
 */
public class SokobanGame extends JComponent implements ActionListener {
    
    JFrame mainWindow;
    
    SokobanGame() {
//  mainWindow is a new type of JFrame  
    mainWindow = new JFrame();
//  size of window (main frame)  
    mainWindow.setSize(400,400);
//  won't be using layout manager  
    mainWindow.setLayout(null);
//  set to visible to actually see frame
    mainWindow.setVisible(true);
//  make program close after exit (saves on time)
    mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
//  used to stop error of actionlistener implementation for now  
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
