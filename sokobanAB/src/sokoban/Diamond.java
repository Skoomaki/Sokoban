
package sokoban;

import javax.swing.ImageIcon;

/**
 *
 * @author Adam
 */
// class extends MapElement as it does not move (association)
public class Diamond extends MapElement {

    public Diamond() {
//      name of object
        setObjectName("Diamond");
//      symbol that represents object in text file         
        setObjectAsSymbol(".");
//      point to where assets are to display object
        objectImgName = "resources/SokobanImages/Diamond.png";
        this.setIcon(new ImageIcon(objectImgName));
    }

}
