
package sokoban;

/**
 *
 * @author Adam
 */
public class WarehouseKeeper extends MoveableMapElement {
    
    public WarehouseKeeper(int newX, int newY){
//      calls methods/properties of MoveableMapElements
        super(newX, newY);
//      name of object
        objectName = "WarehouseKeeper";
//      symbol that represents object in text file         
        objectAsSymbol = "@";
    
}
}
