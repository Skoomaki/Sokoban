
package sokoban;

import javax.swing.ImageIcon;

/**
 *
 * @author Adam
 */
// class extends MapElement as it does not move (association)
public class Wall extends MapElement {
    
    public Wall() {
//      name of object
        setObjectName("Wall");
//      symbol that represents object in text file  
        setObjectAsSymbol("X");
//      point to where assets are to display object
        objectImgName = "resources/SokobanImages/Wall.png";
        this.setIcon(new ImageIcon(objectImgName));        
    }
    
}
