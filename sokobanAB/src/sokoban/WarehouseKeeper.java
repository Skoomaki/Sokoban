
package sokoban;

import javax.swing.ImageIcon;

/**
 *
 * @author Adam
 */
public class WarehouseKeeper extends MoveableMapElement {
    
    public WarehouseKeeper(int newX, int newY){
//      calls methods/properties of MoveableMapElements
        super(newX, newY);
//      name of object
        setObjectName("WarehouseKeeper");
//      symbol that represents object in text file         
        setObjectAsSymbol("@");
//      point to where assets are to display object (?) not sure if I can put a setter here for img name
        objectImgName = "resources/SokobanImages/WarehouseKeeper.png";
        this.setIcon(new ImageIcon(objectImgName));            
    }
    
}
