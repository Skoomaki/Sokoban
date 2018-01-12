
package sokoban;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Adam
 */
public class SokobanGame extends JComponent implements ActionListener {
    
    JFrame mainWindow;
//    need to test that objects can be displayed before mre complex implementation
//  Level currentLevel;
//  set to 1 to get map 1
    int currentLevelSelected = 1;
    public JButton upButton;
    public JButton downButton;
    public JButton leftButton;
    public JButton rightButton;
    
    SokobanGame() {
//  mainWindow is a new type of JFrame  
    mainWindow = new JFrame();
//  size of window (main frame)  
    mainWindow.setSize(1100,800);
//  won't be using layout manager  
    mainWindow.setLayout(null);
//  set to visible to actually see frame
    mainWindow.setVisible(true);
//  make program close after exit (saves on time)
    mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
//  button controls  
    upButton = new JButton("UP");
//  adds button to mainWindow  
    mainWindow.add(upButton);
    upButton.setBounds(850,10,100,30);
    upButton.setVisible(true);
    upButton.addActionListener(this);

    downButton = new JButton("DOWN");
//  adds button to mainWindow  
    mainWindow.add(downButton);
    downButton.setBounds(850,50,100,30);
    downButton.setVisible(true);
    downButton.addActionListener(this);
    
    leftButton = new JButton("LEFT");
//  adds button to mainWindow  
    mainWindow.add(leftButton);
    leftButton.setBounds(740,50,100,30);
    leftButton.setVisible(true);
    leftButton.addActionListener(this);
    
    rightButton = new JButton("RIGHT");
//  adds button to mainWindow  
    mainWindow.add(rightButton);
    rightButton.setBounds(960,50,100,30);
    rightButton.setVisible(true);
//  when button is clicked, an action is sent  
    rightButton.addActionListener(this);
    
    
    
}
    
//  used to stop error of actionlistener implementation for now  
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
