
package sokoban;

import javax.swing.ImageIcon;

/**
 *
 * @author Adam
 */
public class Crate extends MoveableMapElement {
    
    public Crate(int newX, int newY){
//      calls methods/properties of MoveableMapElements
        super(newX, newY);
//      name of object
        setObjectName("Crate");
//      symbol that represents object in text file         
        setObjectAsSymbol("*");
//      point to where assets are to display object
        objectImgName = "resources/SokobanImages/Crate.png";
        this.setIcon(new ImageIcon(objectImgName));
    }
    
//  depending if crate is on diamond, crate will change colour  
    public void toggleCrateDisplay() {
        
    }

    
}
