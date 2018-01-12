
package sokoban;

import javax.swing.ImageIcon;

/**
 *
 * @author Adam
 */
// class extends MapElement as it does not move (association)
public class Floor extends MapElement {
    
    public Floor() {
//      name of object
        setObjectName("Floor");
//      symbol that represents object in text file          
        setObjectAsSymbol(" ");
//      point to where assets are to display object
        objectImgName = "resources/SokobanImages/Floor.png";
        this.setIcon(new ImageIcon(objectImgName));
    }
    
}
