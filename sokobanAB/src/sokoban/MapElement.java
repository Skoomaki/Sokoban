
package sokoban;

import javax.swing.JLabel;

/**
 *
 * @author Adam
 */

// Class responsible for handling non-moving objects (association)
public class MapElement extends JLabel {
    
    public String objectName;
    public String objectAsSymbol;
    public String objectImgName;
    
//  enscapsulation  
//  getter  
    public String getObjectName() {
        return objectName;
    }
//  setter  
    public String getObjectAsSymbol() {
        return objectAsSymbol;
    }
    
}
